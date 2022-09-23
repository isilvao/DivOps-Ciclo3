package com.example.udea.AplicacionIngresoEgreso.entities;

import com.example.udea.AplicacionIngresoEgreso.services.EmpleadoService;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "image")
    private String image;

    @Column(name = "auth0Id", unique = true)
    private String auth0Id;

    @Column(name = "empleado_cedula", nullable = true)
    private String empleadoCedula;

    public User(String email, String image, String auth0Id, String empleadoCedula) {
        this.email = email;
        this.image = image;
        this.auth0Id = auth0Id;
        this.empleadoCedula = empleadoCedula;
    }

    public User(String email, String image, String auth0Id) {
        this.email = email;
        this.image = image;
        this.auth0Id = auth0Id;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public String getEmpleadoCedula() {
        return empleadoCedula;
    }

    public void setEmpleadoCedula(String empleadoCedula) {
        this.empleadoCedula = empleadoCedula;
    }
}
