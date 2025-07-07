package com.forohub.infrastructure.controller;

import com.forohub.application.port.in.ForohubService;
import com.forohub.domain.model.Curso;
import com.forohub.infrastructure.mapper.MapperApi;
import com.forohub.infrastructure.model.CursoRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/forohub")
public class ForohubController {

    @Autowired
    private ForohubService forohubService;

    @GetMapping("/saludo")
    public ResponseEntity<String> saludo() {
        return new ResponseEntity<>("Hola Diego", HttpStatus.OK);
    }

    @GetMapping("/obtenerCursos")
    public ResponseEntity<List<CursoRes>> obtenerCursos() {
        List<Curso> listaDeCursos = forohubService.obtenerCursos();
        List<CursoRes> listCursoRes = listaDeCursos.stream()
                .map(MapperApi::fromCursoToCursoRes)
                .toList();
        return new ResponseEntity<>(listCursoRes, HttpStatus.OK);
    }
}
