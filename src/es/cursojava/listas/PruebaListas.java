package es.cursojava.listas;

import java.util.ArrayList;

import es.cursojava.banda.Tambor;

public class PruebaListas {

	public static void main(String[] args) {
		
		ArrayList<Tambor> lista = new ArrayList<>();
		
		//lista.add("azul");
		//lista.add(1);
		lista.add(new Tambor("Tambor", null, false, null));
		
		System.out.println(lista.size());
		
		for (Object object : lista) {
			if (object instanceof Tambor) {
				Tambor v = (Tambor)object;
				v.aporrear();
			}
		}
		
	}

}
