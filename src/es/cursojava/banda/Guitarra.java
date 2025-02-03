package es.cursojava.banda;

public class Guitarra extends Instrumento{
    private int numCerdas;

    public Guitarra(String nombre, String tipo, boolean afinado, int numCerdas) {
        super(nombre, tipo, afinado);
        this.numCerdas = numCerdas;
    }

    public int getNumCerdas() {
        return numCerdas;
    }

    public void setNumCerdas(int numCerdas) {
        this.numCerdas = numCerdas;
    }

    @Override
    public void afinar() {
        System.out.println("Afinando " + getNombre());
        super.afinar();
    }

    
}
