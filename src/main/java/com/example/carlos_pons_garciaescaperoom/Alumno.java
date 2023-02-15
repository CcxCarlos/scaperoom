package com.example.carlos_pons_garciaescaperoom;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alumno {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idAlumno")
    private long idAlumno;
    @Basic
    @Column(name = "apellidos")
    private String apellidos;
    @Basic
    @Column(name = "edad")
    private Integer edad;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "repetidor")
    private Boolean repetidor;
    @OneToMany(mappedBy = "alumno")
    private List<Examen> examenes;

}