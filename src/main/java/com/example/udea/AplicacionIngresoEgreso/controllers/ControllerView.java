package com.example.udea.AplicacionIngresoEgreso.controllers;

import com.example.udea.AplicacionIngresoEgreso.entities.Empleado;
import com.example.udea.AplicacionIngresoEgreso.entities.Empresa;
import com.example.udea.AplicacionIngresoEgreso.entities.MovimientoDinero;
import com.example.udea.AplicacionIngresoEgreso.entities.User;
import com.example.udea.AplicacionIngresoEgreso.services.EmpleadoService;
import com.example.udea.AplicacionIngresoEgreso.services.EmpresaService;
import com.example.udea.AplicacionIngresoEgreso.services.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ControllerView {

    private EmpresaService empresaService;
    private EmpleadoService empleadoService;
    private UserService userService;

    public ControllerView(EmpresaService empresaService, EmpleadoService empleadoService, UserService userService) {
        this.empresaService = empresaService;
        this.empleadoService = empleadoService;
        this.userService = userService;
    }

    @GetMapping()
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        if(principal!=null){
            User user = this.userService.getOrCreateUser(principal.getClaims());
            model.addAttribute("user", user);
            model.addAttribute("profile", principal.getClaims());
        }
        model.addAttribute("title", "Página principal");

        return "index.html";
    }

    @GetMapping("/empresas")
        public String empresas(Model model, @AuthenticationPrincipal OidcUser principal){

        model.addAttribute("title", "Lista de empresas");
        model.addAttribute("empresas", empresaService.getAll());
        if (principal != null) {
            model.addAttribute("profile", principal.getClaims());
        }

        return "empresas.html";
    }

    @GetMapping("/quienesSomos")
    public String quienesSomos (Model model, @AuthenticationPrincipal OidcUser principal){
        model.addAttribute("title", "Quienes somos");

        if (principal != null) {
            model.addAttribute("profile", principal.getClaims());
        }

        return "quienesSomos.html";
    }

    @GetMapping("/empresa/{nit}")
    public String updateEmpresa (Model model, @AuthenticationPrincipal OidcUser principal, @PathVariable String nit){
        model.addAttribute("Empresa", empresaService.findByNit(nit));
        if (principal != null) {
            model.addAttribute("profile", principal.getClaims());
            User user = this.userService.getOrCreateUser(principal.getClaims());
            List<Empleado> empleados = empleadoService.getAll();
            for (Empleado empleado : empleados) {
                if (empleado.getCorreo().equals(user.getEmail())) {
                    userService.setEmpleadoCedula(user.getEmail(), empleado.getCedula());
                    model.addAttribute("esAdmin", empleadoService.findEmployeeById(user.getEmpleadoCedula()).isEsAdministrativo());
                    model.addAttribute("empleado", empleadoService.findEmployeeById(user.getEmpleadoCedula()));
                }
            }
        }
        else {
            model.addAttribute("esAdmin", false);
        }
        if (nit.equals("860025792-3")){
            return "Renault.html";
        }
        else if (nit.equals("9014020731")){
            return "Ferrari.html";
        }
        else if (nit.equals("9009476919")){
            return "BMW.html";
        }
        else{
            return "index.html";
        }
    }

    @GetMapping("/newEmpleado/{nit}")
    public String newEmpleado(Model model, @AuthenticationPrincipal OidcUser principal, @PathVariable String nit){
        model.addAttribute("title", "Nuevo empleado");
        model.addAttribute("Empleado", new Empleado());
        model.addAttribute("Empresa", empresaService.findByNit(nit));
        if (principal != null) {
            model.addAttribute("profile", principal.getClaims());
            return "newEmpleado.html";
        }
        else {
            return "index.html";
        }
    }

    @GetMapping("/empresa/{nit}/compras/{nombreCarro}/{referencia}")
    public String compras(Model model, @AuthenticationPrincipal OidcUser principal, @PathVariable String nit, @PathVariable String nombreCarro, @PathVariable String referencia){
        model.addAttribute("title", "Compras");
        model.addAttribute("Empresa", empresaService.findByNit(nit));
        model.addAttribute("Carro", nombreCarro);
        model.addAttribute("empleados", empleadoService.getAll());
        model.addAttribute("MovimientoDinero", new MovimientoDinero());
        model.addAttribute("referencia", referencia);
        if (principal != null) {
            model.addAttribute("profile", principal.getClaims());
        }
        return "compras.html";
    }
}

