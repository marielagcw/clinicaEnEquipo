package com.example.demo.service;

import com.example.demo.entity.Turno;

import java.util.List;

public interface ITurnoService {

    /* ──────────────
       MÉTODOS CRUD
     ────────────── */

    // GUARDAR
    Turno save(Turno turno);

    // BUSCAR TODOS
    List<Turno> findAll();

    // BUSCAR POR ID
    Turno findById(Integer id);

    // ELIMINAR POR ID
    void deleteById(Integer id);

    // MODIFICAR POR ID
    void modificar(Turno turno);

}
