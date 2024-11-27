package es.cursojava.ejercicios.condicionales;

import java.util.Scanner;

public class CondicionalesEjercicio3 {

	public static void main (String[] args) {
		
		System.out.println("Opciones:\n1. Pintar Cuadrado\n2. Validar email\n3. Anadir email\n4. Salir");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Elige una opcion:");
		int opcion = scan.nextInt();
		
		switch (opcion) {
			case 1:  System.out.println("A selecionado Pintar Cuadro");break;
			case 2:  System.out.println("A selecionado Validar email");break;
			case 3:  System.out.println("A selecionado Anadir email");break;
			case 4:  System.out.println("Adios");break;
			default:  System.out.println("Opcion incorrecta");
		}
	}
	
}
