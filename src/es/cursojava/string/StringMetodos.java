package es.cursojava.string;

public class StringMetodos {

	public static void main(String[] args) {
		
		String mensaj = "hola";
		String mensaje2 = mensaj.toUpperCase();
		String nombre = "Marta";
		
		System.out.println(mensaj + " " + nombre + "qué tal estas?");
		
		String mensaje = "		Hola qué tal?		";
		char caracter = mensaje.charAt(0);
		System.out.println(caracter);
		
		System.out.println(mensaje.contains("Hola"));
		
		System.out.println(mensaje.endsWith("tal?"));
		System.out.println(mensaje.startsWith("Hola"));
		
		System.out.println(mensaje.indexOf("a"));
		System.out.println(mensaje.lastIndexOf("z"));
		
		String msg2 = "   ";
		String men = msg2.trim();
		System.out.println(msg2.isBlank());
		System.out.println(msg2.isEmpty());
		
		System.out.println(mensaje.trim());
		System.out.println(mensaje);
		
		
		System.out.println(men.length());
		System.out.println(msg2.length());
		
		System.out.println(mensaje.substring(4));
		System.out.println(mensaje.substring(4,8));
	}
	
}
