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

    public Empresa findByNit(int id){
        return listaEmpresa.findEmpresa(id);
    }

    public Empresa addEmpresa(Empresa empresa){
        return listaEmpresa.addEmpresa(empresa) ? empresa : null;
    }

    public Empresa updateEmpresa(Empresa empresa){
        return listaEmpresa.updateEmpresa(empresa);
    }

    public Empresa deleteEmpresa(int id){
        return listaEmpresa.deleteEmpresa(listaEmpresa.findEmpresa(id));
    }
}
