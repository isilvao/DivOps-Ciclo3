package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.entities.Empresa;
import com.example.udea.AplicacionIngresoEgreso.services.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    private EmpresaService empresaService;

    public EmpresaController() {
        empresaService = new EmpresaService();
    }

    @GetMapping
    public ArrayList<Empresa> getAll(){
        return empresaService.getAll();
    }

    @GetMapping("/{id}")
    public Empresa findByNit(@PathVariable int id){
        return empresaService.findByNit(id);
    }

    @PostMapping
    public Empresa addEmpresa(@RequestBody Empresa empresa){
        return empresaService.addEmpresa(empresa);
    }

    @PutMapping("/{id}")
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/{id}")
    public Empresa deleteEmpresa(@PathVariable int id){
        return empresaService.deleteEmpresa(id);
    }


}
