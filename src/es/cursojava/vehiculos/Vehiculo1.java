package es.cursojava.vehiculos;

import java.time.LocalDate;

import es.cursojava.interfaces.Consultable;
import es.cursojava.interfaces.Insertable;

public abstract class Vehiculo1 implements Consultable, Insertable {

    private String marca;
    private String modelo;
    private int anyo;
    private double velocidadMaxima;
    private String tipo;
    
    public Vehiculo1(String marca, String modelo, int anyo, double velocidadMaxima, String tipo) {
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

    public void mostrarInformacion(){
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "\n Marca = " + marca + "\n Modelo = " + modelo + "\n Año = " + anyo + "\n Tipo = " + tipo;
    }
  
    public void impuesto() {
            double impuesto = 200;
            double impuesto1 = impuesto * impuestoAntiguedad();
            double impuesto2 = impuesto * impuestoTipo();
            double impuesto3 = impuesto * impuestoVehiculo();
            impuesto = impuesto + impuesto1 + impuesto2 + impuesto3;
            System.out
                    .println("El impuesto del " + marca + " " + modelo + " es " + impuesto);

    }

    private double impuestoAntiguedad() {
        double impuestoAnyo = 0;
        if (LocalDate.now().getYear() - anyo > 20) {
            impuestoAnyo = 0.1;
        } else if (LocalDate.now().getYear() - anyo > 10) {
            impuestoAnyo = 0.05;
        } else {
            impuestoAnyo = 0;
        }
        return impuestoAnyo;
    }

    private double impuestoTipo() {
        double impuestoTipo = 0;
        if (tipo.equals("eléctrico")) {
            impuestoTipo = 0.1;
        } else if (tipo.equals("hibrido")) {
            impuestoTipo = 0.05;
        } else {
            impuestoTipo = 0.1;
        }
        return impuestoTipo;
    }

    public abstract double impuestoVehiculo(); 
    
}
