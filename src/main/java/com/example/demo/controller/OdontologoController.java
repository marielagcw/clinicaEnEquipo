package com.example.demo.controller;

import com.example.demo.entity.Odontologo;
import com.example.demo.service.impl.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/odontologos")
@CrossOrigin(origins = "http://localhost:3000")
public class OdontologoController {

    // ATRIBUTOS
    @Autowired
    private OdontologoService service;

    /* No necesitamos constructor para inyectar dependencias porque usamos Spring
    public OdontologoController(OdontologoService service) {

        this.service = service;
    }
    */

    /* ---------------------------------------------------------------------*/
    // POST GUARDAR
    /*
      RequestBody
      A mi método post necesito pasarle un body,
      sabemos que desde front nos van a enviar un
      "odontólogo" para poder guardar (si no no tendríamos nada
      para guardar) por eso con la anotación RequestBody
      le estamos indicando a Java que nos va a venir un
      objeto con forma de "odontólogo" que ya está
      en condiciones de ser usado por java porque Spring
      se encargó de adecuarlo.
     */

    /**
     * El método guardar que estoy llamando dentro del post en realidad es el método
     * que traje del OdontólogoRepository
     */

    // GUARDAR
    @PostMapping
    public void postOdontologo(@RequestBody Odontologo odontologo) {
        service.save(odontologo);
    }

    /* ---------------------------------------------------------------------*/
    // GET ALL
    @GetMapping
    public List<Odontologo> getAll() {
        return service.findAll();
    }

    /* ---------------------------------------------------------------------*/
    // Explicación en el método Get

    /**
     * ResponseEntity
     * Usamos ResponseEntity que es una clase de spring
     * Esta clase lo que hace es permitirme manipular
     * las respuestas que le voy a enviar al front.
     * El front necesita un formato adecuado, por eso
     * esta clase lo que hace es guardar mis datos en modo
     * Java pero entregarselos al front en modo objeto Response
     * para que después el front lo pueda manipular
     * mediante JSON (es la parte del Fetch que vemos en JS)
     */

    // GET POR ID
    @GetMapping(path = "/{id}")
    public ResponseEntity<Odontologo> getById(@PathVariable Integer id) {
        Odontologo odontologoResponse = service.findById(id);
        return ResponseEntity.ok(odontologoResponse);
    }

    /* ---------------------------------------------------------------------*/
    // DELETE POR ID
    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

    /* ---------------------------------------------------------------------*/
    // PUT → modificar odontólogo
    @PutMapping(path = "{id}")
    public void putById(@PathVariable Integer id, @RequestBody Odontologo odontologo) {
        /*
         * SET ID
         * Desde el front tenemos un body con todos los datos menos el id por un lado y el id solo por otro (en la url)
         * por eso lo que hacemos es setear primero el id al odontologo para mandarle un odontologo completo a la capa de persistencia
         *  */
        odontologo.setId(id);
        service.update(odontologo);
    }
}
