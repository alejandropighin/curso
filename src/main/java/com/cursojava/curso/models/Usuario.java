package com.cursojava.curso.models;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String password;

}
