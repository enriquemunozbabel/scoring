package com.vehicle.renting.models;

public class Direccion {
    private int direccionId;
    private String nombreCalle;
    private String numero;
    private String piso;
    private String puerta;
    private String escalera;
    private String otroDato;
    private String codPostal;
    private String municipio;
    private String provinciaCod;
    private int tipoViaId;

    public Direccion(int direccionId, String nombreCalle, String numero, String piso, String puerta, String escalera, String otroDato, String codigoPostal, String municipio, String provincia, int tipoViaId) {
        this.direccionId = direccionId;
        this.nombreCalle = nombreCalle;
        this.numero = numero;
        this.piso = piso;
        this.puerta = puerta;
        this.escalera = escalera;
        this.otroDato = otroDato;
        this.codPostal = codigoPostal;
        this.municipio = municipio;
        this.provinciaCod = provincia;
        this.tipoViaId = tipoViaId;
    }


    public int getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(int direccionId) {
        this.direccionId = direccionId;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public String getOtroDato() {
        return otroDato;
    }

    public void setOtroDato(String otroDato) {
        this.otroDato = otroDato;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codigoPostal) {
        this.codPostal = codigoPostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvinciaCod() {
        return provinciaCod;
    }

    public void setProvinciaCod(String provincia) {
        this.provinciaCod = provincia;
    }

    public int getTipoViaId() {
        return tipoViaId;
    }

    public void setTipoViaId(int tipoViaId) {
        this.tipoViaId = tipoViaId;
    }
}
