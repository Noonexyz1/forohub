package com.forohub.infrastructure.mapper;

import com.forohub.domain.model.Curso;
import com.forohub.domain.model.Usuario;
import com.forohub.infrastructure.model.CursoRes;
import com.forohub.infrastructure.model.UsuarioRes;

public class MapperApi {

    public static CursoRes fromCursoToCursoRes(Curso curso) {
        return CursoRes.builder()
                .id(curso.getId())
                .nombre(curso.getNombre())
                .categoria(curso.getCategoria())
                .build();
    }

    public static UsuarioRes fromUsuarioToUsuarioRes(Usuario usuario) {
        return UsuarioRes.builder()
                .id(usuario.getId())
                .nombre(usuario.getNombre())
                .build();
    }

}
