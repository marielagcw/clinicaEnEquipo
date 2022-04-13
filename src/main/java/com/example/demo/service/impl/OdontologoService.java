package com.example.demo.service.impl;

import com.example.demo.entity.Odontologo;
import com.example.demo.repository.IOdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoService {

    @Autowired
    IOdontologoRepository odontologoRepository;

   /* ──────────────
     MÉTODOS CRUD
   ────────────── */

    // GUARDAR
    public Odontologo save(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }
    /* ----------------------------------------------------------------------------- */

    // BUSCAR TODOS
    public List<Odontologo> findAll() {
        return odontologoRepository.findAll();
    }
    /* ----------------------------------------------------------------------------- */

    // BUSCAR POR ID
    public Odontologo getById(Integer id) {
        return odontologoRepository.getById(id);
    }
    /* ----------------------------------------------------------------------------- */

    // ELIMINAR POR ID
    public void deleteById(Integer id) {
        odontologoRepository.deleteById(id);
    }
    /* ----------------------------------------------------------------------------- */

    // MODIFICAR POR ID
    public void update(Integer id, Odontologo odontologo) {
        odontologoRepository.save(odontologo);
    }
    /* ----------------------------------------------------------------------------- */
    
}
