package es.cursojava.ejercicios.operadores;

import java.util.Scanner;

public class OperadoresEjercicio5 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la temperatura en grados Celsius:");
		double temperatura = scan.nextDouble();
		
		double resultado = temperatura * 9 / 5 + 32; // 9/5 -> da resutaldo entero 9.0/5.0 -> da resultado con decimal
				
		System.out.println("La temperatura en grados Fahrenheit es: " + resultado);
			
	}
}
