package ar.edu.unlam;

public class NoHayClientesException extends Exception{
	
	public NoHayClientesException() {
		super("No hay clientes por atender.");
	}
}
