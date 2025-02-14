package es.cursojava.listas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import es.cursojava.poo.Alumno;

public class PruebaSet {

	public static void main(String[] args) {
		
		Set<Alumno> alumnos = new HashSet();
		
		alumnos.add(new Alumno("Jose", "Antonio", 8, 5, "jose@gmail.com"));
		alumnos.add(new Alumno("Juan", "Garavito", 8, 5, "juan@gmail.com"));
		
		Iterator<Alumno> ite = alumnos.iterator();
		System.out.println(ite.next().getNombre());
		System.out.println(ite.next().getNombre());
		//System.out.println(ite.next().getNombre());
		
		//while(ite.hasNext()){
            //Alumno a = ite.next();
           // System.out.println(a.getNombre());
	}

}
