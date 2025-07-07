package com.forohub.infrastructure.persistence.bd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "respuesta")
public class RespuestaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private String fechaCreacion;
    private String solucion;


    @ManyToOne
    private TopicoEntity topico;

    @ManyToOne
    private UsuarioEntity autor;
}
