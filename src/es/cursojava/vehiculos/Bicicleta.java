package es.cursojava.vehiculos;

public class Bicicleta extends Vehiculo1 {
    int nunMarchas;

    public Bicicleta(String marca, String modelo, int anio, double velocidadMaxima, String tipo, int nunMarchas) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.nunMarchas = nunMarchas;
    } 

    public double impuestoVehiculo() {
        ;
        return 0;
    }
    @Override
    public void consultar() {
        System.out.println("Consultando bicicleta");
        
    }
    @Override
    public void insertar() {
        System.out.println("Insertando bicicleta");
        
    }
}
