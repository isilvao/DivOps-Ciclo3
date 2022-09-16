package com.example.udea.AplicacionIngresoEgreso.repositories;

import com.example.udea.AplicacionIngresoEgreso.entities.Empresa;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}

