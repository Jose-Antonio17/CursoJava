package es.cursojava.ejercicios.colecciones;

import java.util.List;
import java.util.Map;

import es.cursojava.poo.Alumno;

public class Colegio {
	
	private String nombre;
	private String direccion;
	private Map<String, List<Alumno>> clases;

	public Colegio(String nombre, String direccion, Map<String, List<Alumno>> clases) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.clases = clases;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Map<String, List<Alumno>> getClases() {
		return clases;
	}

	public void setClases(Map<String, List<Alumno>> clases) {
		this.clases = clases;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Direccion=" + direccion + ", Clases=" + clases;
	}

	
}
