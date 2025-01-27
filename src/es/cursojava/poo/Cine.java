package es.cursojava.poo;

import es.cursojava.funciones.PintaMenu;
import es.cursojava.funciones.Utilidades;

public class Cine {

	private String nombre;
	private Sala[] salas;

	public Cine(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {

		Cine cineJose = new Cine("Cinepolis");
		Sala[] salasCine = cineJose.crearSalas();
		cineJose.salas = salasCine;

		Espectador[] espectadoresCine = cineJose.crearEspetadores();

		cineJose.escogerPelicula(cineJose.salas, espectadoresCine);
		
		cineJose.mostrarSalas(cineJose.salas);

	}

	public Sala[] crearSalas() {

		Sala sala1 = new Sala(1, "Avatar", new int[3][3]);
		Sala sala2 = new Sala(2, "Ben-Hur", new int[3][3]);
		Sala sala3 = new Sala(3, "Gravity", new int[3][3]);

		Sala[] cineSalas = { sala1, sala2, sala3 };
		return cineSalas;
	}

	public Espectador[] crearEspetadores() {

		Espectador espectador1 = new Espectador("Juan", "01020304A");
		Espectador espectador2 = new Espectador("Pedro", "05060708A");
		Espectador espectador3 = new Espectador("Jose", "09010203A");

		Espectador[] cineEspectadores = { espectador1, espectador2, espectador3 };
		return cineEspectadores;
	}

	public void escogerPelicula(Sala[] salasCine, Espectador[] cineEspectadores) {
		boolean fin = true;
		int espectador = 0;
		do {		
			for (Espectador cineEspectador : cineEspectadores) {
				System.out.println("Lista de peliculas:");
				System.out.println("1.-" + salasCine[0].getTituloPelicula());
				System.out.println("2.-" + salasCine[1].getTituloPelicula());
				System.out.println("3.-" + salasCine[2].getTituloPelicula());
				System.out.println("Cliente: " + cineEspectador.getNombre());
				int opcion = Utilidades.pideDatoNumero("Escoge una pelicula:");
				int asientos = Utilidades.pideDatoNumero("¿Cuantos entradas quiere?");
				if (asientosLibres(salasCine[0].getButacas(), asientos)) {
					System.out.println("=================");
					if (opcion == 1) {
						System.out.println("Elige tus asientos");
						for(int k = 0 ; k<asientos;k++) {
							pintarAsientos(salasCine[0].getButacas());
							int numero = Utilidades.pideDatoNumero("Escoge el asiento"+ (k+1)+": (ejemplo 11,21,31)");
							int i = numero / 10;
					        int j = numero % 10;
					        salasCine[0].getButacas()[i][j]=1;
						}
					} else if (opcion == 2) {
						System.out.println("Elige tus asientos");
						for(int k = 0 ; k<asientos;k++) {
							pintarAsientos(salasCine[1].getButacas());
							int numero = Utilidades.pideDatoNumero("Escoge el asiento "+ (k+1)+": (ejemplo 11,21,31)");
							int i = numero / 10;
					        int j = numero % 10;
					        salasCine[0].getButacas()[i-1][j-1]=1;
						}
					} else {
						System.out.println("Elige tus asientos");
						for(int k = 0 ; k<asientos;k++) {
							pintarAsientos(salasCine[2].getButacas());
							int numero = Utilidades.pideDatoNumero("Escoge el asiento"+ (k+1)+": (ejemplo 11,21,31)");
							int i = numero / 10;
					        int j = numero % 10;
					        salasCine[0].getButacas()[i][j]=1;
						}
					}
				} else {
					System.out.println("Lo siento, no hay suficientes asientos disponibles para la cantidad que desea comprar.");
					System.out.println("Por favor escoga otra pelicula");
					fin = false;
				}
				espectador++;
			}
			
		} while (fin || espectador <cineEspectadores.length);

	}

	public void mostrarSalas(Sala[] salasCine) {
		int i = 1;
		for( Sala sala : salasCine) {
			System.out.println("Sala "+ i);
			pintarAsientos(sala.getButacas());
			
		}
	}

	public boolean asientosLibres(int[][] asientos, int asientoComprados) {
		boolean asientosDisponibles = true;
		int contador = 0;
		for (int[] asientosLibres : asientos) {
			for (int asientoLibre : asientosLibres) {
				if (asientoLibre == 0) {
					contador++;
				}
			}
		}
		if (asientoComprados < contador) {
			asientosDisponibles = true;
		} else {
			asientosDisponibles = false;
		}
		return asientosDisponibles;
	}

	public void pintarAsientos(int[][] asientos) {
		System.out.println("  1 2 3");
		int i = 1;
		for (int[] asientosLibres : asientos) {
			System.out.print(i+" ");
			for (int asientoLibre : asientosLibres) {
				if (asientoLibre == 0) {
					System.out.print("O ");
				} else {
					System.out.print("X ");
				}
			}
			System.out.println();
			i++;
		}
	}
}
