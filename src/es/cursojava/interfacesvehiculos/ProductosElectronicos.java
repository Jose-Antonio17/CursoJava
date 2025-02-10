package es.cursojava.interfacesvehiculos;

import es.cursojava.interfaces.Apagable;
import es.cursojava.interfaces.Encendible;

public abstract class ProductosElectronicos extends Producto implements Encendible, Apagable {

    private String fechaFabricacion;

    public ProductosElectronicos(String nombre, int precio, String fechaFabricacion) {
        super(nombre, precio);
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }


}
