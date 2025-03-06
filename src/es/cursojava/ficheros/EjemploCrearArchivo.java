package es.cursojava.ficheros;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
    	LocalDateTime datetime = LocalDateTime.now();
    	
    	System.out.println(datetime.getYear());
    	System.out.println(datetime.getMonthValue());
    	//System.out.println(datetime.getMonth());
    	
    	Instant instant = Instant.now();
    	System.out.println(instant.now());
    	//Ruta relativa a la carpeta del proyecto
        String nombreArchivo = "./recursos/java3.txt";

        ArchivoServicio service = new ArchivoServicio();
        //service.mostrarContenidoDirectorio("C:\\Users\\Tardes\\");
        service.crearArchivo2(nombreArchivo);
        
//        LocalDate dateToday = LocalDate.now();  
//        String nombreArchivo = "./recursos/Jose_"+ dateToday +".txt";
//        service.crearArchivo(nombreArchivo2);
    }
}
