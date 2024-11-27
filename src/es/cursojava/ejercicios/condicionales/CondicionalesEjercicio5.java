package es.cursojava.ejercicios.condicionales;

public class CondicionalesEjercicio5 {

	public static void main (String[] args) {
		
		String empleado = "Jose Antonio";
		int edad = 29 ;
		double experiencia = 2 ;
		String departamento = "Ventas";
		String categoria = "";
		String rango = "";
		
		if (edad < 18) {
			if (experiencia < 1) {
				categoria = "Becario Junior";
			} else {
				categoria = "Becario";
			}
		} else if (edad >=18 && edad <= 35) {
			if (experiencia < 1) {
				categoria = "Trainee";
			} else if (experiencia < 5) {
				categoria = "Junior";
			} else {
				categoria = "Senior";
				}	
		} else {
			if (experiencia < 1) {
				categoria = "Veterano";
			} else if (experiencia < 5) {
					categoria = "Veterano Especialista";
			} else {
				categoria = "Veterano Experto";	
				}
		}			
		if (departamento.equals("Departamento de TI") && experiencia > 5 ) {
			rango = "Tech Lead";
		} else if (departamento == "Recursos Humanos" && experiencia > 1 && experiencia < 5 ) {
			rango = "Gestor de Personas";
		} else if (departamento == "Ventas" && experiencia < 1 ) {
			rango = "Asistente de Ventas";
		} else {
			rango = "No aplica";
		}
		System.out.println("Datos del empleado");
		System.out.println("Nombre: " + empleado + "\nEdad: " + edad + "\nExperiencia: " + experiencia);
		System.out.println("Categoria: " + categoria + "\nRango: " + rango);
	};
}