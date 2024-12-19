package es.cursojava.ejercicios.arrays;

import java.util.Scanner;

public class ArrayEjercicio7 {
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
			for (int j = 0; j < numeros[i].length; j++) {
				if (i == j) {
					System.out.print(numeros[i][j] + "\t");
				} else {
					System.out.print("*\t");
				}

			}
			System.out.println();
		}
		System.out.println("===========");
		int num2 = 0;
		int tamanio = numeros.length;
		for (int i = 0; i < tamanio/2; i++) {
			num2 = numeros[tamanio-1-i][tamanio-1-i];
			numeros[tamanio-1-i][tamanio-1-i] = numeros[i][i];
			numeros[i][i] = num2;
		}
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if (i == j) {
					System.out.print(numeros[i][j] + "\t");
				} else {
					System.out.print("*\t");
				}

			}
			System.out.println();
		}

	}
}
