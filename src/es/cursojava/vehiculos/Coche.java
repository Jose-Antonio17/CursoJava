package es.cursojava.vehiculos;

public class Coche extends Vehiculo{

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
    public void mostrarInformacion(Vehiculo vehiculo) {
        Coche coche = (Coche)vehiculo; 
        System.out.println(coche);
    }

    @Override
    public String toString() {
        return "Coche [numeroPuertas=" + numeroPuertas + ", aireAcondicionao=" + aireAcondicionao + ", toString()="
                + super.toString() + "]";
    }

    
    

    
   
    


   


}
