package com.cierreOperaciones.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Moneda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_moneda;
	
	@Column
	private double valor_moneda;

	@Column
	private int cantidad;
	
	@Column
	private String detalle;
	
	@Column
	private LocalDate fecha;
	
	//Getters y Setters
	public long getId_moneda() {
		return id_moneda;
	}
	public void setId_moneda(long id_moneda) {
		this.id_moneda = id_moneda;
	}
	public double getValor_moneda() {
		return valor_moneda;
	}
	public void setValor_moneda(double valor_moneda) {
		this.valor_moneda = valor_moneda;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Moneda [id_moneda=" + id_moneda + ", valor_moneda=" + valor_moneda + ", cantidad=" + cantidad
				+ ", detalle=" + detalle + ", fecha=" + fecha + "]";
	}
	
}
