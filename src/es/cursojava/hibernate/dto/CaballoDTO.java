package es.cursojava.hibernate.dto;

import es.cursojava.hibernate.entity.Jinete;

public class CaballoDTO {
    private String nombreCaballo;
    private int edad;
    private double velocidadMaxima;
    private int numeroDeTriunfos;
    private double experiencia;
    private boolean activo;
    private double avance;
    private String nombreJinete;
    private String nacionalidad;
   
    
	public CaballoDTO(String nombreCaballo, int edad, double velocidadMaxima, int numeroDeTriunfos, double experiencia,
			boolean activo, double avance, String nombreJinete, String nacionalidad) {
		super();
		this.nombreCaballo = nombreCaballo;
		this.edad = edad;
		this.velocidadMaxima = velocidadMaxima;
		this.numeroDeTriunfos = numeroDeTriunfos;
		this.experiencia = experiencia;
		this.activo = activo;
		this.avance = avance;
		this.nombreJinete = nombreJinete;
		this.nacionalidad = nacionalidad;
	}


	public String getNombreCaballo() {
		return nombreCaballo;
	}

	public void setNombreCaballo(String nombreCaballo) {
		this.nombreCaballo = nombreCaballo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getNumeroDeTriunfos() {
		return numeroDeTriunfos;
	}

	public void setNumeroDeTriunfos(int numeroDeTriunfos) {
		this.numeroDeTriunfos = numeroDeTriunfos;
	}

	public double getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(double experiencia) {
		this.experiencia = experiencia;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public double getAvance() {
		return avance;
	}

	public void setAvance(double avance) {
		this.avance = avance;
	}

	public String getNombreJinete() {
		return nombreJinete;
	}

	public void setNombreJinete(String nombreJinete) {
		this.nombreJinete = nombreJinete;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

    
}

