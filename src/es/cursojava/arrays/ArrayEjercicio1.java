package es.cursojava.arrays;

import java.util.Scanner;

public class ArrayEjercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el numero de alumnos:");
		int numAlumnos = scan.nextInt();
		String[] clase = new String[numAlumnos];

		for (int i = 0; i < clase.length; i++) {
			scan = new Scanner(System.in);
			System.out.println("Ingrese el nombre del alumno " + (i + 1) + " :");
			String nombre = scan.nextLine();
			clase[i] = nombre;
		}
		if (numAlumnos != 0) {
			System.out.println("------------- \nLista de alumnos:");
			for (String nombreTotal : clase) {
				System.out.println(nombreTotal);
			}

			System.out.println("------------- \nAlumnos que su nombre comienza con la letra A:");
			for (String nombreA : clase) {
				if (nombreA.indexOf("A") == 0) {
					System.out.println(nombreA);
				}
			}
		} else {
			System.out.println("No hay alumnos en la clase");
		}
	}

}
