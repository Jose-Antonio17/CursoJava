package es.cursojava.vehiculos;

public class Camion extends Vehiculo{

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
    public void mostrarInformacion(Vehiculo vehiculo) {
        Camion camion = (Camion)vehiculo; 
        System.out.println(camion);
    }

    @Override
    public String toString() {
        return "Camion [capacidadCarga=" + capacidadCarga + ", numeroEjes=" + numeroEjes + ", toString()="
                + super.toString() + "]";
    }

   

}
