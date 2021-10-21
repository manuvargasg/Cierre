package com.cierreOperaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cierreOperaciones.model.Moneda;

public interface MonedasRepository extends JpaRepository<Moneda, Long> {

}
