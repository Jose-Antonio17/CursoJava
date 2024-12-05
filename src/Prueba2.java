import java.util.Scanner;

public class Prueba2 {

	public static void main(String[] args) {

		System.out.println("Este programa pintará una pirámide");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduzca el carácter con el que quiera dibujar la pirámide: ");
		String caracter = scan.nextLine();

		System.out.print("Introduzca la altura de la pirámide: ");
		int altura = scan.nextInt()	;
		int cantidad = 1;// esta variable es la cantidad de variables que se dibujaran
		int espacios = 0;// el numero de espacios que necesitaremos

		// averiguamos los espacios que necesitamos en la primera linea
		for (int i = 0; i < altura; i++) {
			espacios++;
		}

		System.out.println();

		for (int i = 0; i < altura; i++) {
			// dibujamos los espacios sin saltar de linea
			for (int n = 0; n < espacios; n++) {
				System.out.print(" ");
			}
			espacios--;
			// una vez dibujados, pintamos los caracteres
			for (int n = 1; n <= cantidad; n++) {
				System.out.print(caracter);
			}
			// al salir del bucle al dibujar la linea entera, hacemos salto de linea e
			// incrementamos cantidad
			cantidad += 2;
			System.out.println();
		}
	}

}
