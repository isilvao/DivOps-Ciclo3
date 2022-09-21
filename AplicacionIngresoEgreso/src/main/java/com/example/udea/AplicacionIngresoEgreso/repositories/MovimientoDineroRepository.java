package com.example.udea.AplicacionIngresoEgreso.repositories;

import com.example.udea.AplicacionIngresoEgreso.entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero, Integer  >{
}
