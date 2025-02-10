package es.cursojava.vehiculos;

public class Coche extends VehiculoMotorizado{

    private int numeroPuertas;
    private boolean aireAcondicionao;
    
    public Coche(String marca, String modelo, int anyo, double velocidadMaxima, String tipo, int numeroPuertas,
            boolean aireAcondicionao) {
        super(marca, modelo, anyo, velocidadMaxima, tipo);
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionao = aireAcondicionao;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isAireAcondicionao() {
        return aireAcondicionao;
    }

    public void setAireAcondicionao(boolean aireAcondicionao) {
        this.aireAcondicionao = aireAcondicionao;
    }

    @Override
    public String toString() {
        return "Coche"+ super.toString()+"\n NumeroPuertas = " + numeroPuertas + "\n AireAcondicionao = " + (aireAcondicionao?"Si":"No");
    }

    @Override
    public double impuestoVehiculo() {
        double impuesto = 0.05;
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
