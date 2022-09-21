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
    /***
     * Aquí va el Id de la empresa asociada
     */
    @ManyToOne
    @JoinColumn(name = "empresa_nit")
    private Empresa empresa;
    @Column(nullable = false, name = "es_admin")
    private boolean esAdministrativo;
    @OneToOne
    @JoinColumn(nullable = true, name = "user")
    private User user;

    public Empleado( String cedula, String nombre, String correo, Empresa empresa, boolean esAdministrativo, User user) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.esAdministrativo = esAdministrativo;
        this.user = user;
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

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return esAdministrativo == empleado.esAdministrativo && cedula.equals(empleado.cedula) && nombre.equals(empleado.nombre) && correo.equals(empleado.correo) && empresa.equals(empleado.empresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula, nombre, correo, empresa, esAdministrativo);
    }

    @Override
    public java.lang.String toString() {
        return "Empleado{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", empresa=" + empresa +
                ", esAdministrativo=" + esAdministrativo +
                '}';
    }
}
