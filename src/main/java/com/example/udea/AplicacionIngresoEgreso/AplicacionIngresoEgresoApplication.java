package com.example.udea.AplicacionIngresoEgreso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AplicacionIngresoEgresoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AplicacionIngresoEgresoApplication.class, args);
	}
}
