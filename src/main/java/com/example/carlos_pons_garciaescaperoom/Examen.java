package com.example.carlos_pons_garciaescaperoom;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Examen {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idExamen")
    private long idExamen;
    @Basic
    @Column(name = "fecha")
    private Timestamp fecha;
    @Basic
    @Column(name = "nota")
    private Double nota;
    @ManyToOne
    @JoinColumn(name = "idAlumno", referencedColumnName = "idAlumno")
    private Alumno alumno;
    @ManyToOne
    @JoinColumn(name = "idModul", referencedColumnName = "idModulo")
    private Modulo modulo;
}
