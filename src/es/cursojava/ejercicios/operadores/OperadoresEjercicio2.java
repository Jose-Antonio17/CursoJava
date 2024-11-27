package es.cursojava.ejercicios.operadores;

import java.util.Scanner;

public class OperadoresEjercicio2 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Introduce otro numero:");
		int num2 = scan.nextInt();
		
		boolean comparador1 = num1 < num2;
		boolean comparador2 = num1 > num2;
		boolean comparador3 = num1 == num2;
		
		System.out.println(num1 + " es menor a " + num2 + " = " + comparador1);
		System.out.println(num1 + " es mayor a " + num2 + " = " +comparador2);
		System.out.println(num1 + " es igual a " + num2 + " = " +comparador3);
		
	}
}
