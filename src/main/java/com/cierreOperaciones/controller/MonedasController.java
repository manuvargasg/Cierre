package com.cierreOperaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cierreOperaciones.model.Moneda;
import com.cierreOperaciones.repository.MonedasRepository;
import com.cierreOperaciones.service.MonedasService;
@RestController
@RequestMapping("/monedas")
public class MonedasController {
	
	@Autowired
	private MonedasService monedasService;
	
	
	//Solicitudes al servidor
	/*
	@GetMapping("/lista") //Listar todas las monedas que se tienen
	public ResponseEntity <List<Moneda>> lista(){
		List<Moneda> lista = monedasService.lista();
		return ResponseEntity.ok(lista);
	}
	*/
	@GetMapping("/lista")
	public ResponseEntity <List<Moneda>> lista(){
		List<Moneda> lista = monedasService.listadoSP();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/agregar")
	public ResponseEntity<?> SP_SETMonedasExistentes(@RequestBody Moneda moneda){
		monedasService.SP_SETMonedasExistentes(moneda);
		return new ResponseEntity("Moneda guardada!", HttpStatus.CREATED);
	}
}
