package es.cursojava.ejercicios.condicionales;

import java.util.Scanner;

public class CondicionalesEjercicio2 {

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el primer numero:");
		double num1 = scan.nextDouble();
				
		System.out.println("Ingrese el segundo numero:");
		double num2 = scan.nextDouble();

		//scan = new Scanner(System.in);
		scan.nextLine();
		System.out.println("Ingrese la operacion a realizar:");
		String operacion = scan.nextLine();
		
		double resultado = 0;
		
		switch (operacion) {
			case "suma","+"-> resultado = num1 + num2;
			case "resta","-"-> resultado = num1 - num2;
			case "division","/"-> resultado = num1 / num2;
			case "multiplicacion","*"-> resultado = num1 * num2;
			default-> resultado = 0;
			}
		if (resultado == 0) {
			System.out.println("Operacion solicitada no valida");
		} else {
			System.out.println("El resultado es: " + resultado);
		}
	}
	
}
