package es.cursojava.funciones;

public class PruebaUtilidades {
	public static void main(String []args) {
		
		//Utilidades.pideDatoNumero("Introduce una opcion:");
		//Utilidades.pideDatoNumero("Introduce tu edad:");
		//Utilidades.pideDatoString("Introduce tu nombre:");
		//Utilidades.pideDatoString("Introduce tu mes de nacimiento:");
		//PintaMenu.pintaMenu(args);
		
		System.out.println("CREAR MENÚ");
		int num = Utilidades.pideDatoNumero("¿Cuantos opciones tiene que el menu que va a crear?");
		String [] menu = PintaMenu.crearMenu(num);

		PintaMenu.pintaMenu(menu);
		System.out.println("------------");
		PintaMenu.pintaMenu(menu, "Elije una opción");
	}
}
