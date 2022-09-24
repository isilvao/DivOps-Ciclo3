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

    @GetMapping("/{nit}")
    public Empresa findByNit(@PathVariable String nit){
        return empresaService.findByNit(nit);
    }

    @PostMapping
    public RedirectView addEmpresa(@ModelAttribute Empresa empresa, Model model){
        model.addAttribute(empresa);
        this.empresaService.addEmpresa(empresa);
        return new RedirectView("/empresas");
    }

    @PutMapping("/{nit}")
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }

    @PatchMapping("/{nit}")
    public RedirectView updateEmpresa(@PathVariable String nit,@ModelAttribute Empresa empresa, Model model){
        model.addAttribute(empresa);
        this.empresaService.updateEmpresa(empresa);
        return new RedirectView("/empresas");
    }

    @DeleteMapping("/{nit}")
    public RedirectView deleteEmpresa(@ModelAttribute Empresa empresa, Model model){
        model.addAttribute(empresa);
        this.empresaService.deleteEmpresa(empresa.getNit());

        return new RedirectView("/empresas");
    }
}
