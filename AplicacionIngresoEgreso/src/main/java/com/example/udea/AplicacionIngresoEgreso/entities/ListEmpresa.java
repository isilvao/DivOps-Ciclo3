package com.example.udea.AplicacionIngresoEgreso.entities;

import java.util.ArrayList;

public class ListEmpresa {
    private String descripcion;

    private static ArrayList<Empresa> lista;

    public ListEmpresa(String descripcion) {
        this.descripcion = descripcion;
        lista = new ArrayList<>();
    }

    public static Empresa findEmpresa(int id){
        for (Empresa empresa: lista) {
            if (empresa.getId()==id){
                return empresa;
            }
        }
        return null;
    }

    public boolean addEmpresa(Empresa empresa){
        if (findEmpresa(empresa.getId()) == null){
            lista.add(empresa);
            return true;
        }
        return false;
    }

    public Empresa updateEmpresa(Empresa empresa){
        Empresa empresa1 = findEmpresa(empresa.getId());
        if (empresa1 != null){
            lista.set(lista.indexOf(empresa1), empresa);

            return lista.get(lista.indexOf(empresa));
        }
        return null;
    }

    public Empresa deleteEmpresa(Empresa empresa){
        if (lista.contains(empresa)){
            lista.remove(empresa);
            return empresa;
        }
        return null;
    }

    public ArrayList<Empresa> getLista() {
        return (ArrayList<Empresa>) lista.clone();
    }
}
