package com.forohub.infrastructure.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRes {
    private Long id;
    private String nombre;
}
