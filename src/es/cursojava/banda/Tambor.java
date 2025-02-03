package es.cursojava.banda;

public class Tambor extends Instrumento{

    private String material;

    public Tambor(String nombre, String tipo, boolean afinado, String material) {
        super(nombre, tipo, afinado);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void afinar() {
        System.out.println("El tambor siempre esta afinado");
        setAfinado(true) ;
    }

    public void aporrear(){
        System.out.println("Aporreando " + getNombre());
    }
    
}
