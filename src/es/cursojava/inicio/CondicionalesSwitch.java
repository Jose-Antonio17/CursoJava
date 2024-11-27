package es.cursojava.inicio;

public class CondicionalesSwitch {

	public static void main (String [] args) {
		
		int nota = 9 ;
		
		switch(nota) {
		
			case 1: System.out.println("Suspenso");break;
			case 2: System.out.println("Suspenso");break;
			case 3: System.out.println("Suspenso");break;
			case 4: System.out.println("Suspenso");break;
			case 5: System.out.println("Aprobado");break;
			case 6: System.out.println("Aprobado");break;
			case 7: System.out.println("Notable");break;
			case 8: System.out.println("Notable");break;
			case 9: System.out.println("Sobresaliente");break;
			case 10: System.out.println("Sobresalinete");break;
			default: System.out.println("Nota incorrecta");break;
		}
		int nota2 = 7 ;
		
			switch(nota2) {
			
			case 1: 
			case 2: 
			case 3:
			case 4: System.out.println("Suspenso");break;
			case 5: 
			case 6: System.out.println("Aprobado");break;
			case 7: 
			case 8: System.out.println("Notable");break;
			case 9: 
			case 10: System.out.println("Sobresalinete");break;
			default: System.out.println("Nota incorrecta");break;
		
			}
			
		int nota3 = 6 ;
		
			switch(nota3) {
			
			case 0,1,2,3,4 -> System.out.println("Suspenso");
			case 5,6 -> System.out.println("Aprobado"); 
			case 7,8 -> System.out.println("Notable"); 
			case 9,10 -> System.out.println("Sobresalinete");
			default -> System.out.println("Nota incorrecta");
					
		}
		
	}
}
