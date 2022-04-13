package com.example.demo.controller;

import com.example.demo.entity.Paciente;
import com.example.demo.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pacientes")
@CrossOrigin(origins = "http://localhost:3000")
public class PacienteController {
    // ATRIBUTOS
    @Autowired
    private PacienteService service;

    /* ---------------------------------------------------------------------*/
    // POST GUARDAR
    @PostMapping
    public ResponseEntity<String> postPaciente(@RequestBody Paciente paciente) {
        if (bodyValidation(paciente)) {
            service.save(paciente);
            return ResponseEntity.ok("El paciente se guardó con éxito");
        } else return ResponseEntity.badRequest().body("El paciente debe tener todos los campos completos");
    }
    /* ---------------------------------------------------------------------*/

    // GET ALL
    @GetMapping()
    public List<Paciente> getAll() {
        return service.findAll();
    }
    /* ---------------------------------------------------------------------*/

    // GET POR ID
    @GetMapping(path = "/{id}")
    public ResponseEntity<Paciente> getById(@PathVariable Integer id) {
        Paciente pacienteResponse = service.getById(id);
        return ResponseEntity.ok(pacienteResponse);
    }

    /* ---------------------------------------------------------------------*/
    // DELETE POR ID
    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

    /* ---------------------------------------------------------------------*/
    // PUT
    @PutMapping(path = "/{id}")
    public void putById(@PathVariable Integer id, @RequestBody Paciente paciente) {
        service.update(id, paciente);
    }

    /* ---------------------------------------------------------------------*/
    // MÉTODOS DE VALIDACIÓN DE DATOS
    public Boolean bodyValidation(Paciente paciente) {
        boolean b;
        if (paciente.getApellido() != null && paciente.getNombre() != null && paciente.getDni() != null) {
            b = true;
        } else b = false;
        return b;
    }

}
