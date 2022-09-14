package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.entities.Empleado;
import com.example.udea.AplicacionIngresoEgreso.services.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private EmpleadoService empleadoServicio;

    public EmpleadoController(EmpleadoService empleadoServicio) {
        this.empleadoServicio = empleadoServicio;
    }

    public EmpleadoController() {
    }

    @GetMapping
    public List<Empleado> getAll() {
        return empleadoServicio.getAll();
    }

    @PostMapping
    public Empleado addEmployee(@RequestBody Empleado emplado) {
        return empleadoServicio.addEmployee(emplado);
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
