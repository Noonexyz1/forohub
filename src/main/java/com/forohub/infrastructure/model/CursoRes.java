package com.forohub.infrastructure.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CursoRes {
    private Long id;
    private String nombre;
    private String categoria;
}
