package com.example.demo.service;

import com.example.demo.dto.TurnoDTO;
import com.example.demo.entity.Turno;
import com.example.demo.repository.ITurnoRepository;
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
    ObjectMapper mapeador;

   /* ──────────────
     MÉTODOS CRUD
   ────────────── */

    // GUARDAR
    public TurnoDTO save(TurnoDTO turnoDto) {
        Turno turnoAGuardar = mapeador.convertValue(turnoDto, Turno.class);
        TurnoDTO guardado = mapeador.convertValue(turnoRepository.save(turnoAGuardar), TurnoDTO.class);
        return guardado;
    }
    /* ----------------------------------------------------------------------------- */

    // BUSCAR TODOS
    public List<TurnoDTO> findAll() {
        List<TurnoDTO> listaTurnosDto = new ArrayList<>();
        List<Turno> listaTurnos = turnoRepository.findAll();
        for (Turno turno : listaTurnos) {
            listaTurnosDto.add(mapeador.convertValue(turno, TurnoDTO.class));
        }
        return listaTurnosDto;
    }
    /* ----------------------------------------------------------------------------- */

    // BUSCAR POR ID
    public TurnoDTO getById(Integer id) {
        TurnoDTO encontrado = mapeador.convertValue(turnoRepository.getById(id), TurnoDTO.class);
        return encontrado;
    }
    /* ----------------------------------------------------------------------------- */

    // ELIMINAR POR ID
    public void deleteById(Integer id) {
        turnoRepository.deleteById(id);
    }
    /* ----------------------------------------------------------------------------- */

    // MODIFICAR POR ID
    public void update(Integer id, TurnoDTO turnoDto) {
        Turno turnoAModificar = mapeador.convertValue(turnoDto, Turno.class);
    }

    /* ----------------------------------------------------------------------------- */

}
