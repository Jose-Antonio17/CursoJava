package es.cursojava.interfacesvehiculos;

import es.cursojava.interfaces.Consultable;
import es.cursojava.interfaces.Encendible;
import es.cursojava.interfaces.Operable;
import es.cursojava.vehiculos.Bicicleta;
import es.cursojava.vehiculos.Coche;

public class MainProductosVehiculos {

    public static void main(String[] args) {
        MainProductosVehiculos mpv = new MainProductosVehiculos();
        mpv.ejercicio();
    }

    private void ejercicio(){

        Tarta tarta = new Tarta("Tarta1", 20, null, "Chocolate");
        Coche coche = new Coche("Marca1", "Modelo1", 2020, 200, "Diesel", 5, false);
        Ordenador ordenador = new Ordenador("O1", 1000, "", null);
        Bicicleta bicicleta = new Bicicleta("","",2020,200,"Pedales",10);
        Mechero mechero = new Mechero("Mechero1", 100, null);

        coche.encender();
        ordenador.encender();

        Encendible [] arrayEncendible = {coche, ordenador,mechero};
        enciende(mechero);
        
        Consultable [] arrayConsultar = {coche, ordenador,mechero, bicicleta, tarta};
        consultar(arrayConsultar);
    }


    private void operable(Operable objetoOperable){
        objetoOperable.encender();
        objetoOperable.apagar();
        objetoOperable.suspender();

    }


    public void enciende (Encendible objetoEncendible){
        objetoEncendible.encender();
    }

    public void consultar (Consultable [] objetoConsultable){
    	for (Consultable consultable : objetoConsultable) {
    		consultable.consultar();
		}
    	
    }

}
