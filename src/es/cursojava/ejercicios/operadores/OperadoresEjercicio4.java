package es.cursojava.ejercicios.operadores;

import java.util.Scanner;

public class OperadoresEjercicio4 {

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int num1 = scan.nextInt();

		boolean resultado1 = num1%2 ==0;
	
		System.out.println(num1 + " es par: " + resultado1);
		System.out.println(num1 + " es impar: " + !resultado1);	
		
		scan.close();
		
	}
}
