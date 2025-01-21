package es.cursojava.funciones;

import java.util.Scanner;

public class Utilidades {

	public static int pideDatoNumero(String texto) {
		System.out.println(texto);
		Scanner teclado = new Scanner(System.in);
		int entrada = teclado.nextInt();
		return entrada;
	}

	/**
	 * Funcion que retorna un texto de tipo String
	 * @param texto
	 * @return
	 */
	public static String pideDatoString(String texto) {
		System.out.println(texto);
		Scanner teclado = new Scanner(System.in);
		String entrada = teclado.nextLine();
		return entrada;
	}

	public static void pintaMenu(String menu) {
		System.out.println(menu);
	}
}
