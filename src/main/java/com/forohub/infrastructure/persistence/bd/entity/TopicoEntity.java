package com.forohub.infrastructure.persistence.bd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "topico")
public class TopicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;

    //TODO, Quiza un enum
    private String status;

    @ManyToOne
    private UsuarioEntity autor;

    @ManyToOne
    private CursoEntity curso;


    @OneToMany(mappedBy = "topico")
    private List<RespuestaEntity> respuestas;
}
