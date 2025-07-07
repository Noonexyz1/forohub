package com.forohub.infrastructure.mapper;

import com.forohub.domain.model.Curso;
import com.forohub.infrastructure.model.CursoRes;

public class MapperApi {

    public static CursoRes fromCursoToCursoRes(Curso curso) {
        return CursoRes.builder()
                .id(curso.getId())
                .nombre(curso.getNombre())
                .categoria(curso.getCategoria())
                .build();
    }

}
