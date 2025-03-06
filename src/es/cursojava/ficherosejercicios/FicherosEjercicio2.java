package es.cursojava.ficherosejercicios;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FicherosEjercicio2 {
	
	private static final Logger logger = LoggerFactory.getLogger(FicherosEjercicio2.class);

	public static void main(String[] args) {	

		File directorio = new File("C:\\Users\\Tardes\\workspace");
		File[] ficheros = directorio.listFiles();
		for (File file : ficheros) {
			logger.info(file.getName());
			File ficheros1 = new File(directorio, "\\" + file.getName());
			if (ficheros1.isDirectory()) {
				File[] ficherosSub = ficheros1.listFiles();
				for (File file1 : ficherosSub) {
					logger.info("\t" + file1.getName());
					File ficheros2 = new File(ficheros1, "\\" + file1.getName());
					if (ficheros2.isDirectory()) {
						File[] ficherosSubSub = ficheros2.listFiles();
						for (File file2 : ficherosSubSub) {
							logger.info("\t\t" + file2.getName());
						}
					}
				}
			}
		}
	}
}
