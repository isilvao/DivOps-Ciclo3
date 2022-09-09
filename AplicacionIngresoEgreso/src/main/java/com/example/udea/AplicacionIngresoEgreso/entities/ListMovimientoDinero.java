package com.example.udea.AplicacionIngresoEgreso.entities;

import java.util.ArrayList;

public class ListMovimientoDinero {

    private ArrayList<MovimientoDinero> movimientosDinero;

    public ListMovimientoDinero () {movimientosDinero = new ArrayList<>();}

    public MovimientoDinero findMovimiento(int id) {
        for(MovimientoDinero movimientoDinero: movimientosDinero) {
            if(movimientoDinero.getId() == id) {
                return movimientoDinero;
            }
        }
        return null;
    }

    public MovimientoDinero addMovimiento (MovimientoDinero movimientoDinero){
        if(findMovimiento(movimientoDinero.getId()) == null){
            movimientosDinero.add(movimientoDinero);
            return movimientoDinero;
        }
        return null;
    }

    public MovimientoDinero updateMovimiento (MovimientoDinero movimientoDinero){
        MovimientoDinero movimientoDinero1 = findMovimiento(movimientoDinero.getId());
        if (movimientoDinero1 != null){
            movimientosDinero.set(movimientosDinero.indexOf(movimientoDinero1), movimientoDinero);
            return movimientoDinero;
        }
        return null;
    }

    public MovimientoDinero deleteMovimiento (int id){
        MovimientoDinero movimientoDinero = findMovimiento(id);
        if (movimientoDinero != null){
            movimientosDinero.remove(movimientoDinero);
            return movimientoDinero;
        }
        return null;
    }

    public ArrayList<MovimientoDinero> getMovimientosDinero() {
        return movimientosDinero;
    }

    public void setMovimientosDinero(ArrayList<MovimientoDinero> movimientosDinero) {
        this.movimientosDinero = movimientosDinero;
    }
}
