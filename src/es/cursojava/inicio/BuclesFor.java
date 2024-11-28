package es.cursojava.inicio;

public class BuclesFor {

	public static void main (String[] args) {
		
		for ( int i=1 ; i<11 ; i++ ) {
			System.out.println("5 x " + i + " = " + (5*i));
			}
		System.out.println("Ejercicio 2");
		for ( int j=1 ; j<11 ; j++ ) {
			if ((5*j)%2 == 0) {
				System.out.println("5 x " + j + " = " + (5*j));
			}
		}
		for ( int k=2 ; k<11 ; k+=2 ) {
				System.out.println("5 x " + k + " = " + (5*k));
			}
		System.out.println("Termina");
		
		//Instruccion continue
		for ( int i=1 ; i<100 ; i++ ) {
			if (i%2==0) {
				continue;	//vuelve a ejecutar el for, se salta todas las lineas siguientes 
			}
			System.out.println(i);
			
		//Introduccion break
		for ( int j=1 ; j<10 ; j++ ) {
			if (j%2==0) {
				break;	//finaliza el bucle cuando se cumple el if
			}
			System.out.println(j);
		}
	}
	}
}