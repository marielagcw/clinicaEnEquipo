package com.example.demo.service.impl;

import com.example.demo.entity.Odontologo;
import com.example.demo.repository.IOdontologoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
    public Odontologo findById(Integer id) {
        Odontologo odontologoEncontrado = odontologoRepository.findById(id).orElse(null);
        return odontologoEncontrado;
    }
    /* ----------------------------------------------------------------------------- */

    // ELIMINAR POR ID
    public void deleteById(Integer id) {
        odontologoRepository.deleteById(id);
    }
    /* ----------------------------------------------------------------------------- */

    // MODIFICAR POR ID
    public void update(Odontologo odontologo) {
        odontologoRepository.saveAndFlush(odontologo);
    }
    /* ----------------------------------------------------------------------------- */
    
}
