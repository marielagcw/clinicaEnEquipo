package com.example.demo.dto;

import com.example.demo.entity.Odontologo;
import com.example.demo.entity.Paciente;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class TurnoDTO {
    // ATRIBUTOS
    private Integer id;
    private LocalDateTime fechaHora;
    @JsonProperty("paciente")
    private Paciente paciente;
    @JsonProperty("odontologo")
    private Odontologo odontologo;
}
