package com.example.demo.service.impl;

import com.example.demo.entity.Odontologo;
import com.example.demo.entity.Paciente;
import com.example.demo.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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
    public Paciente findById(Integer id) {
        Paciente pacienteEncontrado = pacienteRepository.findById(id).orElse(null);
        return pacienteEncontrado;
    }
    /* ----------------------------------------------------------------------------- */

    // ELIMINAR POR ID
    public void deleteById(Integer id) {
        pacienteRepository.deleteById(id);
    }
    /* ----------------------------------------------------------------------------- */

    // MODIFICAR POR ID
    public void update(Paciente paciente) {
        pacienteRepository.save(paciente);
    }
    /* ----------------------------------------------------------------------------- */
}
