package es.cursojava.ejercicios.bucles;

import java.util.Scanner;

public class BuclesEjercicio7 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar el numero de números de la serie de Fibonacci:");
		int num = scan.nextInt();
		int i = 0 ;
		int j = 1 ;
		int suma = 0;
		
		for (int k=0 ; k<num ; k++ ) {

			if (i == 0) {
				System.out.println(i);
				System.out.println(j);
				suma = i+j;
				System.out.println(suma);
				i=j;
				j=suma;
				continue;
			}
			i=j;
			j=suma;
			suma = i + j ;
				System.out.println(suma);	

		}
	}
}

