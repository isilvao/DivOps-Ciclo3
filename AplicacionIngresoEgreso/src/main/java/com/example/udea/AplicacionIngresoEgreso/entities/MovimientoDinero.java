package com.example.udea.AplicacionIngresoEgreso.entities;

public class MovimientoDinero {

    private int id;
    private double monto;
    private String concepto;
    private String empleado;

    public MovimientoDinero(int id, double monto, String concepto, String empleado) {
        this.id = id;
        this.monto = monto;
        this.concepto = concepto;
        this.empleado = empleado;
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

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
}
