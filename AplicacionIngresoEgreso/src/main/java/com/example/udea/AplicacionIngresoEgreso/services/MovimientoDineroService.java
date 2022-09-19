package com.example.udea.AplicacionIngresoEgreso.services;

import com.example.udea.AplicacionIngresoEgreso.entities.MovimientoDinero;
import com.example.udea.AplicacionIngresoEgreso.repositories.MovimientoDineroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientoDineroService {

    private MovimientoDineroRepository movimientoRepositorio;

    public MovimientoDineroService(MovimientoDineroRepository movimientoRepositorio) {
        this.movimientoRepositorio = movimientoRepositorio;
    }

    public List<MovimientoDinero> getAll() {
        return movimientoRepositorio.findAll();
    }

    public MovimientoDinero addMovimiento(MovimientoDinero movimientoDinero) {
        return movimientoRepositorio.save(movimientoDinero);
    }

    public MovimientoDinero updateMovimiento(MovimientoDinero movimientoDinero) {
        return movimientoRepositorio.save(movimientoDinero);
    }

    public MovimientoDinero deleteMovimiento(int id) {
        Optional<MovimientoDinero> movimiento= movimientoRepositorio.findById(id);
        if (movimiento.isPresent()) {
            movimientoRepositorio.delete(movimiento.get());
            return movimiento.get();
        }
        return null;


    }

    public MovimientoDinero findMovimientoById(int id) {
        Optional<MovimientoDinero> movimiento= movimientoRepositorio.findById(id);
        if (movimiento.isPresent()) {
            return movimiento.get();
        }
        return null;
    }

}

