package com.example.demo.service.impl;

import com.example.demo.dto.TurnoDTO;
import com.example.demo.entity.Paciente;
import com.example.demo.entity.Turno;
import com.example.demo.repository.IPacienteRepository;
import com.example.demo.repository.ITurnoRepository;
import com.example.demo.service.ITurnoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TurnoService implements ITurnoService {

    /**
     * INYECCIÓN DE DEPENDENCIAS
     * Necesitamos hacer una inyección de dependencias para poder usar los métodos de nuestra interface Repository en nuestro servicio. Como venimos usando Spring le agregamos la anotación @Autowired para indicarle que ese atributo viene de la clase Repository
     */
    @Autowired
    ITurnoRepository turnoRepository;
    @Autowired
    ObjectMapper mapper;

   /* ──────────────
     MÉTODOS CRUD
   ────────────── */

    // GUARDAR
    public TurnoDTO save(TurnoDTO turnoDto) {
        Turno turnoAGuardar = mapper.convertValue(turnoDto, Turno.class);
        Turno turnoGuardado = turnoRepository.save(turnoAGuardar);
        TurnoDTO turnoGuardadoDto = mapper.convertValue(turnoGuardado, TurnoDTO.class);
        return turnoGuardadoDto;
    }
    /* ----------------------------------------------------------------------------- */

    // BUSCAR TODOS
    public List<TurnoDTO> findAll() {
        List<TurnoDTO> listaTurnosDto = new ArrayList<>();
        List<Turno> listaTurnos = turnoRepository.findAll(); // findAll del JPA
        for (Turno turno : listaTurnos) {
            listaTurnosDto.add(mapper.convertValue(turno, TurnoDTO.class));
        }
        return listaTurnosDto;
    }
    /* ----------------------------------------------------------------------------- */

    // BUSCAR POR ID
    public TurnoDTO getById(Integer id) {
        TurnoDTO encontrado = mapper.convertValue(turnoRepository.getById(id), TurnoDTO.class);
        return encontrado;
    }
    /* ----------------------------------------------------------------------------- */

    // ELIMINAR POR ID
    public void deleteById(Integer id) {
        turnoRepository.deleteById(id);
    }
    /* ----------------------------------------------------------------------------- */

    // MODIFICAR POR ID
    public void update(TurnoDTO turnoDto) {
        Turno turnoModificar = mapper.convertValue(turnoDto, Turno.class);
        turnoRepository.save(turnoModificar);
    }

    /* ----------------------------------------------------------------------------- */

    @Service
    public static class PacienteService {

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
}
