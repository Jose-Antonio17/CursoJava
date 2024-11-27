package es.cursojava.ejercicios.operadores;

import java.util.Scanner;

public class OperadoresEjercicio1 {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la base del rectangulo:");
		int base = scan.nextInt();
		
		System.out.println("Ingrese la altura del rectangulo:");
		int altura = scan.nextInt();
		
		int area = base * altura;
		
		System.out.println("El area del rectangulo es: " + area);
		
	}	
}