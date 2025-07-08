package com.forohub.infrastructure.http.rest.mapper;

import com.forohub.domain.model.Curso;
import com.forohub.domain.model.Usuario;
import com.forohub.infrastructure.http.rest.model.CursoRes;
import com.forohub.infrastructure.http.rest.model.UsuarioRes;

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
