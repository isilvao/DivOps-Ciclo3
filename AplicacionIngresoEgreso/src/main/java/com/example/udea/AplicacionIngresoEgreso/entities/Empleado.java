package com.example.udea.AplicacionIngresoEgreso.entities;

import javax.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    private String cedula;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String correo;
    /***
     * Aquí va el Id de la empresa asociada
     */
    @ManyToOne
    @JoinColumn(name="empresa_id")
    private Empresa empresa;
    @Column(nullable = false)
    private boolean esAdministrativo;

    public Empleado( String cedula, String nombre, String correo, Empresa empresa, boolean esAdministrativo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.esAdministrativo = esAdministrativo;
    }

    public Empleado() {
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean isEsAdministrativo() {
        return esAdministrativo;
    }

    public void setEsAdministrativo(boolean esAdministrativo) {
        this.esAdministrativo = esAdministrativo;
    }
}
