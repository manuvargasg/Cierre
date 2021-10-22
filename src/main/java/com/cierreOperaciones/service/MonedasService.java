package com.cierreOperaciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cierreOperaciones.model.Moneda;
import com.cierreOperaciones.repository.MonedasRepository;

@Service
public class MonedasService {
	
	@Autowired
	MonedasRepository monedasRepository;
	/*
	public List<Moneda> lista(){
		return monedasRepository.findAll();
	}
	*/
	
	public List<Moneda> listadoSP(){
		return monedasRepository.SP_getMonedas();
	}
	
	public void SP_SETMonedasExistentes(Moneda moneda) {
		monedasRepository.SETMonedasExistentes(moneda.getValor_moneda(), moneda.getCantidad(), moneda.getDetalle());
	}
	
}