package es.cursojava.ejercicios.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

import es.cursojava.funciones.Utilidades;
import es.cursojava.poo.Alumno;

public class Ejercicio1 {

	public static void main(String[] args) {

		Ejercicio1 main = new Ejercicio1();

		List<Alumno> lista = main.crearAlumnos();

		// System.out.println("Todos los alumnos");
		// main.informacionAlumnos(lista);
		// System.out.println("===================");
		// main.notaMediaNombre(lista);
		System.out.println("===================");
		System.out.println("Separamos los alumnos por colegios y aulas");

		List<Colegio> listaColegio = main.crearColegios(lista);
		main.informacionColegios(listaColegio);

		System.out.println("===================");
		System.out.println("Aula con el alumno que tiene la nota media más alta del Colegio1:");
		System.out.println(main.notaMediaAlta(listaColegio.get(0).getClases()));
		System.out.println("Aula con el alumno que tiene la nota media más alta del Colegio2:");
		System.out.println(main.notaMediaAlta(listaColegio.get(1).getClases()));
		System.out.println("Aula con el alumno que tiene la nota media más alta del Colegio3:");
		System.out.println(main.notaMediaAlta(listaColegio.get(2).getClases()));

		// System.out.println("=============");
		// System.out.println("Los alumnos suspensos son eliminados");
		// main.suspenso(lista);
		// main.informacionAlumnos(lista);

		System.out.println("===================");
		System.out.println("Añadir un nuevo alumno");
		String colegio = Utilidades.pideDatoString("Indique el colegio");
		String aula = Utilidades.pideDatoString("Indique el aula");
		String nombre = Utilidades.pideDatoString("Nombre del alumno");
		main.anadirAlumno(colegio, aula, listaColegio,nombre);
		
		main.informacionColegios(listaColegio);
	}

	public List<Alumno> crearAlumnos() {

		Alumno a1 = new Alumno("Nombre1", "Apellido1", 28, 9.8, "nombre1@gmail.com");
		Alumno a2 = new Alumno("Nombre2", "Apellido2", 28, 5, "nombre2@gmail.com");
		Alumno a3 = new Alumno("Nombre3", "Apellido3", 28, 6, "nombre3@gmail.com");
		Alumno a4 = new Alumno("Nombre4", "Apellido4", 28, 7, "nombre4@gmail.com");
		Alumno a5 = new Alumno("Nombre5", "Apellido5", 28, 8.2, "nombre5@gmail.com");
		Alumno a6 = new Alumno("Nombre6", "Apellido6", 28, 9, "nombre6@gmail.com");
		Alumno a7 = new Alumno("Nombre7", "Apellido7", 29, 5, "nombre7@gmail.com");
		Alumno a8 = new Alumno("Nombre8", "Apellido8", 28, 4.8, "nombre8@gmail.com");
		Alumno a9 = new Alumno("Nombre9", "Apellido9", 28, 7, "nombre9@gmail.com");
		Alumno a10 = new Alumno("Nombre10", "Apellido10", 28, 5.5, "nombre10@gmail.com");
		Alumno a11 = new Alumno("Nombre11", "Apellido11", 28, 9, "nombre11@gmail.com");
		Alumno a12 = new Alumno("Nombre12", "Apellido12", 28, 10, "nombre12@gmail.com");
		Alumno a13 = new Alumno("Nombre13", "Apellido13", 28, 2.5, "nombre13@gmail.com");
		Alumno a14 = new Alumno("Nombre14", "Apellido14", 28, 6.5, "nombre14@gmail.com");
		Alumno a15 = new Alumno("Nombre15", "Apellido15", 28, 6.7, "nombre15@gmail.com");
		Alumno a16 = new Alumno("Nombre16", "Apellido16", 28, 9.5, "nombre16@gmail.com");
		Alumno a17 = new Alumno("Nombre17", "Apellido17", 28, 6, "nombre17@gmail.com");
		Alumno a18 = new Alumno("Nombre18", "Apellido18", 28, 5, "nombre18@gmail.com");

		List<Alumno> lista = new CopyOnWriteArrayList<>();
		lista.addAll(Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18));
		return lista;
	}

	public List<Colegio> crearColegios(List<Alumno> listaAlumnos) {

		List<Alumno> au1 = new ArrayList<>();
		au1.addAll(Arrays.asList(listaAlumnos.get(0), listaAlumnos.get(1)));
		List<Alumno> au2 = new ArrayList<>();
		au2.addAll(Arrays.asList(listaAlumnos.get(2), listaAlumnos.get(3)));
		List<Alumno> au3 = new ArrayList<>();
		au3.addAll(Arrays.asList(listaAlumnos.get(4), listaAlumnos.get(5)));
		List<Alumno> au4 = new ArrayList<>();
		au4.addAll(Arrays.asList(listaAlumnos.get(6), listaAlumnos.get(7)));
		List<Alumno> au5 = new ArrayList<>();
		au5.addAll(Arrays.asList(listaAlumnos.get(8), listaAlumnos.get(9)));
		List<Alumno> au6 = new ArrayList<>();
		au6.addAll(Arrays.asList(listaAlumnos.get(10), listaAlumnos.get(11)));
		List<Alumno> au7 = new ArrayList<>();
		au7.addAll(Arrays.asList(listaAlumnos.get(12), listaAlumnos.get(13)));
		List<Alumno> au8 = new ArrayList<>();
		au8.addAll(Arrays.asList(listaAlumnos.get(14), listaAlumnos.get(15)));
		List<Alumno> au9 = new ArrayList<>();
		au9.addAll(Arrays.asList(listaAlumnos.get(16), listaAlumnos.get(17)));

		Map<String, List<Alumno>> co1 = new TreeMap();
		co1.put("Aula1", au1);
		co1.put("Aula2", au2);
		co1.put("Aula3", au3);

		Map<String, List<Alumno>> co2 = new TreeMap();
		co2.put("Aula1", au4);
		co2.put("Aula2", au5);
		co2.put("Aula3", au6);

		Map<String, List<Alumno>> co3 = new TreeMap();
		co3.put("Aula1", au7);
		co3.put("Aula2", au8);
		co3.put("Aula3", au9);

		Colegio colegio1 = new Colegio("COLEGIO1", "Dirrecion1", co1);
		Colegio colegio2 = new Colegio("COLEGIO2", "Dirrecion2", co2);
		Colegio colegio3 = new Colegio("COLEGIO3", "Dirrecion3", co3);

		List<Colegio> listaColegio = new CopyOnWriteArrayList<>();
		listaColegio.addAll(Arrays.asList(colegio1, colegio2, colegio3));
		return listaColegio;
	}

	public void informacionColegios(List<Colegio> listaColegio) {

		for (Colegio colegio : listaColegio) {
			System.out.println(colegio.getNombre());
			System.out.println(colegio.getDireccion());
			Set<String> aulas = colegio.getClases().keySet();
			for (String aula : aulas) {
				System.out.println("\t" + aula);
				informacionAlumnos(colegio.getClases().get(aula));
			}

		}
	}

	public void informacionAlumnos(List<Alumno> alumnos) {

		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
			System.out.println();
		}
	}

	public void anadirAlumno(String colegioElegido, String aulaElegida, List<Colegio> listaColegio,String nombre) {
		Alumno a19 = new Alumno(nombre, "Apellido1", 28, 9.8, "nombre1@gmail.com");
		for (Colegio colegio : listaColegio) {
			if (colegioElegido.equals(colegio.getNombre())) {
				Set<String> aulas = colegio.getClases().keySet();
				for (String aula : aulas) {
					if(aulaElegida.equals(aula)) {
						colegio.getClases().get(aula).add(a19);
					}
					
				}
			}
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

	public String notaMediaAlta(Map<String, List<Alumno>> colegio) {
		Set<String> aulas = colegio.keySet();
		double notaMediaMayor = 0;
		String clase = "";
		for (String aula : aulas) {
			List<Alumno> alumnos = colegio.get(aula);
			for (Alumno alumno : alumnos) {
				if (alumno.getNotaMedia() > notaMediaMayor) {
					notaMediaMayor = alumno.getNotaMedia();
					clase = aula;
				}
			}
		}
		return clase;
	}

	// metodo utilizado con la clase CopyOnWriteArrayList
	public void suspenso(List<Alumno> alumnos) {
		int notaSuspenso = 5;
		for (Alumno alumno : alumnos) {
			if (alumno.getNotaMedia() < notaSuspenso) {
				alumnos.remove(alumno);
			}
		}
	}

	// mwtodo utilizado con la clase ArrayList
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
