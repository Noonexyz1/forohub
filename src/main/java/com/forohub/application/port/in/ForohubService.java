package com.forohub.application.port.in;

import com.forohub.domain.model.Curso;
import com.forohub.domain.model.Topico;

import java.util.List;

public interface ForohubService {
    Topico crearTopico(Topico topico);
    List<Topico> mostrarTopicos();
    Topico mostrarTopicoPorId(Long id);
    Topico actualizarTopico(Topico topico);
    void eliminarTopicoPorId(Long id);
    List<Curso> obtenerCursos();
}


