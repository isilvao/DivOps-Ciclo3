package com.example.udea.AplicacionIngresoEgreso.services;

import com.example.udea.AplicacionIngresoEgreso.entities.ListMovimientoDinero;
import com.example.udea.AplicacionIngresoEgreso.entities.MovimientoDinero;

import java.util.ArrayList;

public class MovimientoDineroService {

    private ListMovimientoDinero listMovimientoDinero;

    public MovimientoDineroService() {
        listMovimientoDinero = new ListMovimientoDinero();
    }

    public ArrayList<MovimientoDinero> getAll() {
        return listMovimientoDinero.getMovimientosDinero();
    }

    public MovimientoDinero addMovimiento(MovimientoDinero movimientoDinero) {
        return listMovimientoDinero.addMovimiento(movimientoDinero);
    }

    public MovimientoDinero updateMovimiento(MovimientoDinero movimientoDinero) {
        return listMovimientoDinero.updateMovimiento(movimientoDinero);
    }

    public MovimientoDinero deleteMovimiento(int id) {
        return listMovimientoDinero.deleteMovimiento(id);
    }

    public MovimientoDinero findMovimientoById(int id) {
        return listMovimientoDinero.findMovimiento(id);
    }

}

