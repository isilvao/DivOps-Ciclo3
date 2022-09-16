package com.example.udea.AplicacionIngresoEgreso.repositories;

import com.example.udea.AplicacionIngresoEgreso.entities.ListEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListEmpresaRepository extends JpaRepository<ListEmpresa, Integer> {

}
