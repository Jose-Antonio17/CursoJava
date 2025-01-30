package es.cursojava.poo;

import java.util.Arrays;

public class Sala {

	private int numero;
	private String tituloPelicula;
	private Espectador [][] butacas;
	
	public Sala(int numero, String tituloPelicula, Espectador[][] butacas) {
		super();
		this.numero = numero;
		this.tituloPelicula = tituloPelicula;
		this.butacas = butacas;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTituloPelicula() {
		return tituloPelicula;
	}
	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}
	public Espectador [][] getButacas() {
		return butacas;
	}
	public void setButacas(Espectador[][] butacas) {
		this.butacas = butacas;
	}
	@Override
	public String toString() {
		return "Sala " + numero + ". \n Pelicula: " + tituloPelicula;
	}
	
	
}
