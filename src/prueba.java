import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {

		int numSecreto = (int)(1000 * Math.random());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introducir un numero: ");
		int num = scan.nextInt();
		int intentos = 0 ;
		
		while (numSecreto != num) {
			intentos++;	
			if (numSecreto>num) {
				System.out.println("Ese numero es menor al numero secreto");
			} else {
				System.out.println("Ese numero es mayor al numero secreto");
			}
			System.out.println("Introduce otro numero: ");
			num = scan.nextInt();
			
		}
		System.out.println("Has descubierto el numero secreto \nEl numero secreto es: " + numSecreto);
		System.out.println("Numero de intentos-> " + intentos);
	}
}