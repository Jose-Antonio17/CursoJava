package es.cursojava.ficherosejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FicherosQuijote {

	public static void main(String[] args) {

		String nombreArchivo = "D:\\ficheros\\Quijote.txt";
		FicherosQuijote servicio = new FicherosQuijote();

		try {
			System.out.println(servicio.contarLineas(nombreArchivo));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String palabra = "quijote";
		String palabra1 = "sancho";
		try {
			System.out.println(servicio.contarPalabra(nombreArchivo, palabra) + " veces que la palabra " + palabra
					+ " aparece en el libro");
			System.out.println(servicio.contarPalabra(nombreArchivo, palabra1) + " veces que la palabra " + palabra1
					+ " aparece en el libro");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int contarLineas(String nombre) throws IOException {
		File archivo = new File(nombre);
		int i = 0;
		String linea;
		try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
			while ((linea = reader.readLine()) != null) {
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return i;
	}

	public int contarPalabra(String nombre, String palabra) throws IOException {
		File archivo = new File(nombre);
		int i = 0;
		String linea;
		try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
			while ((linea = reader.readLine()) != null) {
				String[] palabras = linea.split(" ");
				for (String plbra : palabras) {
					if (plbra.toLowerCase().contains(palabra)) {
						++i;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return i;
	}
}
