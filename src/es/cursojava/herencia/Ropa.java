package es.cursojava.herencia;

public class Ropa {

    private String color;
	private double precio;
	private String talla;
    
    public Ropa(String color, double precio, String talla) {
        this.color = color;
        this.precio = precio;
        this.talla = talla;
    }
    public String getColor() {
        return color;
    }
    public double getPrecio() {
        return precio;
    }
    public String getTalla() {
        return talla;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }

    
}
