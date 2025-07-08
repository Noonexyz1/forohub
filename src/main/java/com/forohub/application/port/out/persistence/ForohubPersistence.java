package com.forohub.application.port.out.persistence;

import com.forohub.domain.model.Curso;
import com.forohub.domain.model.Topico;
import com.forohub.domain.model.Usuario;

import java.util.List;

public interface ForohubPersistence {
    Topico crearTopico(Topico topico);
    List<Topico> mostrarTopicos();
    Topico mostrarTopicoPorId(Long id);
    Topico actualizarTopico(Topico topico);
    void eliminarTopicoPorId(Long id);
    List<Curso> listaDeCursos();
    List<Usuario> listaDeUsuarios();
}


