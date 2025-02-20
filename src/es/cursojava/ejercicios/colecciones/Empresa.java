package es.cursojava.ejercicios.colecciones;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Empresa {

	private String nombre;
	private Map<String, Map<String, Integer>> empresaAlmacenes;

	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {

		Empresa empresa = new Empresa("Amazon");
		empresa.empresaAlmacenes = empresa.crearAlmacenes();
		empresa.agregarProducto("Almacen4", "p1", 4);
		empresa.agregarProducto("Almacen1", "p1", 8);
		empresa.transferirStock("Almacen1", "Almacen4", "p1", 100);
	}

	public Map<String, Map<String, Integer>> crearAlmacenes() {

		Map<String, Integer> a1 = new TreeMap<String, Integer>();
		a1.put("p1", 5);
		a1.put("p2", 4);
		a1.put("p3", 6);

		Map<String, Integer> a2 = new TreeMap<String, Integer>();
		a2.put("p1", 2);
		a2.put("p2", 1);
		a2.put("p3", 5);

		Map<String, Integer> a3 = new TreeMap<String, Integer>();
		a3.put("p1", 1);
		a3.put("p2", 10);
		a3.put("p3", 2);

		Map<String, Map<String, Integer>> mapaAlmacenes = new TreeMap<String, Map<String, Integer>>();
		mapaAlmacenes.put("Almacen1", a1);
		mapaAlmacenes.put("Almacen2", a2);
		mapaAlmacenes.put("Almacen3", a3);

		return mapaAlmacenes;
	}

	public void agregarProducto(String almacen, String producto, int cantidad) {
		if (!this.empresaAlmacenes.containsKey(almacen)) {
			Map<String, Integer> a4 = new TreeMap<String, Integer>();
			a4.put(producto, cantidad);
			this.empresaAlmacenes.put(almacen, a4);
		} else {
			Map<String, Integer> a4 = this.empresaAlmacenes.get(almacen);
			int stock = cantidad + a4.get(producto);
			a4.replace(producto, stock);
		}
	}

	public void eliminarProducto(String almacen, String producto) {
		Map<String, Integer> a4 = this.empresaAlmacenes.get(almacen);
		a4.remove(producto);
	}

	public void transferirStock(String origen, String destino, String producto, int cantidad) {
		Map<String, Integer> a4 = this.empresaAlmacenes.get(origen);
		Map<String, Integer> a5 = this.empresaAlmacenes.get(destino);
		if (cantidad <= a4.get(producto)) {
			int aumentar = a5.get(producto) + cantidad;
			int reducir = a4.get(producto) - cantidad;
			a4.replace(producto, aumentar);
			a5.replace(producto, reducir);
		} else {
			System.out.println("Stock es insuficiente");
		}
	}

	public void buscarProducto(String producto) {
		Set<String> almacenes = this.empresaAlmacenes.keySet();
		for (String almacen : almacenes) {
			if (this.empresaAlmacenes.get(almacen).containsKey(producto)) {
				System.out.println(
						"El " + almacen + "tiene " + this.empresaAlmacenes.get(almacen).get(producto) + " en stock");
			}
		}
	}
	
	public void obtenerStockTotal(String producto) {
		
	}
}
