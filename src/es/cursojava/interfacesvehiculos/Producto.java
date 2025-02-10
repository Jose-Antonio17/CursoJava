package es.cursojava.interfacesvehiculos;

import es.cursojava.interfaces.Consultable;
import es.cursojava.interfaces.Insertable;

public abstract class Producto implements Consultable, Insertable{

    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}