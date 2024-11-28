package es.cursojava.ejercicios.bucles;

import java.util.Scanner;

public class BuclesEjercicio6 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar un número:");
		int num = scan.nextInt();
		while (num>1) {
			if (num%2 == 0) {
				num = num /2;
				System.out.println(num);
				continue;
			}
			if (num%2 != 0) {
				num = (num * 3) + 1 ;
				System.out.println(num);
			}
		}
	}
}
