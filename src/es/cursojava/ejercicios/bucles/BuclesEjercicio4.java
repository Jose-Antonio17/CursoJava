package es.cursojava.ejercicios.bucles;

import java.util.Scanner;

public class BuclesEjercicio4 {

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar hasta que número mostar la tabla de multiplicar:");
		int num = scan.nextInt();
		int j = 1;
		
		while (j<=num) {
		for (int i=1 ; i<11 ; i++ ) {
				System.out.println(j + " x " + i + " = " + (j*i));
			}
		j++;
		}
	}
}
