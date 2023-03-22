package com.vehicle.renting.models;

import javax.validation.constraints.NotNull;

public class Profesion {
    @NotNull
    private int profesionId;
    @NotNull
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
