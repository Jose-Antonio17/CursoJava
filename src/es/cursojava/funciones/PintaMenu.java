package es.cursojava.funciones;

import java.util.Scanner;

public class PintaMenu {
	public static String [] crearMenu (int elementos) {
		String [] menu = new String[elementos];
		for(int i = 0; i<menu.length;i++) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce la opción número "+ (i+1));
			menu[i] = (i+1) +".- "+ scan.nextLine();
		}
		return menu;
	}
	public static void pintaMenu (String [] menu) {
		//System.out.println("MENÚ");
		//for(String menuOpciones : menu) {
		//	System.out.println(menuOpciones);
		//}
		//System.out.println("Introduce una opción");
		pintaMenu(menu,"Introduce una opcion");
	}
	public static void pintaMenu (String [] menu, String texto) {
		System.out.println("MENÚ");
		for(String menuOpciones : menu) {
			System.out.println(menuOpciones);
		}
		System.out.println(texto);
	}
}
