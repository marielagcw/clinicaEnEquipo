package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Domicilio {

    /* ---------------------------------------------------------------------------------------- */
    // 1- ATRIBUTOS
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="street")
    private String calle;
    @Column(name="number")
    private Integer numero;
    @Column(name="city")
    private String localidad;
    @Column(name="state")
    private String provincia;

    /**
     *  Aclaración
     *  No hay relación porque el vínculo con paciente es unidireccional (solamente el paciente puede acceder al domicilio
    */

    /* ---------------------------------------------------------------------------------------- */
    // 2- GETTERS → para que los pueda leer Jackson

    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public Integer getId() {
        return id;
    }

    /* ---------------------------------------------------------------------------------------- */
    // 3- SETTERS

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // TO_STRING → no sería necesario salvo para imprimir en consola algún mensaje en desarrollo
}

/**
 *  Aclaración:
 * No agregamos un repository de domicilio porque hicimos un cascade que se maneja desde paciente *
 */
