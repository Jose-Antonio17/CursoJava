package es.cursojava.ejercicios.arrays;

import java.util.Scanner;

public class ArrayEjercicio6 {

	public static void main(String[] args) {

		int filas = 2;
		int columnas = 3;

		int[][] numeros = new int[filas][columnas];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				Scanner scan = new Scanner(System.in);
				System.out.println("Ingresar un número para la ubicacion" + "[" + i + "][" + j + "]: ");
				int numero = scan.nextInt();
				numeros[i][j] = numero;
			}
		}
		System.out.println("===========");
		for (int i = 0; i < numeros.length; i++) {
			if (i > 0) {
				System.out.println();
			}
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
		}
		System.out.println("\n===========");
		for (int[] is : numeros) {	
			System.out.println();
			for (int i : is)
			System.out.print(i+" ");
		}
	}
}
