package com.example.udea.AplicacionIngresoEgreso.services;

import com.example.udea.AplicacionIngresoEgreso.entities.Empresa;
import com.example.udea.AplicacionIngresoEgreso.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    private EmpresaRepository empresaropositorio;

    public EmpresaService(EmpresaRepository empresaropositorio) {
        this.empresaropositorio = empresaropositorio;
    }

    public List<Empresa> getAll(){
        return empresaropositorio.findAll();
    }

    public Empresa findById(int id){
        Optional<Empresa> empresa= empresaropositorio.findById(id);
        if (empresa.isPresent()) {
            return empresa.get();
        }
        return null;
    }

    public Empresa addEmpresa(Empresa empresa){
        return empresaropositorio.save(empresa);
    }

    public Empresa updateEmpresa(Empresa empresa){
        return empresaropositorio.save(empresa);
    }

    public Empresa deleteEmpresa(int id){
        Optional<Empresa> empresa= empresaropositorio.findById(id);
        if (empresa.isPresent()) {
            empresaropositorio.delete(empresa.get());
            return empresa.get();
        }
        return null;
    }
}
