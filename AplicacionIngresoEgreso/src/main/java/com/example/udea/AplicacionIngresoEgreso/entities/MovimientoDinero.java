package com.example.udea.AplicacionIngresoEgreso.entities;

import javax.persistence.*;

@Entity
@Table(name = "movimiento_dinero")
public class MovimientoDinero {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private double monto;
    @Column(nullable = false)
    private String concepto;
    @Column(nullable = true)
    private String cedula;

    public MovimientoDinero(int id, double monto, String concepto, String cedula) {
        this.id = id;
        this.monto = monto;
        this.concepto = concepto;
        this.cedula = cedula;
    }

    public MovimientoDinero() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
