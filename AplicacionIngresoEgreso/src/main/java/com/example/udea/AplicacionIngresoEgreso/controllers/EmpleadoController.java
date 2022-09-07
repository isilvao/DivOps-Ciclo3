package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.entities.Empleado;
import com.example.udea.AplicacionIngresoEgreso.services.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private EmpleadoService empleadoServicio;

    public EmpleadoController() {
        empleadoServicio = new EmpleadoService();
    }

    @GetMapping
    public ArrayList<Empleado> getAll() {
        return empleadoServicio.getAll();
    }

    @PostMapping
    public Empleado addEmployee(@RequestBody Empleado emplado) {
        return empleadoServicio.addEmployee(emplado);
    }

    @GetMapping("/{id}")
    public Empleado findEmployeeById(@PathVariable int id) {
        return empleadoServicio.findEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Empleado updateEmployee(@RequestBody Empleado empleado) {
        return empleadoServicio.updateEmployee(empleado);
    }

    @DeleteMapping("/{id}")
    public Empleado deleteEmployee(@PathVariable int id) {
        return empleadoServicio.deleteEmployee(id);

    }

}
