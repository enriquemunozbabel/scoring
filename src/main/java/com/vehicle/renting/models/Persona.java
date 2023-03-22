package com.vehicle.renting.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Persona {
    @NotNull
    private int personaId;
    private boolean direccionDomicilioIgualNotificacion = true;
    @NotNull
    private String nombre;
    @NotNull
    private String apellido1;
    private String apellido2;
    @NotNull
    private Direccion direccionDomicilio;
    @NotNull
    private Direccion direccionNotificacion;
    @NotNull
    private String nif;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date fechaNacimiento;
    @NotNull
    private String nacionalidad;
    private int scoring;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date fechaScoring;

    public Persona(int personaId, boolean direccionDomicilioIgualNotificacion, String nombre, String apellido1, String apellido2, Direccion direccionDomicilio, Direccion direccionNotificacion, String nif, Date fechaNacimiento, String nacionalidad, int scoring, Date fechaScoring) {
        this.personaId = personaId;
        this.direccionDomicilioIgualNotificacion = direccionDomicilioIgualNotificacion;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccionDomicilio = direccionDomicilio;
        this.direccionNotificacion = direccionNotificacion;
        this.nif = nif;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.scoring = scoring;
        this.fechaScoring = fechaScoring;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public boolean isDireccionDomicilioIgualNotificacion() {
        return direccionDomicilioIgualNotificacion;
    }

    public void setDireccionDomicilioIgualNotificacion(boolean direccionDomicilioIgualNotificacion) {
        this.direccionDomicilioIgualNotificacion = direccionDomicilioIgualNotificacion;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public Direccion getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(Direccion direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public Direccion getDireccionNotificacion() {
        return direccionNotificacion;
    }

    public void setDireccionNotificacion(Direccion direccionNotificacion) {
        this.direccionNotificacion = direccionNotificacion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getScoring() {
        return scoring;
    }

    public void setScoring(int scoring) {
        this.scoring = scoring;
    }

    public Date getFechaScoring() {
        return fechaScoring;
    }

    public void setFechaScoring(Date fechaScoring) {
        this.fechaScoring = fechaScoring;
    }
}
