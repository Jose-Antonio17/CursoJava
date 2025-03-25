package es.cursojava.bbdd;

import java.util.Date;
import java.util.List;

public class Equipo {

	private int id;
	private String nombreDepartamento;
	private Date fechaCreacion;
	private List<Empleado> empleados;
	
	public Equipo(int id, String nombre_departamento, Date fecha_creacion, List<Empleado> empleados) {
		super();
		this.id = id;
		this.nombreDepartamento = nombre_departamento;
		this.fechaCreacion = fecha_creacion;
		this.empleados = empleados;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombre_departamento) {
		this.nombreDepartamento = nombre_departamento;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fecha_creacion) {
		this.fechaCreacion = fecha_creacion;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nEquipo [id=");
		builder.append(id);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion+"]");
		builder.append("\nEmpleados:");
		builder.append(empleados);
		return builder.toString();
	}
	
	
}
