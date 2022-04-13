package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointment")
public class Turno {

    /* ----------------------------------------------------------------------------------------- */
    // ATRIBUTOS

    /** GENERATED VALUE
    Anotación que indica cómo se genera el Id en la base de datos → lo ideal sería investigar cómo trabaja la base de datos que estaríamos usando...
    * Sabemos que H2 trabaja con un generador de id secuencial, y por defecto GeneratedValue usa SEQUENCE, pero podría ser de otra forma y podríamos usar IDENTITY, aunque hay bases de datos como protgress que no tienen generadores de id y en ese caso si quisieramos un ID autogenerado deberíamos resolverlo desde acá indicando el tipo de id que queremos generar y de qué manera...
     * Podemos usar SequenceGenerator para que cada entidad siga su propio id, ya que si lo dejamos por defecto lo que va a suceder es que se van a ir sumando los id de manera global con cada dato que entra a la base de datos...
    */

    @Id
    @SequenceGenerator(name = "appointment_sequence", sequenceName = "appointment_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "appointment_sequence")
    private Integer id;

    @Column(name = "date")
    private LocalDateTime fechaHora;


    /** MANY TO ONE * JOIN COLUMN
     * Turnos a pacientes → varios turnos a un paciente = Many To One
     * Por defecto es eager porque solo trae un paciente
     * Nombre de la columna de la base de datos que voy a representar en mi atributo y le indico el referenceColumnName para decirle cuál es la columna de la otra tabla (en la base de datos) que estoy relacionando...
     */
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false, referencedColumnName = "id")
    private Paciente paciente;

    // Turnos a odontólogos → varios turnos a un mismo odontólogo
    @ManyToOne // Por defecto es eager
    @JoinColumn(name = "dentist_id", referencedColumnName = "id")
    private Odontologo odontologo;



    /* ----------------------------------------------------------------------------------------- */

    // GETTERS
    public Integer getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    /* ----------------------------------------------------------------------------------------- */

    //SETTERS
    public void setId(Integer id) {
        this.id = id;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}

