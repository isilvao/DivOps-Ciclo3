package com.example.udea.AplicacionIngresoEgreso.services;

import com.example.udea.AplicacionIngresoEgreso.entities.Empleado;
import com.example.udea.AplicacionIngresoEgreso.repositories.EmpleadoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmpleadoService {

    private EmpleadoRepository empleadoRepositorio;


    public EmpleadoService(EmpleadoRepository empleadoRepositorio) {
        this.empleadoRepositorio = empleadoRepositorio;
    }

    public List<Empleado> getAll() {
        return empleadoRepositorio.findAll();
    }

    public Empleado addEmployee(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    public Empleado updateEmployee(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }
    public Empleado deleteEmployee(String cedula) {

        Optional<Empleado> empleado= empleadoRepositorio.findById(cedula);
        if (empleado.isPresent()) {
            empleadoRepositorio.delete(empleado.get());
            return empleado.get();
        }
        return null;
    }

    public Empleado findEmployeeById(String cedula) {
        Optional<Empleado> empleado= empleadoRepositorio.findById(cedula);
        if (empleado.isPresent()) {
            return empleado.get();
        }
        return null;
    }


}
