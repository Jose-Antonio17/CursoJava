package es.cursojava.ejercicios.arrays;

import java.util.Scanner;

public class ArrayEjercicio5 {

	public static void main(String[] args) {
		
		int filas = 4;
		int columnas = 4;

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
				System.out.print(numeros[i][j]+" ");
			}
		}
		System.out.println("\n===========");
		for (int i = 0; i < numeros.length; i++) {
			float media = 0;
			for (int j = 0; j < numeros[i].length; j++) {
				media += numeros[i][j];
			}
			System.out.println("La media de la fila " + i + " :" + (media / filas));
		}
		System.out.println("===========");
		for (int i = 0; i < numeros.length; i++) {
			if (i > 0) {
				System.out.println();
			}
			for (int j = 0; j < numeros[i].length; j++) {
				if (i == j) {
					System.out.print(numeros[i][j]+" ");
				} else {
					System.out.print("  ");
				}
			}
			}
			
	}
}
