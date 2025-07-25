package com.forohub.infrastructure.persistence.bd.adapter;

import com.forohub.application.port.out.persistence.ForohubPersistenceAbstract;
import com.forohub.domain.model.Curso;
import com.forohub.domain.model.Topico;
import com.forohub.domain.model.Usuario;
import com.forohub.infrastructure.persistence.bd.mapper.MapperPersistence;
import com.forohub.infrastructure.persistence.bd.entity.CursoEntity;
import com.forohub.infrastructure.persistence.bd.entity.UsuarioEntity;
import com.forohub.infrastructure.persistence.bd.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ForohubPersistenceAdapter implements ForohubPersistenceAbstract {

    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private PerfilRepository perfilRepository;
    @Autowired
    private RespuestaRepository respuestaRepository;
    @Autowired
    private TopicoRepository topicoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public Topico crearTopico(Topico topico) {
        return null;
    }

    @Override
    public List<Topico> mostrarTopicos() {
        return List.of();
    }

    @Override
    public Topico mostrarTopicoPorId(Long id) {
        return null;
    }

    @Override
    public Topico actualizarTopico(Topico topico) {
        return null;
    }

    @Override
    public void eliminarTopicoPorId(Long id) {

    }

    @Override
    public List<Curso> listaDeCursos() {
        List<CursoEntity> listaDeCursosEntity = this.cursoRepository.findAll();
        List<Curso> listaDeCursos = listaDeCursosEntity.stream()
                .map(MapperPersistence::fromCursoEntityToCurso)
                .toList();
        return listaDeCursos;
    }

    @Override
    public List<Usuario> listaDeUsuarios() {
        List<UsuarioEntity> listaUsuariosEntity = this.usuarioRepository.findAll();
        List<Usuario> listaUsuarios = listaUsuariosEntity.stream()
                .map(MapperPersistence::fromUsuarioEntityToUsuario)
                .toList();
        return listaUsuarios;
    }
}
