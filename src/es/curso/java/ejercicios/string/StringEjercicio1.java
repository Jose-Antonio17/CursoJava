package es.curso.java.ejercicios.string;

import java.util.Scanner;

public class StringEjercicio1 {
	
	public static void main (String[] args) {
		
		int opcion = 0 ;		
		do {
		System.out.println("Opciones:\n1. Pintar Cuadrado\n2. Validar email\n3. Anadir email\n4. Salir");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Elige una opcion:");
		opcion = scan.nextInt();
		
		if (opcion == 1) {
			System.out.println("Indicar tamaño de cuadrado:");
			int num = scan.nextInt();
			int j = 0 ;
			while (j<num) {				
				for(int i=0;i<num;i++) {
					if (j>0 && j<(num-1)) {
						if(i==0) {
							System.out.print("* ");
						} else if (i==(num-1)) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					} else {
					System.out.print("* ");
					}
				}
					System.out.print("\n");
					j++;
				}
			}
		
		if (opcion == 2) {
			scan = new Scanner(System.in);
			System.out.println("Introducir email");
			String correo = scan.nextLine();
			
			if(correo.indexOf("@") != correo.lastIndexOf("@")){
				System.out.println("Correo no valido, tiene mas de un @");
			}
			if(correo.contains(" ")) {
				System.out.println("Correo no valido, tiene espacios en blanco");
			}
			int num = correo.indexOf("@");
			String correo2 = correo.substring(num);
			if(!correo2.contains(".")) {
				System.out.println("Correo no valido, no hay punto despues del @");
			}
			int num2 = correo2.indexOf(".")+num;
			String correo3 = correo.substring(num,num2);
			if(correo3.length()<3) {
				System.out.println("Correo no valido, hay menos de 3 caracteres en el @ y el .");
			}
			int num3 = correo.lastIndexOf(".");
			if(correo.length()>(num3+6) || correo.length()<(num3+2)){
				System.out.println("Correo no valido, no cumple los caracteres despues del punto");
			}
			
		}
		
		} while (opcion < 4);
		
	}

}
