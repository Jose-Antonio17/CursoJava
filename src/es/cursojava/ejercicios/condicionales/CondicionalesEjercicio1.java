package es.cursojava.ejercicios.condicionales;

public class CondicionalesEjercicio1 {

	public static void main (String [] args) {
		
		String asignatura = "Quimica" ;
		String nombreAlumno = "Jose Antonio";
		int nota = 10 ;
		String resultado;
		
		switch (nota) {		
			case 1,2,3,4 -> resultado = "Suspenso"; 
			case 5,6 -> resultado ="Aprobado"; 
			case 7,8 -> resultado ="Notable"; 
			case 9,10 -> resultado ="Sobresaliente"; 
			default -> resultado ="Nota incorrecta"; 
			}
		if (resultado == "Nota incorrecta") {
			System.out.println("La nota ingresada no es correcta");
		} else {				
		System.out.println(nombreAlumno + " en la asignatura de " + asignatura + " tiene un " + resultado);
		}
	}
	
}
