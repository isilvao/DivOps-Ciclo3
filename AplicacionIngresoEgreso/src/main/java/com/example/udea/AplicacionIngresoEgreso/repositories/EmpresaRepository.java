package com.example.udea.AplicacionIngresoEgreso.repositories;

import com.example.udea.AplicacionIngresoEgreso.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}
