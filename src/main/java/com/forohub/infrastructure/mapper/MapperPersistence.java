package com.forohub.infrastructure.mapper;

import com.forohub.domain.model.Curso;
import com.forohub.infrastructure.persistence.bd.entity.CursoEntity;

public class MapperPersistence {
    public static Curso fromCursoEntityToCurso(CursoEntity cursoEntity) {
        return Curso.builder()
                .id(cursoEntity.getId())
                .nombre(cursoEntity.getNombre())
                .categoria(cursoEntity.getCategoria())
                .build();
    }
}
