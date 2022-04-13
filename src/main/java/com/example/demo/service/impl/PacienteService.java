package com.example.demo.service.impl;

import com.example.demo.entity.Paciente;
import com.example.demo.entity.Turno;
import com.example.demo.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    /**
     * INYECCIÓN DE DEPENDENCIAS
     * Necesitamos hacer una inyección de dependencias para poder usar los métodos de nuestra interface Repository en nuestro servicio. Como venimos usando Spring le agregamos la anotación @Autowired para indicarle que ese atributo viene de la clase Repository
     */
    @Autowired
    IPacienteRepository pacienteRepository;

   /* ──────────────
     MÉTODOS CRUD
   ────────────── */

    // GUARDAR
    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
    /* ----------------------------------------------------------------------------- */

    // BUSCAR TODOS
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }
    /* ----------------------------------------------------------------------------- */

    // BUSCAR POR ID
    public Paciente getById(Integer id) {
        return pacienteRepository.getById(id);
    }
    /* ----------------------------------------------------------------------------- */

    // ELIMINAR POR ID
    public void deleteById(Integer id) {
        pacienteRepository.deleteById(id);
    }
    /* ----------------------------------------------------------------------------- */

    // MODIFICAR POR ID
    public void update(Integer id, Paciente paciente) {
        pacienteRepository.save(paciente);
    }
    /* ----------------------------------------------------------------------------- */
}
