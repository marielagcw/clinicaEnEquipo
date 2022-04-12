package com.example.demo.service;


import com.example.demo.entity.Odontologo;
import com.example.demo.entity.Turno;

import java.util.List;

public interface IOdontologoService {
/* ──────────────
       MÉTODOS CRUD
     ────────────── */

    // GUARDAR
    Odontologo save(Odontologo odontologo);

    // BUSCAR TODOS
    List<Odontologo> findAll();

    // BUSCAR POR ID
    Odontologo findById(Integer id);

    // ELIMINAR POR ID
    void deleteById(Integer id);

    // MODIFICAR POR ID
    void modificar(Odontologo odontologo);

}
