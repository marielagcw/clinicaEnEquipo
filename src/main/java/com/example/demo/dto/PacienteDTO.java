package com.example.demo.dto;

public class PacienteDTO {
    // ATRIBUTOS
    private Integer id;
    private String nombre;
    private String apellido;

    // CONSTRUCTOR

    public PacienteDTO(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // GETTERS

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
