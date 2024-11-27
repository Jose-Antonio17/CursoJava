package es.cursojava.ejercicios.condicionales;

public class CondicionalesEjercicio4 {

	public static void main (String[] args) {
		
		int duracionLlamada = 5;
		String dia = "domingo" ;
		int hora = 21;
		
		double precioLlamada = 0;
		
		if (duracionLlamada > 0) {
			if (duracionLlamada<=5) {
				precioLlamada = 1.0;
			} else if (duracionLlamada<9) {
				precioLlamada = 1.8;
			} else if (duracionLlamada<11) {
				precioLlamada = 2.5;
			} else {
				precioLlamada = (duracionLlamada - 10) * 0.5 + 2.5;
			}
		}
		if (dia.equals("domingo")) {
			precioLlamada = precioLlamada + precioLlamada * 0.03;
		} else {
			switch(hora){
				case 6,7,8,9,10,11 -> precioLlamada = precioLlamada + precioLlamada * 0.15;
				case 12,13,14,15,16,17,18,19,20,21,22 -> precioLlamada = precioLlamada + precioLlamada * 0.1;
				case 23,24,1,2,3,4,5 -> precioLlamada = precioLlamada - precioLlamada * 0.1;
				default -> precioLlamada = 0;
			}
		}
		if (precioLlamada == 0) {
		System.out.println("Hora incorrecta");
		} else {
		System.out.println("Coste de la llamanda: " + precioLlamada);
		}
	}
	
}
