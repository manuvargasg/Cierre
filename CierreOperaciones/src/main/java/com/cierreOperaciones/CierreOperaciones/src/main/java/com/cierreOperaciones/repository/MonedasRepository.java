package com.cierreOperaciones.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cierreOperaciones.model.Moneda;

public interface MonedasRepository extends JpaRepository<Moneda, Long> {
	
	@Query(value= "{CALL SP_getMonedas()}", nativeQuery=true)
	List<Moneda> SP_getMonedas();
	
	@Query(value = "{CALL SP_SETMonedasExistentes(:_valor_moneda, :_cantidad, :_detalle)}", nativeQuery=true)
	void SETMonedasExistentes(
			@Param("_valor_moneda") Double _valor_moneda,
			@Param("_cantidad") Integer _cantidad,
			@Param("_detalle") String _detalle
			);
}
