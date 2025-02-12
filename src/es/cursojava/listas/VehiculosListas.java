package es.cursojava.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.cursojava.vehiculos.Camion;
import es.cursojava.vehiculos.Coche;
import es.cursojava.vehiculos.Motocicleta;
import es.cursojava.vehiculos.Vehiculo;

public class VehiculosListas {

	public static void main(String [] args) {
		
		Vehiculo coche1 = new Coche("Toyota", "Corolla", 2004, 180, "hibrido", 5, true);
		Vehiculo motocicleta1 = new Motocicleta("Honda", "Monkey", 2024, 90, "diesel", true, 125);
		Vehiculo camion1 = new Camion("Volvo", "FH", 2013, 100, "gasolina", 750, 4);
		
		ArrayList<Vehiculo> lista = new ArrayList<>();
		
		lista.add(coche1);
		lista.add(motocicleta1);
		lista.add(camion1);
		
		System.out.println(lista.size());
		
		for (int i= 0; i<lista.size();i++) {
			lista.get(i).consultar();
			System.out.println(lista.get(i));
		}
		
		List<Vehiculo> lista2 = Arrays.asList(coche1,camion1,motocicleta1); 
	}
	
	
}
