package com.forohub.infrastructure.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForohubController {

    @GetMapping("/saludo")
    public ResponseEntity<String> saludo() {
        return new ResponseEntity<>("Hola Diego", HttpStatus.OK);
    }

}
