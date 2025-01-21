package es.cursojava.poo;

public class Persona {

	//POJO (PLAIN OLD JAVA OBJECT)
	//variables de instancia
	private String nombre;
	private String apellidos;
	private String dni;
	private double peso;
	
	public Persona() {
		
	}
	
	public Persona (String nombre, String apellidos, String dni, double peso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.peso = peso;
	}
	
	//getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getPeso() {
		return peso;
	}	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void correr () {
		System.out.println("La persona " + this.nombre);
	}
}
