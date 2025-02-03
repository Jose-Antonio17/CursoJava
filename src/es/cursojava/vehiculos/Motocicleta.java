package es.cursojava.vehiculos;

public class Motocicleta extends Vehiculo {

    private boolean tieneSidecar;
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int anyo, double velocidadMaxima, String tipo, boolean tieneSidecar,
            int cilindrada) {
        super(marca, modelo, anyo, velocidadMaxima, tipo);
        this.tieneSidecar = tieneSidecar;
        this.cilindrada = cilindrada;
    }
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }
    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInformacion(Vehiculo vehiculo) {
        Motocicleta motocicleta = (Motocicleta)vehiculo; 
        System.out.println(motocicleta);
    }
    @Override
    public String toString() {
        return "Motocicleta [tieneSidecar=" + tieneSidecar + ", cilindrada=" + cilindrada + ", toString()="
                + super.toString() + "]";
    }
   
}
