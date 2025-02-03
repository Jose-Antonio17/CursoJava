package es.cursojava.vehiculos;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int anyo;
    private double velocidadMaxima;
    private String tipo;
    
    public Vehiculo(String marca, String modelo, int anyo, double velocidadMaxima, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.velocidadMaxima = velocidadMaxima;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarInformacion(Vehiculo vehiculo){
        System.out.println(vehiculo);
    }
    
    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anyo=" + anyo + ", tipo=" + tipo + "]";
    }
  
    
}
