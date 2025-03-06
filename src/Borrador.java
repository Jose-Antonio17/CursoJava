import java.io.File;
import java.io.IOException;


//import es.cursojava.funciones.Utilidades;

public class Borrador {

	public static void main(String[] args) {

		File directorioNuevo = new File("C:\\Users\\Tardes\\Desktop\\Prueba");
		File fichero = new File("C:\\Users\\Tardes\\Desktop\\Prueba\\Prueba.txt");
		
		System.out.println(directorioNuevo.isDirectory());
		System.out.println(fichero.isFile());
		
		for (int i = 0; i < 8; i++) {
			File carpeta = new File(directorioNuevo, "CARPETA"+i);
			carpeta.mkdir();
		}
		
		String [] lista = directorioNuevo.list();
		for (String nombre : lista) {
			System.out.println(nombre);
		}
		
		File [] ficheros = directorioNuevo.listFiles();
		for (File file : ficheros) {
			System.out.println(file);
		}
		
		File fichero2 = new File("C:\\Users\\Tardes\\Desktop\\Prueba\\Prueba2.txt");
		try {
			fichero2.createNewFile();
		} catch (IOException e) {
			System.err.println("Error al crear archivos");
		}
		

	}
}