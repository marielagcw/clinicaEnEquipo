package com.example.demo.controller;

import com.example.demo.dto.TurnoDTO;
import com.example.demo.service.impl.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="/turnos")
@CrossOrigin(origins = "http://localhost:3000")
public class TurnoController {

    @Autowired
    private TurnoService service;

    // MÉTODOS CRUD

    /* ---------------------------------------------------------------------*/

    // GUARDAR
    @PostMapping
    public void postTurno(@RequestBody TurnoDTO turnoDto) {
        service.save(turnoDto);
    }

    /* ---------------------------------------------------------------------*/
    // GET ALL
    @GetMapping
    public List<TurnoDTO> getAll() {
        return service.findAll();
    }

    /* ---------------------------------------------------------------------*/
    // GET POR ID
    @GetMapping(path = "/{id}")
    public ResponseEntity<TurnoDTO> getById(@PathVariable Integer id) {
        TurnoDTO turnoResponse = service.findById(id);
        return ResponseEntity.ok(turnoResponse);
    }

    /* ---------------------------------------------------------------------*/
    // DELETE POR ID
    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

    /* ---------------------------------------------------------------------*/
    // PUT → modificar turno
    @PutMapping(path = "/{id}")
    public void update(@PathVariable Integer id, @RequestBody TurnoDTO turnoDto) {
        turnoDto.setId(id);
        service.update(turnoDto);
    }

}
