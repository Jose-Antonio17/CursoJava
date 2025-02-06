package es.cursojava.ejercicios.arrays;

//import java.util.Scanner;

public class ArrayEjercicio2 {

	public static void main(String[] args) {

		int[] numeros = { 15, 42, 16, 8, 84, 23 };
		int media = 0;
		int mayor=0;
		

		System.out.println("------------- \nLista de numeros:");
		for (int numero : numeros) {
			System.out.println(numero);
		}
		System.out.println("------------- \nMedia de numeros");
		for (int numero : numeros) {
			media+=numero;
		}
		System.out.println(media / 6);
		System.out.println("------------- \nNumero mayor");
		for (int numero : numeros) {
			if (numero>mayor)
				mayor=numero;
		}
		System.out.println(mayor);
		System.out.println("------------- \nNumero menor");
		int menor=mayor;
		for (int numero : numeros) {
			if (numero<menor)
				menor=numero;
		}
		System.out.println(menor);
	}

}
