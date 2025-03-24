package es.cursojava.ficherosejercicios;

public class Evento {

	private int id;
	private String nombre;
	private String fecha;
	private String lugar;
	private String descripcion;
	private int duracion;
	private double precio;
	private String organizador;
	private boolean gratuito;
	
	public Evento(int id, String nombre, String fecha, String lugar, String descripcion, int duracion, double precio,
			String organizador, boolean gratuito) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.precio = precio;
		this.organizador = organizador;
		this.gratuito = gratuito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getOrganizador() {
		return organizador;
	}

	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}

	public boolean isGratuito() {
		return gratuito;
	}

	public void setGratuito(boolean gratuito) {
		this.gratuito = gratuito;
	}
	
}
