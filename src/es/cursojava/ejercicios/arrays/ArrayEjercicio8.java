package es.cursojava.ejercicios.arrays;

import java.util.Scanner;

public class ArrayEjercicio8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresar el número de aulas:");
		int num = scan.nextInt();

		String[][] clases = new String[num][2];

		int opcion = 0;
		do {
			System.out.println("--------------------------------------");
			System.out.println(
					"Opciones:\n1. PEDIR DATOS\n2. MOSTRAR ALUMNOS POR AULA\n3. BUSCAR ALUMNO\n4. BORRAR ALUMNO\n5. SALIR");

			scan = new Scanner(System.in);
			System.out.println("Elige una opcion:");
			opcion = scan.nextInt();

			if (opcion == 1) {

				for (int i = 0; i < clases.length; i++) {
					for (int j = 0; j < clases[i].length; j++) {
						if (clases[i][j] == null) {
							scan = new Scanner(System.in);
							System.out.println(
									"Introduce el nombre de alumno de la mesa " + (j + 1) + " del aula " + (i + 1));
							clases[i][j] = scan.nextLine();
						}
					}
				}
			}
			if (opcion == 2) {
				scan = new Scanner(System.in);
				System.out.println("Elige un aula:");
				int aulaNum = scan.nextInt();
				System.out.println("Lista de alumnos de la clase " + aulaNum + ":");
				for (int j = 0; j < clases.length; j++) {
					System.out.println(" - " + clases[aulaNum - 1][j]);
				}
			}
			if (opcion == 3) {
				scan = new Scanner(System.in);
				System.out.println("Ingresar el nombre del alumno que quiere buscar:");
				String alumnoBuscar = scan.nextLine();

				for (int i = 0; i < clases.length; i++) {
					for (int j = 0; j < clases[i].length; j++) {
						if (clases[i][j].equals(alumnoBuscar)) {
							System.out.println("El alumno " + alumnoBuscar + " esta en la mesa " + (j + 1)
									+ " del aula " + (i + 1));
						}
					}
				}
			}
			if (opcion == 4) {
				scan = new Scanner(System.in);
				System.out.println("Ingresar el nombre del alumno que quiere eliminar:");
				String alumnoBuscar = scan.nextLine();

				int i = 0;
				int j = 0;

				for (i = 0; i < clases.length; i++) {
					for (j = 0; j < clases[i].length; j++) {
						if (clases[i][j].equals(alumnoBuscar)) {
							clases[i][j] = null;
							break;
						}
					}
				}
				if (clases[(i - 1)][j] == null) {
					System.out.println("Se ha eliminado correctamente a " + alumnoBuscar);
				}
			}
		} while (opcion < 5);
	}
}