package es.cursojava.ficherosejercicios;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.funciones.Utilidades;

public class FicherosEjercicio2 {

	private static final Logger logger = LoggerFactory.getLogger(FicherosEjercicio2.class);

	public static void main(String[] args) {

		String direct = Utilidades.pideDatoString("Introduce directorio");
		File directorio = new File(direct);
		// File directorio = new File("C:\\Users\\Tardes\\workspace\\");
		File[] ficheros = directorio.listFiles();
		for (File file : ficheros) {
			if (file.isFile()) {
				logger.info(file.getName() + "-" + String.valueOf(file.length()) + "-"
						+ (file.isHidden() ? "Archivo Oculto" : "Archivo Visible"));	
			} else {
				logger.info(file.getName());
				File ficheros1 = new File(directorio, "\\" + file.getName());
				File[] ficherosSub = ficheros1.listFiles();
				for (File file1 : ficherosSub) {
					if (file1.isFile()) {
						logger.info("\t" + file1.getName() + "-" + String.valueOf(file1.length()) + "-"
								+ (file1.isHidden() ? "Archivo Oculto" : "Archivo Visible"));
					} else {
						logger.info("\t" + file1.getName());
						File ficheros2 = new File(ficheros1, "\\" + file1.getName());
						File[] ficherosSubSub = ficheros2.listFiles();
						for (File file2 : ficherosSubSub) {
							if (file2.isFile()) {
								logger.info("\t\t" +file2.getName() + "-" + String.valueOf(file2.length()) + "-"
										+ (file2.isHidden() ? "Archivo Oculto" : "Archivo Visible"));
							} else {
								logger.info("\t\t" + file2.getName());
							}
						}
					}
				}
			}
		}
	}
}
