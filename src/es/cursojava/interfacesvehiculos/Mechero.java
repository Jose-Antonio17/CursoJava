package es.cursojava.interfacesvehiculos;

import es.cursojava.interfaces.Encendible;

public class Mechero extends Producto implements Encendible{
    String gas;

    public Mechero(String nombre, int precio, String gas) {
        super(nombre, precio);
        this.gas = gas;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo mechero");
        
    }

    

}
