package es.cursojava.banda;

public class Instrumento {

    private String nombre;
    private String tipo;
    private boolean afinado;

    public Instrumento(String nombre, String tipo, boolean afinado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.afinado = afinado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }

    public void afinar(){
        double numero = Math.random();
        if(numero>0.4){
            this.afinado = true;
        } else {
            this.afinado = false;
        }
    }

    public void tocar(String nombre){
        System.out.println("Tocando " + nombre); 
    }
}
