package es.cursojava.arrays;

public class ArraysBidimensionales {
	
	public static void main(String[] args) {
		int filas = 2;
		int columnas = 6;
		int [][] numeros = new int [filas][columnas];
		
		for (int fila=0; fila<numeros.length ; fila++) {
			
			for (int columna=0 ; columna < numeros[fila].length   ; columna++) {
				System.out.println("["+fila+"]["+columna+"]: "+ numeros[fila][columna]);
			}	
		}
	}
}
