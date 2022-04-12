package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="dentist")
public class Odontologo {

    // 1- ATRIBUTO
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="identity_number")
    private Integer numeroMatricula;
    @Column(name="lastname")
    private String apellido;
    @Column(name="name")
    private String nombre;
    // Odontologo → turnos por cada odontólogo tengo varios turnos
    // Llamamos siempre al atributo en las relaciones (@OneToMany... etc)
    @OneToMany(mappedBy = "odontologo") // Por defecto va a ser lazy
    @JsonIgnore
    // List → arrayList
    // Set → HashSet → lo instanciamos para que no sea nunca null
    private Set<Turno> listadoTurnos = new HashSet<>();


    // 2- GETTERS
    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getId() {
        return id;
    }

    // 3- SETTERS
    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
