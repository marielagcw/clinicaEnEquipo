package com.example.demo.dto;

import com.example.demo.entity.Odontologo;
import com.example.demo.entity.Paciente;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import java.time.LocalDateTime;

public class TurnoDTO {
    // ATRIBUTOS
    private Integer id;
    private LocalDateTime fechaHora;
    @JsonIncludeProperties({"id", "apellido", "nombre"})
    private Paciente paciente;
    @JsonIgnoreProperties({"numeroMatricula", "listadoTurnos"})
    private Odontologo odontologo;
}
