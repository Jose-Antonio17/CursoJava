package es.cursojava.vehiculos;

public class Camion extends VehiculoMotorizado {

    private double capacidadCarga;
    private int numeroEjes;

    public Camion(String marca, String modelo, int anyo, double velocidadMaxima, String tipo, double capacidadCarga,
            int numeroEjes) {
        super(marca, modelo, anyo, velocidadMaxima, tipo);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "Camion" + super.toString() + "\n CapacidadCarga = " + capacidadCarga + "\n NumeroEjes = " + numeroEjes;
    }

    @Override
    public double impuestoVehiculo() {
        double impuesto = 0.1;
        return impuesto;
    }
    
    @Override
    public void encender() {
        System.out.println("Arrancando el coche");
        
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el coche");
        
    }

}
