package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.entities.MovimientoDinero;
import com.example.udea.AplicacionIngresoEgreso.services.MovimientoDineroService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/movements")
public class MovimientoDineroController {

    private MovimientoDineroService movimientoDineroService;

    public MovimientoDineroController() {
        movimientoDineroService = new MovimientoDineroService();
    }

    @GetMapping
    public ArrayList<MovimientoDinero> getAll() {
        return movimientoDineroService.getAll();
    }

    @PostMapping
    public MovimientoDinero addMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero) {
        return movimientoDineroService.addMovimiento(movimientoDinero);
    }

    @GetMapping("/{id}")
    public MovimientoDinero findMovimientoById(@PathVariable int id) {
        return movimientoDineroService.findMovimientoById(id);
    }

    @PutMapping("/{id}")
    public MovimientoDinero updateMovimiento(@RequestBody MovimientoDinero movimientoDinero) {
        return movimientoDineroService.updateMovimiento(movimientoDinero);
    }

    @DeleteMapping("/{id}")
    public MovimientoDinero deleteMovimiento(@PathVariable int id){
        return movimientoDineroService.deleteMovimiento(id);
    }

}
