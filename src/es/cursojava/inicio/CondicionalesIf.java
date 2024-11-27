package es.cursojava.inicio;

public class CondicionalesIf {

	public static void main(String[] args) {
		
		System.out.println("Empieza");
			double numero = Math.random();
			System.out.println(numero);
			
			if (numero>0.5) {
				System.out.println("El numero es mayor a 0.5");
			} else {
				System.out.println("El numero en menor o igual a 0.5");
			}
		
		System.out.println("Termina");
		
		double nota = 10 ;
		if (nota>9) {
			System.out.println("Sobresaliente");
		} else if (nota>7) {
			System.out.println("Aprobado");
		}	else {
			System.out.println("El numero en menor o igual a 0.5");
		}
	}
	
}
