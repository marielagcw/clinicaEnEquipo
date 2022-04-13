package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * ACLARACIONES:
 * Solamente se accede al domicilio a través del paciente
 * Si no le damos la anotación @Column por defecto es el nombre del atributo
 * En este caso cambiamos los nombres de las tablas y columnas solamente para diferenciar cuándo estamos trabajando con campos de la base de datos y cuándo estamos trabajando con nuestros objetos que representan esos campos en nuestro sistema
 */
@Entity
@Table(name = "patient")
public class Paciente {

    /* ---------------------------------------------------------------------------------------- */
    // ATRIBUTOS
    @Id
    @SequenceGenerator(name = "patient_sequence", sequenceName = "patient_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_sequence")
    private Integer id;
    @Column(name = "lastname")
    private String apellido;
    @Column(name = "name")
    private String nombre;
    @Column(name = "dni")
    private String dni;
    @Column(name = "date")
    private LocalDate fechaDeIngreso;

    /**
     * CASCADE
     * Remove → Elimina el domicilio cuando se elimina el paciente
     * Refresh → Permite editar el domicilio cuando editamos el paciente
     * Persist → permite persistir el domicilio cuando persistimos el paciente (guardar)
     * Usamos Cascade solamente para mostrar cómo se usa... podríamos haberlo obviado
     */
    /**
     * ONE TO ONE
     * Usa por defecto Eager
     * También estamos asumiendo que la relación domicilio/paciente es unidireccional y solamente podemos acceder a domicilio a través de paciente. Por eso no hay que agregar nada en nuestra entidad Domicilio.
     * */

    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Domicilio domicilio;

    /**
     * USO DE SET Y HASHSET
     * Set elimina duplicados y optimiza también los métodos de búsqueda en comparación con List.
     * Instanciamos en un HashSet porque no queremos que nos arroje NULL cuando aún no tenemos ningún turno... en ese caso, si no existiera turno, la lista Set vendría como nula y eso nos deriva en NullPointerException... Por eso en todo caso preferimos tener una lista vacía (HashSet)
     */

    @OneToMany(mappedBy = "paciente")
    @JsonIgnore
    private Set<Turno> listadoTurnos = new HashSet<>();

    /* ---------------------------------------------------------------------------------------- */

    // GETTERS

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public Integer getId() {
        return id;
    }

    /* ---------------------------------------------------------------------------------------- */

    // SETTERS
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }
}
