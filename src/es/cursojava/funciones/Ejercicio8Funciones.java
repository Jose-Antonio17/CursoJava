package es.cursojava.funciones;

public class Ejercicio8Funciones {

	public static void main(String[] args) {

		int num = Utilidades.pideDatoNumero("Ingresar el número de aulas:");
		String[][] clases = new String[num][3];

		int opcion = 0;
		do {
			System.out.println("--------------------------------------");
			Utilidades.pintaMenu("Opciones:\n1. PEDIR DATOS\n2. MOSTRAR ALUMNOS POR AULA\n3. BUSCAR ALUMNO\n4. BORRAR ALUMNO\n5. BORRAR A TODOS LOS ALUMNOS\n6. SALIR");

			opcion = Utilidades.pideDatoNumero("Elige una opcion:");

			if (opcion == 1) {
				pedirDatosAlumnos(clases);

			}
			if (opcion == 2) {
				mostrarAlumnoClase(clases);
			}
			if (opcion == 3) {
				buscarAlumno(clases);
			}
			if (opcion == 4) {
				eliminarAlumno(clases);
			}
			if (opcion == 5) {
				eliminarAlumnos(clases);
			}
		} while (opcion < 6);
	}

	private static void pedirDatosAlumnos(String[][] clases) {
		for (int i = 0; i < clases.length; i++) {
			for (int j = 0; j < clases[i].length; j++) {
				if (clases[i][j] == null) {
					clases[i][j] = Utilidades.pideDatoString(
							"Introduce el nombre de alumno de la mesa " + (j + 1) + " del aula " + (i + 1));
				}
			}
		}
	}

	private static void mostrarAlumnoClase(String[][] clases) {
		int aulaNum = Utilidades.pideDatoNumero("Elige el aula para ver a sus alumnos:");
		System.out.println("Lista de alumnos de la clase " + aulaNum + ":");
		for (int j = 0; j < clases[aulaNum - 1].length; j++) {
			System.out.println(" - " + clases[aulaNum - 1][j]);
		}
	}

	private static void buscarAlumno(String[][] clases) {
		String alumnoBuscar = Utilidades.pideDatoString("Ingresar el nombre del alumno que quiere buscar:");
		for (int i = 0; i < clases.length; i++) {
			for (int j = 0; j < clases[i].length; j++) {
				if (clases[i][j].equals(alumnoBuscar)) {
					System.out.println(
							"El alumno " + alumnoBuscar + " esta en la mesa " + (j + 1) + " del aula " + (i + 1));
				}
			}
		}
	}

	private static void eliminarAlumno(String[][] clases) {
		String alumnoBuscar = Utilidades.pideDatoString("Ingresar el nombre del alumno que quiere eliminar:");
		int i = 0;
		int j = 0;
		for (i = 0; i < clases.length; i++) {
			for (j = 0; j < clases[i].length; j++) {
				if (clases[i][j].equals(alumnoBuscar)) {
					clases[i][j] = null;
					break;
				}
			}
		}
		if (clases[(i - 1)][j] == null) {
			System.out.println("Se ha eliminado correctamente a " + alumnoBuscar);
		}
	}

	private static void eliminarAlumnos(String[][] clases) {
		for (int i = 0; i < clases.length; i++) {
			for (int j = 0; j < clases[i].length; j++) {
				clases[i][j] = null;
			}
		}
		boolean comprobacion = true;
		for (int i = 0; i < clases.length; i++) {
			for (int j = 0; j < clases[i].length; j++) {
				if (!(clases[i][j] == null)) {
					comprobacion = false;
				}
			}
		}
		if (comprobacion) {
			System.out.println("Se ha eliminado correctamente a todos los alumnos");
		}
	}
}