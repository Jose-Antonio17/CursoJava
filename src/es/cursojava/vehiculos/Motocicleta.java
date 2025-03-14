package es.cursojava.vehiculos;

public class Motocicleta extends VehiculoMotorizado {

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
    public String toString() {
        return "Motocicleta" + super.toString() + "\n TieneSidecar = " + (tieneSidecar?"Si":"No") + "\n Cilindrada = " + cilindrada;
    }
   
    @Override
    public double impuestoVehiculo() {
        double impuesto = -0.05;
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
    @Override
    public void consultar() {
        System.out.println("Consultando moticicleta");
        
    }
    @Override
    public void insertar() {
        System.out.println("Insertando motocicleta");
        
    }
    public void update() {
        System.out.println("Actualizando motocicleta");
        
    }
}
