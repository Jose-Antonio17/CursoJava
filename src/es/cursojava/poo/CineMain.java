package es.cursojava.poo;

import es.cursojava.funciones.Utilidades;

public class CineMain {

	public static void main(String[] args) {

		CineMain cine1 = new CineMain();
		Sala[] salasCine = cine1.crearSalas();
		Espectador[] espectadoresCine = cine1.crearEspetadores();
		Cine cinePlanet = new Cine("Cineplanet", salasCine);

		cine1.escogerPelicula(cinePlanet.getSalas(), espectadoresCine);

	}

	public Sala[] crearSalas() {

		Sala sala1 = new Sala(1, "Avatar", new Espectador[3][3]);
		Sala sala2 = new Sala(2, "Ben-Hur", new Espectador[3][3]);
		Sala sala3 = new Sala(3, "Gravity", new Espectador[3][3]);

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
			for (int l = 0; l < cineEspectadores.length; l++) {
				pintarMenuPeliculas(salasCine, cineEspectadores[l]);
				int opcion = Utilidades.pideDatoNumero("Escoge la sala de la pelicula que quieres ver:");
				if (opcion < 4 && opcion > 0) {
					int asientos = Utilidades.pideDatoNumero("Indicar cuantas entradas desea comprar:");
					if (asientosLibres(salasCine[opcion - 1].getButacas(), asientos)) {
						System.out.println("=================");
						System.out.println("Elige tus asientos");
						reservarAsiento(salasCine[opcion - 1], cineEspectadores[l], asientos);
						espectador++;
					} else {
						System.out
								.println("No hay suficientes asientos disponibles para la cantidad que desea comprar.");
						System.out.println("Por favor escoga otra pelicula");
						l--;
					}
				} else {
					System.out.println("Número no valido, ingrese la opción otra vez");
				}
				if (espectador > cineEspectadores.length - 1) {
					fin = false;
				}
			}
		} while (fin);
		System.out.println();
		System.out.println("Resumen de las salas del cine.");
		mostrarSalas(salasCine);
	}

	public void mostrarSalas(Sala[] salasCine) {
		int k = 1;
		for (Sala sala : salasCine) {
			int i = 0;
			int j = 0;
			System.out.println("=================");
			System.out.println("Sala " + (k));
			System.out.println("Pelicula: " + sala.getTituloPelicula());
			pintarAsientos(sala.getButacas());
			for (Espectador[] asientosOcupados : sala.getButacas()) {
				i++;
				j = 0;
				for (Espectador asientoEspectador : asientosOcupados) {
					j++;
					if (asientoEspectador != null) {
						System.out
								.println("\tAsiento " + i + j + " esta reservado por " + asientoEspectador.getNombre());
					} else {
						System.out.println("\tAsiento " + i + j + " disponible");
					}
				}
			}
			k++;
		}
	}

	public boolean asientosLibres(Espectador[][] asientos, int asientoComprados) {
		boolean asientosDisponibles = true;
		int contador = 0;
		for (Espectador[] asientosLibres : asientos) {
			for (Espectador asientoLibre : asientosLibres) {
				if (asientoLibre == null) {
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

	public void pintarAsientos(Espectador[][] asientos) {
		System.out.println("=================");
		System.out.println("O -> asientos disponibles   X-> asientos reservados");
		System.out.println("\tCOLUMNAS");
		System.out.print("\t");
		for (int c = 1; c<asientos.length+1;c++) {
		System.out.print(c+" ");
	    }
		int i = 1;
		System.out.println();
		for (Espectador[] asientosLibres : asientos) {
			System.out.print(" FILA " + i + " ");
			for (Espectador asientoLibre : asientosLibres) {
				if (asientoLibre == null) {
					System.out.print("O ");
				} else {
					System.out.print("X ");
				}
			}
			System.out.println();
			i++;
		}
	}

	public void pintarMenuPeliculas(Sala[] salasCine, Espectador cineEspectador) {
		System.out.println("================");
		System.out.println("Lista de peliculas:");
		for (int i = 0; i < salasCine.length; i++) {
			System.out.println(salasCine[i]);
		}
		System.out.println("=================");
		System.out.println("Cliente: " + cineEspectador.getNombre());
		System.out.println("=================");
	}

	public void reservarAsiento(Sala salaCine, Espectador cineEspectador, int asientos) {
		for (int k = 0; k < asientos; k++) {
			int i = 0;
			int j = 0;
			do {
				pintarAsientos(salaCine.getButacas());
				int numero = Utilidades
						.pideDatoNumero("Escoge el asiento " + (k + 1) + ": (primero fila y luego columna)");
				i = numero / 10;
				j = numero % 10;
				if (salaCine.getButacas()[i - 1][j - 1] == null) {
					salaCine.getButacas()[i - 1][j - 1] = cineEspectador;
				} else {
					System.out.println("Asiento no disponible, escoge otra vez");
					k--;
				}
			} while (salaCine.getButacas()[i - 1][j - 1] == null);
		}
	}
}
