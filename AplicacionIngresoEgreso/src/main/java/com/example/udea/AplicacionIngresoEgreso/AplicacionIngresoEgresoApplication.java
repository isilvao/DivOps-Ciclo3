package com.example.udea.AplicacionIngresoEgreso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class AplicacionIngresoEgresoApplication {
	@GetMapping("/")
	public String getRoot(@RequestParam(name = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	@GetMapping("/hello/{name}")
	public String getHello(@PathVariable(required = false) String name) {
		return String.format("Hello mi loco %s!", name);
	}

	public static void main(String[] args) {
		SpringApplication.run(AplicacionIngresoEgresoApplication.class, args);
	}
}
