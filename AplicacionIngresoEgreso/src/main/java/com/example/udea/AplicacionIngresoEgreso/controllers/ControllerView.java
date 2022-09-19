package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.entities.Empleado;
import com.example.udea.AplicacionIngresoEgreso.services.EmpleadoService;
import com.example.udea.AplicacionIngresoEgreso.services.EmpresaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerView {

    private EmpresaService empresaService;
    private EmpleadoService empleadoService;

    public ControllerView(EmpresaService empresaService, EmpleadoService empleadoService) {
        this.empresaService = empresaService;
        this.empleadoService = empleadoService;
    }

    @GetMapping()
    public String index(Model model){
        model.addAttribute("title", "Página principal");

        return "index.html";
    }

    @GetMapping("/empresas")
        public String empresas(Model model){

        model.addAttribute("title", "Lista de empresas");
        model.addAttribute("empresas", empresaService.getAll());

        return "empresas.html";
    }

    @GetMapping("/empleados")
        public String empleados(Model model){

        model.addAttribute("title", "Lista de empleados");
        model.addAttribute("empleados", empleadoService.getAll());
        return "empleados.html";
    }

    @GetMapping("/quienesSomos")
    public String quienesSomos (Model model){
        model.addAttribute("title", "Quienes somos");

        return "quienesSomos.html";
    }

    @GetMapping("/login")
    public String login (Model model){
        model.addAttribute("title", "Iniciar sesión");

        return "login.html";
    }

    @GetMapping("/register")
    public String register (Model model){
        model.addAttribute("title", "Registrarse");
        model.addAttribute("Empleado", new Empleado());
        return "register.html";
    }
}

