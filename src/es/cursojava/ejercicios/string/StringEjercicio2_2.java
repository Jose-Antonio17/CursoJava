package es.cursojava.ejercicios.string;

import java.util.Scanner;

public class StringEjercicio2_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introducir palabra");
		String palindromo = scan.nextLine();
		String palabraMin = palindromo.toLowerCase();

		int num = palabraMin.length() - 1;

		for (int j = 0, i = num; j <= num/2; j++, i--) {
			if (palabraMin.charAt(j) == palabraMin.charAt(i)) {
				if(j == num/2) {
					System.out.println("Es palíndromo");
				}
				continue;
			} else {
				System.out.println("No es palíndromo");
				break;
			} 
		}
	}
}
