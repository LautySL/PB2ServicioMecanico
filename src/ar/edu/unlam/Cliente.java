package ar.edu.unlam;

import java.util.*;

public class Cliente {
	
	private String nombre;
	private Integer numeroDeTelefono;
	private Long fecha, fechaDeAtencion;
	
	public Cliente(String nombre, Integer numeroDeTelefono, Long fecha) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.numeroDeTelefono = numeroDeTelefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	public Integer getNumeroDeTelefono() {
		return numeroDeTelefono;
	}

	public void setNumeroDeTelefono(Integer numeroDeTelefono) {
		this.numeroDeTelefono = numeroDeTelefono;
	}
	
	public Long getFechaDeAtencion() {
		return fechaDeAtencion;
	}

	public void setFechaDeAtencion(Long fechaDeAtencion) {
		this.fechaDeAtencion = fechaDeAtencion;
	}
}
