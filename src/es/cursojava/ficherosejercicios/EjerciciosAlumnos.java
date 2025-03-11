package es.cursojava.ficherosejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.cursojava.poo.Alumno;

public class EjerciciosAlumnos {

	public static void main(String[] args) {

		String[] asignaturasAlumno1 = { "Algebra", "Fisica" };
		Alumno a1 = new Alumno("Jorge", "Rufo", 32, 6, "jorge@gmail.com", asignaturasAlumno1);

		String[] asignaturasAlumno2 = { "Historia", "Ingles", "Arte" };
		Alumno a2 = new Alumno("Sergio", "Melero", 28, 10, "sergio@gmail.com", asignaturasAlumno2);

		String[] asignaturasAlumno3 = { "Matematica", "Quimica", "Fisica" };
		Alumno a3 = new Alumno("Jose", "Cordoba", 35, 8, "jose@gmail.com", asignaturasAlumno3);

		List<Alumno> lista = Arrays.asList(a1, a2, a3);

		String nombreArchivo = "./recursos/alumnos.txt";
		EjerciciosAlumnos ejAlumnos = new EjerciciosAlumnos();

		for (Alumno alumno : lista) {
			ejAlumnos.crearArchivo5(nombreArchivo, alumno);
		}
	}

	public void crearArchivo4(String nombre, Alumno alumno) {
		File archivo = new File(nombre);
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {

			buffer.append(alumno.getNombre() + " | ").append(alumno.getApellidos() + " | ")
					.append(String.valueOf(alumno.getEdad()) + " | ")
					.append(String.valueOf(alumno.getNotaMedia()) + " | ");
			for (int i = 0; i < alumno.getAsignaturas().length; i++) {
				if (i < alumno.getAsignaturas().length - 1) {
					buffer.append(alumno.getAsignaturas()[i] + " , ");
				} else {
					buffer.append(alumno.getAsignaturas()[i]);
				}
			}
			buffer.append("\n");
			// buffer.close();
			System.out.println("Alumno " + alumno.getNombre() + " añadido con exito al fichero!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void crearArchivo5(String nombreFichero, Alumno alumno) {
		Path ruta = Paths.get(nombreFichero);
		String contenido = alumno.getNombre() + " | " + alumno.getApellidos() + " | " + alumno.getEdad() + " | "
				+ alumno.getNotaMedia() + " | ";
		for (int i = 0; i < alumno.getAsignaturas().length; i++) {
			if (i < alumno.getAsignaturas().length - 1) {
				contenido += alumno.getAsignaturas()[i] + " , ";
			} else {
				contenido += alumno.getAsignaturas()[i] + "\n";
			}
		}
		try {
			Files.write(ruta, contenido.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
					//StandardOpenOption.WRITE
			System.out.println("Escritura completada.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
