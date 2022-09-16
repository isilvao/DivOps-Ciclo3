package com.example.udea.AplicacionIngresoEgreso.services;

import com.example.udea.AplicacionIngresoEgreso.entities.ListEmpresa;
import com.example.udea.AplicacionIngresoEgreso.repositories.ListEmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListEmpresaService {
    private ListEmpresaRepository listEmpresaRepository;

    public ListEmpresaService(ListEmpresaRepository listEmpresaRepository) {
        this.listEmpresaRepository = listEmpresaRepository;
    }
    public ListEmpresa addListEmpresa(ListEmpresa listEmpresa){
        return listEmpresaRepository.save(listEmpresa);
    }
    public List<ListEmpresa> getAllListEmpresa(){
        return listEmpresaRepository.findAll();
    }
    public ListEmpresa findById(int id){
        Optional<ListEmpresa> optEmpresa = listEmpresaRepository.findById(id);
        if(optEmpresa.isPresent()){
            return optEmpresa.get();
        }
        return null;
    }
}
