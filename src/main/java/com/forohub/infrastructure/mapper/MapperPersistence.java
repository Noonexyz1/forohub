package com.forohub.infrastructure.mapper;

import com.forohub.domain.model.Curso;
import com.forohub.domain.model.Usuario;
import com.forohub.infrastructure.persistence.bd.entity.CursoEntity;
import com.forohub.infrastructure.persistence.bd.entity.UsuarioEntity;

public class MapperPersistence {
    public static Curso fromCursoEntityToCurso(CursoEntity cursoEntity) {
        return Curso.builder()
                .id(cursoEntity.getId())
                .nombre(cursoEntity.getNombre())
                .categoria(cursoEntity.getCategoria())
                .build();
    }

    public static Usuario fromUsuarioEntityToUsuario(UsuarioEntity usuarioEntity) {
        return Usuario.builder()
                .id(usuarioEntity.getId())
                .nombre(usuarioEntity.getNombre())
                .correoElectronico(usuarioEntity.getCorreoElectronico())
                .contrasena(usuarioEntity.getContrasena())
                .build();
    }
}
