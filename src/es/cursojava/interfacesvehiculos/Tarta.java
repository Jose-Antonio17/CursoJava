package es.cursojava.interfacesvehiculos;

public class Tarta extends Alimentos {

    private String sabor;

    public Tarta(String nombre, int precio, String fechaCaducidad, String sabor) {
        super(nombre, precio, fechaCaducidad);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    @Override
    public void consultar() {
        System.out.println("Consultando tarta");
        
    }
    @Override
    public void insertar() {
        System.out.println("Insertando tarta");
        
    }

}
