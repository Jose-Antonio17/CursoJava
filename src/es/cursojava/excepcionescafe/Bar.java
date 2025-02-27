package es.cursojava.excepcionescafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bar {

	private String nombre;
	private List<Cliente> clientes;

	public Bar(String nombre) {
		super();
		this.nombre = nombre;
		this.clientes = new ArrayList<Cliente>();
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public static void main(String[] args) {

		Bar main = new Bar("La esquinita");
		main.abrirBar();
		main.tomarCafe(main.getClientes());

	}

	public void abrirBar() {

		Huesped h1 = new Huesped("Nombre1", "12345678A");
		Comensal c1 = new Comensal("Nombre2", true);
		ClienteAsiduo ca1 = new ClienteAsiduo("Nombre3", "mote3");

		List<Cliente> listaClientes = new ArrayList<Cliente>();
		listaClientes.addAll(Arrays.asList(h1, c1, ca1));
		this.clientes = listaClientes;
	}

	public void tomarCafe(List<Cliente> clientesBar) {

		for (Cliente cliente : clientesBar) {
			if (cliente instanceof Huesped) {
				System.out.println("Los huéspedes no pueden tomas cafe");
			} else {
				TazaCafe cafe = prepararCafe();
				if (cliente instanceof Comensal) {
					Comensal c2 = (Comensal) cliente;
					try {
						c2.tomarCafe(cafe);
					}catch (TooColdTemperatureException e) {
						System.out.println("Error: " + e.getMessage());
					}catch (TooHotTemperatureException e) {
						System.out.println("Error: " + e.getMessage());
					}
				} else {
					ClienteAsiduo ca2 = (ClienteAsiduo) cliente;
					try {
						ca2.tomarCafe(cafe);
					}catch (TooColdTemperatureException e) {
						System.out.println("Error: " + e.getMessage());
					}catch (TooHotTemperatureException e) {
						System.out.println("Error: " + e.getMessage());
					}
					
				}
			}
		}
	}
	
	public TazaCafe prepararCafe() {
		
		TazaCafe cafe = new TazaCafe("Americano");
		System.out.println(cafe.getTemperatura());
		return cafe;
	}

}
