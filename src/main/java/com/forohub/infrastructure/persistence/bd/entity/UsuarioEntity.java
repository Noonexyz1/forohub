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
@Table(name = "usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correoElectronico;
    private String contrasena;

    //Aqui hago mis mapeos
    @OneToMany(mappedBy = "autor")
    private List<TopicoEntity> topicos;

    @OneToMany(mappedBy = "autor")
    private List<RespuestaEntity> respuestas;

    @OneToMany(mappedBy = "usuario")
    private List<PerfilEntity> perfiles;
}
