package es.cursojava.poo;

import es.cursojava.excepciones.NotaInvalidaExection;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int edad;
	private double notaMedia;
	private String email;
	private String[] asignaturas;

	public Alumno() {

	}

	public Alumno(String nombre, String apelllidos, int edad, double notaMedia, String email, String[] asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apelllidos;
		this.edad = edad;
		this.notaMedia = notaMedia;
		this.email = email;
		this.asignaturas = asignaturas;
	}

	public Alumno(String nombre, String apelllidos, int edad, double notaMedia, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apelllidos;
		this.edad = edad;
		this.notaMedia = notaMedia;
		this.email = email;
	}

	public Alumno(String nombre, int edad, double notaMedia) throws NotaInvalidaExection {
		super();
		this.nombre = nombre;
		
		if (edad > 0) {
			this.edad = edad;
		} else {
			throw new IllegalArgumentException("Edad erronea, numero negativo");
		}
		
		if (notaMedia > 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		} else {
			throw new NotaInvalidaExection("Nota erronea, fuera del rango 1-10");
		}
	}

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public void estudiar() {
		System.out.print("El estudiante " + this.nombre);
		if (notaMedia == 0) {
			System.out.println(" no estudia nada");
		} else if (notaMedia < 5) {
			System.out.println(" estudia muy poco");
		} else if (notaMedia < 7) {
			System.out.println(" es un buen estudiante");
		} else if (notaMedia < 10) {
			System.out.println(" es muy bueno");
		} else {
			System.out.println(" es un genio");
		}
	}

	@Override
	public String toString() {
		return "\tNombre:" + nombre + "\n\tApellidos: " + apellidos + "\n\tEdad: " + edad + "\n\tNotaMedia: "
				+ notaMedia + "\n\temail:" + email;
	}

}
