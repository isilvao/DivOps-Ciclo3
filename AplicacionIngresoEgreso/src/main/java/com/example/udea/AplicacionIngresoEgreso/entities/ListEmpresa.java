package com.example.udea.AplicacionIngresoEgreso.entities;

import java.util.ArrayList;

public class ListEmpresa {
    private String descripcion;

    private static ArrayList<Empresa> lista;

    public ListEmpresa(String descripcion) {
        this.descripcion = descripcion;
        lista = new ArrayList<>();
    }

    public static Empresa findEmpresa(String nit){
        for (Empresa empresa: lista) {
            if (empresa.getNit().equals(nit)){
                return empresa;
            }
        }
        return null;
    }

    public boolean addEmpresa(Empresa empresa){
        if (findEmpresa(empresa.getNit()) == null){
            lista.add(empresa);
            return true;
        }
        return false;
    }

    public Empresa updateEmpresa(Empresa empresa){
        Empresa empresa1 = findEmpresa(empresa.getNit());
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
