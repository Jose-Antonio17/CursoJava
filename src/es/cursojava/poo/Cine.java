package es.cursojava.poo;

public class Cine {
	
	private String nombre;
	private Sala[] salas;
	
	public Cine(String nombre, Sala[] salas) {
		super();
		this.nombre = nombre;
		this.salas = salas;
	}
	
	public Cine(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sala[] getSalas() {
		return salas;
	}

	public void setSalas(Sala[] salas) {
		this.salas = salas;
	}

	
}
