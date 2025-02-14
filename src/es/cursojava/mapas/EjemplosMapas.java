package es.cursojava.mapas;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EjemplosMapas {

	public static void main(String [] args) {
		
		Map<String,Integer> mapa = new HashMap();
			
		mapa.put("clave1",1);
		mapa.put("clave2",2);
		mapa.put("clave3",3);
		
		//recuperamos por clave
		System.out.println(mapa.get("clave1"));
		
		Set<String> claves = mapa.keySet();
		for (String clave : claves) {
			System.out.println(clave + "" + mapa.get(clave));
		}
		
		Collection<Integer> valores = mapa.values();
		for (Integer valor : valores) {
			System.out.println(valor);
		}
		Set<Entry<String,Integer>> entries = mapa.entrySet();;
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
		
	}
}
