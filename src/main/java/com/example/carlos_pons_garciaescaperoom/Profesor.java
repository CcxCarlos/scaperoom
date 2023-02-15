package com.example.carlos_pons_garciaescaperoom;

import jakarta.persistence.*;

@Entity
@SecondaryTable(name = "Docencia", pkJoinColumns = @PrimaryKeyJoinColumn(name = "idProfesor"))
public class Profesor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idProfesor")
    private long idProfesor;
    @Basic
    @Column(name = "nombre")
    private String nombre;

}
