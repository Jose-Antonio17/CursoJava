package es.cursojava.ejercicios.bucles;

import java.util.Scanner;

public class BuclesEjercicio5 {

public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar números de alumnos:");
		int num = scan.nextInt();
		int i = 1 ;
		double nota = 0 ;
		double promedio = 0 ;
		
		while (i<=num) {
			
			System.out.println("Ingresar la nota del alumno número " + i + " :");
			nota = scan.nextInt();
			if (i == 1) {
				promedio = nota ;
			} else {
			promedio = promedio + nota;
			}
			i++;	
		}
		promedio = promedio / num ;
		System.out.println("La nota media de todos los alumnos es:" + promedio);
	}
}
