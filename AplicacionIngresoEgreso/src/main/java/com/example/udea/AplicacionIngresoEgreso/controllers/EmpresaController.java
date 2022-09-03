package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.entities.Empresa;
import com.example.udea.AplicacionIngresoEgreso.services.EmpresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

public class EmpresaController {
    private EmpresaService empresaService;

    public EmpresaController() {
        empresaService = new EmpresaService();
    }

    @RequestMapping("/empresas")

    @GetMapping
    public ArrayList<Empresa> getAll(){
        return empresaService.getAll();
    }
    @PostMapping
    public Empresa addEmpresa(@RequestBody Empresa empresa){
        return null;
    }
}
