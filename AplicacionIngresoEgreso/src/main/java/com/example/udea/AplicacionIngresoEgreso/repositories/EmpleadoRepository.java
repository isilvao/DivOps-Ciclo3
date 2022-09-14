package com.example.udea.AplicacionIngresoEgreso.repositories;

import com.example.udea.AplicacionIngresoEgreso.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, String> {
}
