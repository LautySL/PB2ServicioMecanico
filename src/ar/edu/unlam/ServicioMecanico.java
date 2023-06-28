package ar.edu.unlam;

import java.util.*;
import java.text.*;

public class ServicioMecanico {
	
	private String nombre;
	private List <Cliente> clientesEnEspera;
	private List <Cliente> clientesAtendidos;
	private Reloj reloj;

	public ServicioMecanico(String nombre) {
		super();
		this.nombre = nombre;
		this.clientesEnEspera = new ArrayList<>();
		this.clientesAtendidos = new ArrayList<>();
		this.reloj = new Reloj();
	}
	
	private Integer getCantidadDeClientesEnEspera() {
		return this.clientesEnEspera.size();
	}
	
	private Integer getCantidadDeClientesAtendidos() {
		return this.clientesAtendidos.size();
	}
	
	public Boolean agregarCliente (String nombre, Integer numeroDeTelefono) {
		Long fecha = Reloj.ahora();
		Cliente nuevoCliente = new Cliente (nombre, numeroDeTelefono, fecha);
		return this.clientesEnEspera.add(nuevoCliente);
	}
	
	public Cliente atenderCliente(Cliente cliente) throws NoHayClientesException {
		if (this.clientesEnEspera.size() == 0) {
			throw new NoHayClientesException();
		}
		
		if (this.clientesEnEspera.size() != 0) {
			if (cliente.getFechaDeAtencion() == null) {
			cliente.setFechaDeAtencion(Reloj.ahora());
			this.clientesEnEspera.remove(cliente);
			this.clientesAtendidos.add(cliente);
			return cliente;
			}
		}	
		return null;
	}
	
	public Long obtenerTiempoMedioDeEsperaDeLosClientesQueAunNoHanSidoAtendidos() {
		
		Long sumaTiempos=0L;	
		Long promedio;
			for (Cliente cliente : clientesEnEspera) {
			sumaTiempos+=(Reloj.ahora()-cliente.getFecha());
			}
		promedio = sumaTiempos/this.clientesEnEspera.size();
			
		return promedio/60000;
		}
		
	public Long obtenerTiempoMedioDeEsperaDeLosClientesAtendidos() {
		Long sumaTiempos=0L;	
		Long promedio;
			for (Cliente cliente : clientesEnEspera) {
				sumaTiempos+=(cliente.getFechaDeAtencion()-cliente.getFecha());
			}
		promedio = sumaTiempos/this.clientesEnEspera.size();
		return promedio/60000;
	}
	

}
