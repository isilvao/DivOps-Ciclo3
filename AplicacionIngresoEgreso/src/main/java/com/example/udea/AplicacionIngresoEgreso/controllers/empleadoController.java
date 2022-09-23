package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.entities.Empleado;
import com.example.udea.AplicacionIngresoEgreso.services.EmpleadoService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/Empleados")
public class empleadoController {

    public EmpleadoService empleadoServicio;

    public empleadoController(EmpleadoService empleadoServicio) {
        this.empleadoServicio = empleadoServicio;
    }

    @GetMapping
    public List<Empleado> getAll() {
        return empleadoServicio.getAll();
    }

    @PostMapping
    public RedirectView addEmployee(@ModelAttribute Empleado empleado, Model model) {
        model.addAttribute(empleado);
        this.empleadoServicio.addEmployee(empleado);


        return new RedirectView("/empresas");
    }

    @GetMapping("/{cedula}")
    public Empleado findEmployeeById(@PathVariable String cedula) {
        return empleadoServicio.findEmployeeById(cedula);
    }

    @PutMapping("/{cedula}")
    public Empleado updateEmployee(@RequestBody Empleado empleado) {
        return empleadoServicio.updateEmployee(empleado);
    }

    @DeleteMapping("/{cedula}")
    public Empleado deleteEmployee(@PathVariable String cedula) {
        return empleadoServicio.deleteEmployee(cedula);
    }

}
