package com.example.udea.AplicacionIngresoEgreso.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id @Column(name="cedula",nullable = false)
    private String cedula;
    @Column(name ="nombre", nullable = false)
    private String nombre;
    @Column(nullable = false, name = "correo")
    private String correo;

    @Column(name = "empresa_nit")
    private String empresaNit;

    @Column(nullable = false, name = "es_admin")
    private boolean esAdministrativo;

    public Empleado( String cedula, String nombre, String correo, boolean esAdministrativo, String empresaNit) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.esAdministrativo = esAdministrativo;
        this.empresaNit = empresaNit;
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

    public String getEmpresaNit() {
        return empresaNit;
    }
    public void setEmpresaNit(String empresaNit) {
        this.empresaNit = empresaNit;
    }

    public boolean isEsAdministrativo() {
        return esAdministrativo;
    }

    public void setEsAdministrativo(boolean esAdministrativo) {
        this.esAdministrativo = esAdministrativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return esAdministrativo == empleado.esAdministrativo && cedula.equals(empleado.cedula) && nombre.equals(empleado.nombre) && correo.equals(empleado.correo) && empresaNit.equals(empleado.empresaNit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula, nombre, correo, empresaNit, esAdministrativo);
    }

    @Override
    public java.lang.String toString() {
        return "Empleado{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", empresaNit=" + empresaNit +
                ", esAdministrativo=" + esAdministrativo +
                '}';
    }
}
