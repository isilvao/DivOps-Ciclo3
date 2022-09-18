package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.services.EmpleadoService;
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
    private EmpleadoService empleadoService;

    public ControllerView(EmpresaService empresaService, EmpleadoService empleadoService) {
        this.empresaService = empresaService;
        this.empleadoService = empleadoService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("title", "Página principal");

        return "index.html";
    }

    @GetMapping("/Empresas")
        public String empresas(Model model){

        model.addAttribute("title", "Lista de empresas");
        model.addAttribute("empresas", empresaService.getAll());

        return "Empresas.html";
    }

    @GetMapping("/Empleados")
        public String empleados(Model model){

        model.addAttribute("title", "Lista de empleados");
        model.addAttribute("empleados", empleadoService.getAll());

        return "Empleados.html";
    }
}

