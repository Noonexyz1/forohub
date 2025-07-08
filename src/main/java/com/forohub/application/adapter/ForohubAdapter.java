package com.forohub.application.adapter;

import com.forohub.application.port.in.ForohubService;
import com.forohub.application.port.out.persistence.ForohubPersistence;
import com.forohub.domain.model.Curso;
import com.forohub.domain.model.Topico;
import com.forohub.domain.model.Usuario;

import java.util.List;

public class ForohubAdapter implements ForohubService {

    private final ForohubPersistence forohubPersistence;

    public ForohubAdapter(ForohubPersistence forohubPersistence) {
        this.forohubPersistence = forohubPersistence;
    }


    @Override
    public Topico crearTopico(Topico topico) {
        return forohubPersistence.crearTopico(topico);
    }

    @Override
    public List<Topico> mostrarTopicos() {
        return forohubPersistence.mostrarTopicos();
    }

    @Override
    public Topico mostrarTopicoPorId(Long id) {
        return forohubPersistence.mostrarTopicoPorId(id);
    }

    @Override
    public Topico actualizarTopico(Topico topico) {
        return forohubPersistence.actualizarTopico(topico);
    }

    @Override
    public void eliminarTopicoPorId(Long id) {
        forohubPersistence.eliminarTopicoPorId(id);
    }

    @Override
    public List<Curso> obtenerCursos() {
        List<Curso> listCursos = forohubPersistence.listaDeCursos();
        return listCursos;
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> listaUsuarios = this.forohubPersistence.listaDeUsuarios();
        return listaUsuarios;
    }
}
