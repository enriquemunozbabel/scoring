package com.vehicle.renting.models;

public class Profesion {

    private int profesionId;
    private String descripcion;

    public Profesion(int profesionId, String descripcion) {
        this.profesionId = profesionId;
        this.descripcion = descripcion;
    }

    public int getProfesionId() {
        return profesionId;
    }

    public void setProfesionId(int profesionId) {
        this.profesionId = profesionId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
