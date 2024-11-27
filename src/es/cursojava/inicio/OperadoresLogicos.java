package es.cursojava.inicio;

public class OperadoresLogicos {

	public static void main (String [] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		boolean comparador = num1!=num2; //>,>=,<,<=,==,!=, !(negacion)
		System.out.println(comparador);
		
		boolean comparador2 = num1 != num2 && num2%2==0; // y and
		System.out.println(comparador2);
		
		boolean comparador3 = num1 != num2 || num1%2==0; // o or
		System.out.println(comparador3);
		
		boolean comparador4 = num1 != num2 & esPar(num2); // evalua ambas condiciones
		System.out.println(comparador4);
		
		boolean comparador5 = num1<7 && num2<10 || num1>num2; // evalua de izquierda a derecha
		System.out.println(comparador5);
		
	}
	
	private static boolean esPar (int numero) {
		System.out.println("Entra + " + numero);
		return numero%2==0;
	}
}
