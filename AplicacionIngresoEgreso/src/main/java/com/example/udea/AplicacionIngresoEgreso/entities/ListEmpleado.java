package com.example.udea.AplicacionIngresoEgreso.entities;

import java.util.ArrayList;

public class ListEmpleado {

    private ArrayList<Empleado> empleados;


    public ListEmpleado() {
        empleados = new ArrayList<>();
    }
    public Empleado findEmployee(int id) {
        for(Empleado empleado: empleados) {
            if(empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }

    public Empleado addEmployee(Empleado empleado) {
        if(findEmployee(empleado.getId()) == null) {
            empleados.add(empleado);
            return empleado;
        }
        return null;
    }

    public Empleado updateEmployee(Empleado empleado) {
        Empleado empleadoOld = findEmployee(empleado.getId());
        if(empleadoOld != null) {
            empleados.set(empleados.indexOf(empleadoOld), empleado);
            return empleado;
        }
        return null;
    }

    public Empleado deleteEmployee(int id) {
        Empleado empleado = findEmployee(id);
        if(empleado != null) {
            empleados.remove(empleado);
            return empleado;
        }
        return null;
    }
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
