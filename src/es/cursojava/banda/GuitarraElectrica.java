package es.cursojava.banda;

public class GuitarraElectrica extends Guitarra{

    private int potencia;

    public GuitarraElectrica(String nombre, String tipo, boolean afinado, int numCerdas, int potencia) {
        super(nombre, tipo, afinado, numCerdas);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void tocar(String nombre) {
        System.out.println("Tocando " + nombre+" muy alto");
    }

    
}
