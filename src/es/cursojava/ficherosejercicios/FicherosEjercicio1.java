package es.cursojava.ficherosejercicios;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.funciones.Utilidades;

public class FicherosEjercicio1 {

	private static final Logger logger = LoggerFactory.getLogger(FicherosEjercicio1.class);

	public static void main(String[] args) {

		File directorio = new File("C:\\Users\\Tardes\\Desktop\\Prueba\\Ejercicio1");

		File directorioImagenes = new File(directorio, "Imagenes");
		directorioImagenes.mkdir();
		File directorioDocumentos = new File(directorio, "Documentos");
		directorioDocumentos.mkdir();
		File directorioOtros = new File(directorio, "Otros");
		directorioOtros.mkdir();

		for (int i = 0; i < 5; i++) {
			String nombre = Utilidades.pideDatoString("Ingresar el nombre del archivo " + (i + 1));
			if (nombre.charAt(nombre.length() - 4) == '.') {
				String extension = nombre.substring(nombre.length() - 3);
				switch (extension) {
				case "jpg":
					File directorioNuevo1 = new File(directorioImagenes, nombre);
					try {
						directorioNuevo1.createNewFile();
					} catch (IOException e) {
						logger.error("Error al crear fichero");
					}
					break;
				case "txt":
					File directorioNuevo2 = new File(directorioDocumentos, nombre);
					try {
						directorioNuevo2.createNewFile();
					} catch (IOException e) {
						logger.error("Error al crear fichero");
					}
					break;
				default:
					File directorioNuevo3 = new File(directorioOtros, nombre);
					try {
						directorioNuevo3.createNewFile();
					} catch (IOException e) {
						logger.error("Error al crear fichero");
					}
				}
			}
		}

		File[] ficheros = directorioOtros.listFiles();
		int i = 1;
		for (File file : ficheros) {
			String extension = file.getName().substring(file.getName().length() - 4);
			File directorioRenombrado = new File(directorioOtros, "Jose" + i + extension);
			file.renameTo(directorioRenombrado);
			i++;
		}

	}
}
