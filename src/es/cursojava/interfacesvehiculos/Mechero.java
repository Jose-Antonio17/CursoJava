package es.cursojava.interfacesvehiculos;

import es.cursojava.interfaces.Encendible;
import es.cursojava.interfaces.Insertable;

public class Mechero extends Producto implements Encendible, Insertable{
    String gas;

    public Mechero(String nombre, int precio, String gas) {
        super(nombre, precio);
        this.gas = gas;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo mechero");
        
    }

    @Override
    public void consultar() {
        System.out.println("Consultando mechero");
        
    }
    
    @Override
    public void insertar() {
        System.out.println("Insertando mechero");
        
    }
}
