package com.example.demo.service;


import com.example.demo.entity.Odontologo;
import java.util.List;
import java.util.Optional;

public interface IOdontologoService {

   /* ──────────────
       MÉTODOS CRUD
     ────────────── */

    // GUARDAR → devolvemos Odontologo para saber qué ID tiene asignado
    Odontologo save(Odontologo odontologo);

    // BUSCAR TODOS
    List<Odontologo> findAll();

    // BUSCAR POR ID
    Optional<Odontologo> findById(Integer id);

    // ELIMINAR POR ID
    void deleteById(Integer id);

    // MODIFICAR POR ID
    void update(Odontologo odontologo);

}
