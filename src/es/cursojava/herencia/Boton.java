package es.cursojava.herencia;

public class Boton {

	private String color;
	private int tamanyo;
	private String forma;
	
	public Boton(String color, int tamanyo, String forma) {
		super();
		this.color = color;
		this.tamanyo = tamanyo;
		this.forma = forma;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTamanyo() {
		return tamanyo;
	}
	public void setTamanyo(int tamanyo) {
		this.tamanyo = tamanyo;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
}
