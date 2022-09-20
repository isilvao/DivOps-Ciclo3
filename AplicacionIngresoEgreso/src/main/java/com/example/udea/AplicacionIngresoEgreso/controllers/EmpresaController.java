package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.entities.Empresa;
import com.example.udea.AplicacionIngresoEgreso.services.EmpresaService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/Empresas")
public class EmpresaController {
    public EmpresaService empresaService;


    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping
    public List<Empresa> getAll(){
        return empresaService.getAll();
    }

    @GetMapping("/{id}")
    public Empresa findByNit(@PathVariable int id){
        return empresaService.findById(id);
    }

    @PostMapping
    public RedirectView addEmpresa(@ModelAttribute Empresa empresa, Model model){
        model.addAttribute(empresa);
        this.empresaService.addEmpresa(empresa);
        return new RedirectView("/empresas");
    }

    @PutMapping("/{id}")
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/{id}")
    public RedirectView deleteEmpresa(@ModelAttribute Empresa empresa, Model model){
        model.addAttribute(empresa);
        this.empresaService.deleteEmpresa(empresa.getId());

        return new RedirectView("/empresas");
    }
}
