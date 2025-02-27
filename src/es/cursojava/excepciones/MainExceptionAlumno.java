package es.cursojava.excepciones;

import es.cursojava.funciones.Utilidades;
import es.cursojava.poo.Alumno;

public class MainExceptionAlumno {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("Alumno " + (i + 1));
			String nombre = Utilidades.pideDatoString("Nombre del alumno: ");
			int edad = Utilidades.pideDatoNumero("Edad: ");
			double notaMedia = Utilidades.pideDatoNumero("Nota media: ");

			try {
				Alumno alumno = new Alumno(nombre, edad, notaMedia);
			} catch (IllegalArgumentException e) {
				System.out.println("Error edad: " + e.getMessage());
			} catch (NotaInvalidaExection e) {
				System.out.println("Nota media: " + e.getMessage());
			}
		}
	}
}
