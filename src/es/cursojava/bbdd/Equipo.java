package es.cursojava.bbdd;

import java.util.Date;
import java.util.List;

public class Equipo {

	private int id;
	private String nombre_departamento;
	private Date fecha_creacion;
	private List<Empleado> empleados;
	
	public Equipo(int id, String nombre_departamento, Date fecha_creacion, List<Empleado> empleados) {
		super();
		this.id = id;
		this.nombre_departamento = nombre_departamento;
		this.fecha_creacion = fecha_creacion;
		this.empleados = empleados;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_departamento() {
		return nombre_departamento;
	}

	public void setNombre_departamento(String nombre_departamento) {
		this.nombre_departamento = nombre_departamento;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
}
