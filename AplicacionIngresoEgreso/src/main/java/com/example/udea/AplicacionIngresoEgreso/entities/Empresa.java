package com.example.udea.AplicacionIngresoEgreso.entities;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "empresa")
public class Empresa {

    @Column(nullable = false) @Id
    private String nit;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String correo;

    public Empresa() {
    }
    public Empresa(String nombre, String nit, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return nombre.equals(empresa.nombre) && nit.equals(empresa.nit)
                && direccion.equals(empresa.direccion) && telefono.equals(empresa.telefono)
                && correo.equals(empresa.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nit, direccion, telefono, correo);
    }

    @Override
    public java.lang.String toString() {
        return "Empresa{" +
                ", nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}