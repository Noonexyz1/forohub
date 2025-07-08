package com.forohub.infrastructure.http.rest.model;

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
