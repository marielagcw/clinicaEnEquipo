package com.example.demo.dto;

import com.example.demo.entity.Odontologo;
import com.example.demo.entity.Paciente;
import java.time.LocalDateTime;

public class TurnoDTO {
    // ATRIBUTOS
    private Integer id;
    private LocalDateTime fechaHora;
    private Paciente paciente;
    private Odontologo odontologo;

    public Integer getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
