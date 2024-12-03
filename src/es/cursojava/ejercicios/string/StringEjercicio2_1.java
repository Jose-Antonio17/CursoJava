package es.cursojava.ejercicios.string;

import java.util.Scanner;

public class StringEjercicio2_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introducir palabra");
		String palabra = scan.nextLine();

		int num = palabra.length() - 1;

		for (int i = num ; i>=0 ; i--) {
			System.out.print(palabra.charAt(i));
			
		}
	}

}
