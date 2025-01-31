package es.cursojava.herencia;

public class Pantalon extends Ropa {

	private Boton boton;
	
	public Pantalon(String color, double precio, String talla, Boton boton) {
		super(color, precio, talla);
		this.boton = boton;
	}
	public Boton getBoton() {
		return boton;
	}
	public void setBoton(Boton boton) {
		this.boton = boton;
	}
	
	
	
	
}
