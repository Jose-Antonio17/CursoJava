package es.cursojava.arrays;

import java.util.Scanner;

public class ArrayEjercicios4 {

	public static void main(String[] args) {

		String palabra = "avatar";
		int vida = 6;
		char letra = ' ';

		char[] letras = new char[palabra.length()];
		char[] letrasAdivinadas = new char[palabra.length()];

		System.out.println("Adivina el nombre de la pelicula:");

		for (int i = 0; i < letras.length; i++) {
			letras[i] = palabra.charAt(i);
			letrasAdivinadas[i] = ' ';
			System.out.print("_ ");
		}
		System.out.println("\nVidas: " + vida);

		while (vida > 0) {
			
			boolean error = true;
			boolean ganaste = true;

			Scanner scan = new Scanner(System.in);
			System.out.println("Ingrese una letra:");
			letra = scan.next().charAt(0);
			System.out.println("\n---------------");
			System.out.println("Adivina el nombre de la pelicula:");

			for (int i = 0; i < letras.length; i++) {
				if (letrasAdivinadas[i] == ' ') {
					if (letra == letras[i]) {
						letrasAdivinadas[i] = letra;
						System.out.print(letrasAdivinadas[i] + " ");
						error = false;
					} else {
						System.out.print("_ ");
						ganaste = false;
					}
				} else {
					System.out.print(letrasAdivinadas[i] + " ");
				}
			}
			if (error) {
				vida-- ;
				System.out.println("\nNo acertaste, pierdes una vida");
				error = true;
			} else {
				System.out.println("\nAcertaste, la palabra contiene la letra "+letra);
			}
			System.out.println("Vidas: " + vida);
			if (ganaste) {
				vida = -1;
			}
		}
		if (vida == 0) {
			System.out.println("PERDISTE....!!!");
		} else {
			System.out.println("GANASTE....!!!");
		}
	}
}
