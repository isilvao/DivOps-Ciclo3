package com.example.udea.AplicacionIngresoEgreso.entities;

public class Empleado {

    private int id;
    private String cedula;
    private String nombre;
    private String correo;
    /***
     * Aquí va el Id de la empresa asociada
     */
    private String empresa;
    private boolean esAdministrativo;

    public Empleado(int id, String cedula, String nombre, String correo, String empresa, boolean esAdministrativo) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.esAdministrativo = esAdministrativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isEsAdministrativo() {
        return esAdministrativo;
    }

    public void setEsAdministrativo(boolean esAdministrativo) {
        this.esAdministrativo = esAdministrativo;
    }
}
