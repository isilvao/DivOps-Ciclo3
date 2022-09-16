package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.services.EmpresaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/views")
public class ControllerView {

private EmpresaService empresaService;


    @GetMapping
    public String index(){
        return "index.html";
    }

    @GetMapping("/listEmpresa")
    public String viewIndex(Model model){
        model.addAttribute()
        model.addAttribute("title", "Pagina Principal");
        return "ListEmpresa.html";
    }

    @GetMapping("/Empresa")
    public String empresas(Model model){
        model.addAttribute("title", "Vista de empresas");
        return "Empresa.html";
    }
}

