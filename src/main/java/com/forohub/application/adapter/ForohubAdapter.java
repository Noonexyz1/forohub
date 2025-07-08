package com.forohub.application.adapter;

import com.forohub.application.port.in.ForohubService;
import com.forohub.application.port.out.persistence.ForohubPersistenceAbstract;
import com.forohub.domain.model.Curso;
import com.forohub.domain.model.Topico;
import com.forohub.domain.model.Usuario;

import java.util.List;

public class ForohubAdapter implements ForohubService {

    private final ForohubPersistenceAbstract forohubPersistenceAbstract;

    public ForohubAdapter(ForohubPersistenceAbstract forohubPersistenceAbstract) {
        this.forohubPersistenceAbstract = forohubPersistenceAbstract;
    }


    @Override
    public Topico crearTopico(Topico topico) {
        return forohubPersistenceAbstract.crearTopico(topico);
    }

    @Override
    public List<Topico> mostrarTopicos() {
        return forohubPersistenceAbstract.mostrarTopicos();
    }

    @Override
    public Topico mostrarTopicoPorId(Long id) {
        return forohubPersistenceAbstract.mostrarTopicoPorId(id);
    }

    @Override
    public Topico actualizarTopico(Topico topico) {
        return forohubPersistenceAbstract.actualizarTopico(topico);
    }

    @Override
    public void eliminarTopicoPorId(Long id) {
        forohubPersistenceAbstract.eliminarTopicoPorId(id);
    }

    @Override
    public List<Curso> obtenerCursos() {
        List<Curso> listCursos = forohubPersistenceAbstract.listaDeCursos();
        return listCursos;
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> listaUsuarios = this.forohubPersistenceAbstract.listaDeUsuarios();
        return listaUsuarios;
    }
}
