package com.forohub.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Respuesta {
    private Long id;
    private String mensaje;
    private Topico topico;
    private String fechaCreacion;
    private Usuario autor;
    private String solucion;
}
