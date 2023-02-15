package com.example.carlos_pons_garciaescaperoom;

import jakarta.persistence.*;

import java.util.List;

@Entity
@SecondaryTable(name = "Docencia", pkJoinColumns = @PrimaryKeyJoinColumn(name = "idModulo"))
public class Modulo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idModulo")
    private long idModulo;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "modulo")
    private List<Examen> examenes;

}
