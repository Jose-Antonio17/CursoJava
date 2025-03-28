package es.cursojava.interfacesvehiculos;

import es.cursojava.interfaces.Insertable;
import es.cursojava.interfaces.Operable;

public class Ordenador extends ProductosElectronicos implements Operable, Insertable {

    private String procesador;

    public Ordenador(String nombre, int precio, String fechaFabricacion, String procesador) {
        super(nombre, precio, fechaFabricacion);
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void encender() {
       System.out.println("Encendiendo ordenador");
        
    }

    @Override
    public void apagar() {
        System.out.println("Apagando ordenador");
        
    }

    @Override
    public void suspender() {
        System.out.println("Suspendiendo ordenador");
    }

    @Override
    public void consultar() {
        System.out.println("Consultando ordenador");
        
    }
    @Override
    public void insertar() {
        System.out.println("Insertando ordenador");
        
    }
    @Override
    public void update() {
        System.out.println("Actualizando ordenador");
        
    }
}
