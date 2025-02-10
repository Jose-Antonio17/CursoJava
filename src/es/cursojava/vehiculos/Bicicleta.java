package es.cursojava.vehiculos;

public class Bicicleta extends Vehiculo{
    int nunMarchas;

    public Bicicleta(String marca, String modelo, int anio, double velocidadMaxima, String tipo, int nunMarchas) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.nunMarchas = nunMarchas;
    } 

    public double impuestoVehiculo() {
        ;
        return 0;
    }
}
