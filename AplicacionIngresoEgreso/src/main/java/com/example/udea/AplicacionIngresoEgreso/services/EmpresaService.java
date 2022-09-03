package com.example.udea.AplicacionIngresoEgreso.services;

import com.example.udea.AplicacionIngresoEgreso.entities.Empresa;
import com.example.udea.AplicacionIngresoEgreso.entities.ListEmpresa;

import java.util.ArrayList;

public class EmpresaService {
    private ListEmpresa listaEmpresa;

    public EmpresaService(){
        listaEmpresa = new ListEmpresa("Entretenimiento");
    }

    public ArrayList<Empresa> getAll(){
        return listaEmpresa.getLista();
    }
}
