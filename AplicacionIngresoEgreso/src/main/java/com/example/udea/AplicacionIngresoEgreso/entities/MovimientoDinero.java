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
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;

    public MovimientoDinero(int id, double monto, String concepto, Empleado empleado) {
        this.id = id;
        this.monto = monto;
        this.concepto = concepto;
        this.empleado = empleado;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
