package com.example.demo.service;

import com.example.demo.dto.TurnoDTO;

import java.util.List;

public interface ITurnoService {

    /* ──────────────
       MÉTODOS CRUD
     ────────────── */

    // GUARDAR
    TurnoDTO save(TurnoDTO turnoDTO);

    // BUSCAR TODOS
    List<TurnoDTO> findAll();

    // BUSCAR POR ID
    TurnoDTO getById(Integer id);

    // ELIMINAR POR ID
    void deleteById(Integer id);

    // MODIFICAR POR ID
    void update(TurnoDTO turnoDto);

}
