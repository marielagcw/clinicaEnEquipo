package com.example.demo.service;


import com.example.demo.entity.Odontologo;

import java.util.List;

public interface IOdontologoService {

   /* ──────────────
       MÉTODOS CRUD
     ────────────── */

    // GUARDAR → devolvemos Odontologo para saber qué ID tiene asignado
    Odontologo save(Odontologo odontologo);

    // BUSCAR TODOS
    List<Odontologo> findAll();

    // BUSCAR POR ID
    Odontologo getById(Integer id);

    // ELIMINAR POR ID
    void deleteById(Integer id);

    // MODIFICAR POR ID
    void update(Odontologo odontologo);

}
