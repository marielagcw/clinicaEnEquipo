package com.example.demo.service;

import com.example.demo.entity.Paciente;

import java.util.List;

public interface IPacienteService {

/* ──────────────
       MÉTODOS CRUD
     ────────────── */

    // GUARDAR
    Paciente save(Paciente paciente);

    // BUSCAR TODOS
    List<Paciente> findAll();

    // BUSCAR POR ID
    Paciente getById(Integer id);

    // ELIMINAR POR ID
    void deleteById(Integer id);

    // MODIFICAR POR ID
    void update(Paciente paciente);

}
