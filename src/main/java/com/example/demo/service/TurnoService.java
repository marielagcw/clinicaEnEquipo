package com.example.demo.service;

import com.example.demo.entity.Turno;
import com.example.demo.repository.ITurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService implements ITurnoService {

    /**
     * INYECCIÓN DE DEPENDENCIAS
     * Necesitamos hacer una inyección de dependencias para poder usar los métodos de nuestra interface Repository en nuestro servicio. Como venimos usando Spring le agregamos la anotación @Autowired para indicarle que ese atributo viene de la clase Repository
     */
    @Autowired
    ITurnoRepository turnoRepository;

   /* ──────────────
     MÉTODOS CRUD
   ────────────── */

    // GUARDAR
    public Turno save(Turno turno) {
        return turnoRepository.save(turno);
    }
    /* ----------------------------------------------------------------------------- */

    // BUSCAR TODOS
    public List<Turno> findAll() {
        return turnoRepository.findAll();
    }
    /* ----------------------------------------------------------------------------- */

    // BUSCAR POR ID
    public Turno findById(Integer id) {
        return turnoRepository.getById(id);
    }
    /* ----------------------------------------------------------------------------- */

    // ELIMINAR POR ID
    public void deleteById(Integer id) {
        turnoRepository.deleteById(id);
    }
    /* ----------------------------------------------------------------------------- */

    // MODIFICAR POR ID
    public void modificar(Turno turno) {
        turnoRepository.save(turno);
    }
    /* ----------------------------------------------------------------------------- */

}
