package com.example.udea.AplicacionIngresoEgreso.services;

import com.example.udea.AplicacionIngresoEgreso.entities.Empleado;
import com.example.udea.AplicacionIngresoEgreso.entities.ListEmpleado;

import java.util.ArrayList;

public class EmpleadoService {

    private ListEmpleado listaEmpleados;

    public EmpleadoService() {
        listaEmpleados = new ListEmpleado();
    }

    public ArrayList<Empleado> getAll() {
        return listaEmpleados.getEmpleados();
    }

    public Empleado addEmployee(Empleado empleado) {
        return listaEmpleados.addEmployee(empleado);
    }

    public Empleado updateEmployee(Empleado empleado) {
        return listaEmpleados.updateEmployee(empleado);
    }
    public Empleado deleteEmployee(int id) {
        return listaEmpleados.deleteEmployee(id);
    }

    public Empleado findEmployeeById(int id) {
        return listaEmpleados.findEmployee(id);
    }


}
