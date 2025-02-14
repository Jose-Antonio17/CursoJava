package es.cursojava.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import es.cursojava.funciones.Utilidades;
import es.cursojava.poo.Alumno;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Nombre1", "Apellido1", 28, 4, "nombre1@gmail.com");
		Alumno a2 = new Alumno("Nombre2", "Apellido2", 28, 5, "nombre2@gmail.com");
		Alumno a3 = new Alumno("Nombre3", "Apellido3", 28, 6, "nombre3@gmail.com");
		Alumno a4 = new Alumno("Nombre4", "Apellido4", 28, 7, "nombre4@gmail.com");
		Alumno a5 = new Alumno("Nombre5", "Apellido5", 28, 8, "nombre5@gmail.com");
		Alumno a6 = new Alumno("Nombre6", "Apellido6", 28, 9, "nombre6@gmail.com");
		Alumno a7 = new Alumno("Nombre7", "Apellido7", 28, 5, "nombre7@gmail.com");
		Alumno a8 = new Alumno("Nombre8", "Apellido8", 28, 6, "nombre8@gmail.com");
		Alumno a9 = new Alumno("Nombre9", "Apellido9", 28, 7, "nombre9@gmail.com");
		Alumno a10 = new Alumno("Nombre10", "Apellido10", 28, 8, "nombre10@gmail.com");
		Alumno a11 = new Alumno("Nombre11", "Apellido11", 28, 9, "nombre11@gmail.com");
		Alumno a12 = new Alumno("Nombre12", "Apellido12", 28, 10, "nombre12@gmail.com");
		Alumno a13 = new Alumno("Nombre13", "Apellido13", 28, 7, "nombre13@gmail.com");
		Alumno a14 = new Alumno("Nombre14", "Apellido14", 28, 8, "nombre14@gmail.com");
		Alumno a15 = new Alumno("Nombre15", "Apellido15", 28, 9, "nombre15@gmail.com");
		Alumno a16 = new Alumno("Nombre16", "Apellido16", 28, 10, "nombre16@gmail.com");
		Alumno a17 = new Alumno("Nombre17", "Apellido17", 28, 6, "nombre17@gmail.com");
		Alumno a18 = new Alumno("Nombre18", "Apellido18", 28, 5, "nombre18@gmail.com");
		
		List<Alumno> lista = new CopyOnWriteArrayList<>();
		lista.addAll(Arrays.asList(a1, a2, a3, a4, a5, a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18));

		Ejercicio1 main = new Ejercicio1();
		System.out.println("Alumnos del instituto:");
		main.informacionAlumnos(lista);
		System.out.println("===================");
		main.notaMediaNombre(lista);
		System.out.println("===================");
		System.out.println("Separamos los alumnos por aulas");

		List<Alumno> listaAula1 = new ArrayList<>();
		listaAula1.add(a1);
		listaAula1.add(a2);
		List<Alumno> listaAula2 = new ArrayList<>();
		listaAula2.add(a3);
		listaAula2.add(a4);
		List<Alumno> listaAula3 = new ArrayList<>();
		listaAula3.add(a5);
		listaAula3.add(a6);

		Map<String, List> instituto = new HashMap();
		Colegio colegio1 = new Colegio("Colegio1","Direccion1");
		instituto.put("Aula1", listaAula1);
		instituto.put("Aula2", listaAula2);
		instituto.put("Aula3", listaAula3);

		System.out.println("Alumnos del aula 1:");
		main.informacionAlumnos(instituto.get("Aula1"));
		System.out.println("Alumnos del aula 2:");
		main.informacionAlumnos(instituto.get("Aula2"));
		System.out.println("Alumnos del aula 3:");
		main.informacionAlumnos(instituto.get("Aula3")
				);

		System.out.println("=============");
		System.out.println("Aula con el alumno que tiene la nota media más alta:");
		System.out.println(main.notaMediaAlta(instituto));

		System.out.println("=============");
		System.out.println("Los alumnos suspensos son eliminados");
		main.suspenso(lista);
		main.informacionAlumnos(lista);
	}

	public void informacionAlumnos(List<Alumno> alumnos) {

		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
			System.out.println();
		}
	}

	public void notaMediaNombre(List<Alumno> alumnos) {

		String nom = Utilidades.pideDatoString("Ingresar el nombre del alumno cuya nota media quiere ver.");
		for (Alumno alumno : alumnos) {
			if (alumno.getNombre().equals(nom)) {
				System.out.println("Nota media: " + alumno.getNotaMedia());
			}
		}
	}

	public String notaMediaAlta(Map<String, List> instituto) {
		Set<String> aulas = instituto.keySet();
		double notaMediaMayor = 0;
		String clase = "";
		for (String aula : aulas) {
			List<Alumno> alumnos = instituto.get(aula);
			for (Alumno alumno : alumnos) {
				if (alumno.getNotaMedia() > notaMediaMayor) {
					notaMediaMayor = alumno.getNotaMedia();
					clase = aula;
				}
			}
		}
		return clase;
	}
	//metodo utilizado con la clase CopyOnWriteArrayList
	public void suspenso(List<Alumno> alumnos) {
		int notaSuspenso = 5;
		for (Alumno alumno : alumnos) {
			if (alumno.getNotaMedia() < notaSuspenso) {
				alumnos.remove(alumno);
			}
		}
	}
	//mwtodo utilizado con la clase ArrayList
	public void suspenso2(List<Alumno> alumnos) {
		List<Alumno> alumnosEliminar = new ArrayList<>();
		int notaSuspenso = 5;
		for (Alumno alumno : alumnos) {
			if (alumno.getNotaMedia() < notaSuspenso) {
				alumnosEliminar.add(alumno);
			}
		}
		alumnos.removeAll(alumnosEliminar);
	}
}
