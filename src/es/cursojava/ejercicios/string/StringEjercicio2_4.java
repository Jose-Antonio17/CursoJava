package es.cursojava.ejercicios.string;

import java.util.Scanner;

public class StringEjercicio2_4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introducir palabra");
		String palabras = scan.nextLine();
		int i = 0;
		int num = 0;
		String palabraGrande = "";

		while (palabras.contains(" ")) {
			num = palabras.indexOf(" ");
			if (num > i) {
				palabraGrande = palabras.substring(0, num);
				i = num;
			}
			palabras = palabras.substring(num + 1);
		}
		if (palabras.length() > i) {
			palabraGrande = palabras;
		}
		System.out.println("La palabra mas grande es: " + palabraGrande);
	}
}
