package es.cursojava.ejercicios.arrays;

import java.util.Scanner;

public class ArrayEjercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese cuantos numeros se van a guardar:");
		int numCantidad = scan.nextInt();
		int[] numeros = new int[numCantidad];

		for (int i = 0; i < numeros.length; i++) {
			scan = new Scanner(System.in);
			System.out.println("Ingrese el numero" + (i + 1) + " :");
			int numero = scan.nextInt();
			numeros[i] = numero;
		}
		if (numCantidad != 0) {
			System.out.println("------------- \nLista de los numeros:");
			for (int numerosTodos : numeros) {
				System.out.println(numerosTodos);
			}

			System.out.println("------------- \nLista de numeros invertida:");
			for (int i = numeros.length - 1 ; i >=0 ; i--) {
				System.out.println(numeros[i]);
			}
		
		}
	}
}
