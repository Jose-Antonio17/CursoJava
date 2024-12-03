package es.cursojava.ejercicios.bucles;

import java.util.Scanner;

public class BuclesEjercicio8 {
	
public static void main (String [] args) {
		
		int i = 0 ;
		int top10 = 0 ;
		int tenista = 0 ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar números de tenistas:");
		int num = scan.nextInt();
		
		while (i<=num) {
			System.out.println("Ingresar el tenista número " + (i+1) + " :");
			tenista = scan.nextInt();
			if (tenista<10) {
				top10++;
			}
			i++;		
		}
		if (top10 == 0){
			System.out.println("Ningún tenista esta entre los 10 primeros de la ATP");
		} else {
			System.out.println(top10 + " tenistas estan entre los 10 primeros de la ATP");
		}
	}

}
