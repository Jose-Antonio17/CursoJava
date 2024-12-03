package es.cursojava.ejercicios.string;

import java.util.Scanner;

public class StringEjercicio2_3 {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introducir palabra");
		String palindromo = scan.nextLine();
		String palabraVocales = palindromo.toLowerCase();
		
		int vocalA = 0;
		int vocalE = 0;
		int vocalI = 0;
		int vocalO = 0;
		int vocalU = 0;
		
		for ( int i=0 ; i<palabraVocales.length() ; i++) {
			char vocal = palabraVocales.charAt(i);
			if(vocal == 'a') {
				vocalA++;
			}
			if(vocal == 'e') {
				vocalE++;
			}
			if(vocal == 'i') {
				vocalI++;
			}
			if(vocal == 'o') {
				vocalO++;
			}
			if(vocal == 'u') {
				vocalU++;
			}
		}
		System.out.println("Tiene " + vocalA + " vocales A");
		System.out.println("Tiene " + vocalE + " vocales E");
		System.out.println("Tiene " + vocalI + " vocales I");
		System.out.println("Tiene " + vocalO + " vocales O");
		System.out.println("Tiene " + vocalU + " vocales U");
		
	}

}
