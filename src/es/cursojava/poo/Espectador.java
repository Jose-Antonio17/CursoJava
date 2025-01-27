package es.cursojava.poo;

public class Espectador {

	private String nombre;
	private String dni;
	
	public Espectador(String color, String dni) {
		super();
		this.nombre = color;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNmobre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}
