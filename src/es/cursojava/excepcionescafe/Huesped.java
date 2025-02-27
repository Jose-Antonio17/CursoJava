package es.cursojava.excepcionescafe;

public class Huesped extends Cliente{
	
	 private String dni;

	public Huesped(String nombre, String dni) {
		super(nombre);
		this.dni = dni;
	} 
}
