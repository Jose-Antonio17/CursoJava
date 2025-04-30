package es.cursojava.enums;

public enum CarrerasEnum {

	CARRERA1("Carrera1", "Madrid"),
	CARRERA2("Carrera2", "Sevilla"),
	CARRERA3("Carrera3", "Valencia");
	
	String nombre;
	String lugar;
	
	private CarrerasEnum(String nombre, String lugar) {
		this.nombre = nombre;
		this.lugar = lugar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
		
}
