package es.cursojava.ejercicios.operadores;

import java.util.Scanner;

public class OperadoresEjercicio3 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Ingrese otro numero:");
		int num2 = scan.nextInt();

		
		int resultado1 = num1 + num2;
		int resultado2 = num1 - num2;
		int resultado3 = num1 * num2;
		int resultado4 = num1 / num2;
		
		System.out.println("La suma es: " + resultado1);
		System.out.println("La resta es: " + resultado2);
		System.out.println("La multiplicacion es: " + resultado3);
		System.out.println("La division es: " + resultado4);
		
	}
}
