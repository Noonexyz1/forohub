package com.forohub.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Topico {
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;

    //TODO, Quiza un enum
    private String status;

    private Usuario autor;
    private Curso curso;
}
