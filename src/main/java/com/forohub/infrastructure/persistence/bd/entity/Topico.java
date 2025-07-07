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
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;

    //TODO, Quiza un enum
    private String status;

    @ManyToOne
    private Usuario autor;

    @ManyToOne
    private Curso curso;


    @OneToMany(mappedBy = "topico")
    private List<Respuesta> respuestas;
}
