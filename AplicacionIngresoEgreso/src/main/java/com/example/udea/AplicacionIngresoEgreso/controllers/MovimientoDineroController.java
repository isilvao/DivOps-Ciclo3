package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.entities.MovimientoDinero;
import com.example.udea.AplicacionIngresoEgreso.services.MovimientoDineroService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/movimientos")
public class MovimientoDineroController {

    private MovimientoDineroService movimientoDineroService;

    public MovimientoDineroController(MovimientoDineroService movimientoDineroService) {
        this.movimientoDineroService = movimientoDineroService;
    }

    @GetMapping
    public List<MovimientoDinero> getAll() {
        return movimientoDineroService.getAll();
    }

    @PostMapping
    public RedirectView addMovimientoDinero(Model model, @ModelAttribute MovimientoDinero movimientoDinero) {
        movimientoDinero.setMonto(860360778.40);
        this.movimientoDineroService.addMovimiento(movimientoDinero);
        return new RedirectView("/empresas");
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

