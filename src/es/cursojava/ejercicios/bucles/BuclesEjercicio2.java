package es.cursojava.ejercicios.bucles;

import java.util.Scanner;

public class BuclesEjercicio2 {

	public static void main (String [] args) {
		
		int i = 0 ;
		int num = 0 ; 
		int multiplo3 = 0 ;
		int multiplo5 = 0 ;
		while (i<10) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Ingresar el número " + (i+1) + " :");
			num = scan.nextInt();
			if (num%3 == 0) {
				multiplo3++;
			}
			if (num%5 == 0) {
				multiplo5++;
			}
			i++;		
		}
		if (multiplo3 == 0){
			System.out.println("Ningún número es multiplo de 3");
		} else {
			System.out.println(multiplo3 + " números son multiplos de 3");
		}
		if (multiplo5 == 0){
			System.out.println("Ningún número es multiplo de 5");
		} else {
		}
		System.out.println(multiplo5 + " números son multiplos de 5");
	}
}
