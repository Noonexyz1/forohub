package com.forohub.domain.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {
    private Long id;
    private String nombre;
    private String categoria;
}
