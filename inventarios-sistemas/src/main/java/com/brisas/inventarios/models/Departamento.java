package com.brisas.inventarios.models;

import jakarta.persistence.*;
@Entity
@Table(name = "departamentos")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public  Departamento(){}

}
