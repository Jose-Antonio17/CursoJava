package es.cursojava.hibernate.caballosCarrera;

import java.util.List;

import es.cursojava.funciones.Utilidades;
import es.cursojava.hibernate.dto.CaballoDTO;
import es.cursojava.hibernate.entity.CaballoCarrera;

public class CarreraCaballosFront {

	private CarreraService servicio;
	private String nombreCarrera;

	public CarreraCaballosFront(String nombreCarrera) {
		this.servicio = new CarreraService();
		this.nombreCarrera = nombreCarrera;
	}

	public void iniciaMenuCarrera() {
		System.out.println("Bienvenido a la carrera " + this.nombreCarrera);
		int opcion;
		do {
			Utilidades.pintaMenu(new String[] { "1. Insertar nuevo caballo ", "2. Mostrar Caballos",
					"3. Iniciar carrera", "4. Borrar Caballo", "5. Cambiar Jinete", "6. Salir" }, "");
			opcion = Utilidades.pideDatoNumero("Elige una opción: ");

			switch (opcion) {
			case 1:
				creaCaballo();
				break;
			case 2:
				mostrarCaballos();
				break;
			case 3:
				iniciarCarrera();
				break;
			case 4:
				eliminarCaballo();
				break;
			case 5:
				cambiarJinete();
				break;
			case 6:
				mostrarCaballosPorNacionalidad();
				break;
			case 7:
				System.out.println("Aaaadios!");
				;
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} while (opcion != 7);

	}

	private CaballoDTO creaCaballo() {

		String nombre = Utilidades.pideDatoString("Nombre: ");
		int edad = Utilidades.pideDatoNumero("edad: ");
		double velocidad = Utilidades.pideDatoDecimal("Velocidad máxima (km/h): ");
		int triunfos = Utilidades.pideDatoNumero("Número de triunfos: : ");
		double experiencia = Utilidades.pideDatoDecimal("Experiencia (0.0 a 10.0): ");
		String activo = Utilidades.pideDatoString("¿Está activo? ");
		String nombreJinete = Utilidades.pideDatoString("Nombre Jinete: ");
		String nacionalidadJinete = Utilidades.pideDatoString("Nacionalidad Jinete: ");

		CaballoDTO caballoDto = new CaballoDTO(nombre, edad, velocidad, triunfos, experiencia,
				activo.equalsIgnoreCase("si"), nombreJinete, nacionalidadJinete);

		servicio.insertarCaballo(caballoDto);
		return caballoDto;
	}

	private void mostrarCaballos() {
		List<CaballoDTO> caballos = servicio.obtenerCaballos(false);
		for (CaballoDTO caballoDTO : caballos) {
			System.out.println(caballoDTO.getNombre());
			if (caballoDTO.getNombreJinete() != null) {
				System.out.println(caballoDTO.getNombreJinete());
			} else {
				System.out.println("Caballo sin jinete");
			}
		}
		// caballos.forEach(System.out::println);
	}

	private void iniciarCarrera() {
		servicio.simularCarrera(servicio.obtenerCaballos(true));
	}

	private void eliminarCaballo() {
		// mostrarCaballos();
		int id = Utilidades.pideDatoNumero("Introduce el id del caballo a eliminar");
		servicio.eliminarCaballo(id);
		System.out.println("Caballo con id " + id + " borrado");
	}

	private void cambiarJinete() {
		long idCaballo = Utilidades.pideDatoNumero("Introduce id caballo a actualizar su Jinete");

		CaballoCarrera caballo = servicio.obtenerCaballo(idCaballo);
		CaballoDTO caballoDTO = new CaballoDTO();

		if (caballo.getJinete() != null) {
			caballoDTO = servicio.obtenerJineteCaballo(idCaballo);
			System.out.println("El jinete actual es: ");
			System.out.println("\t" + caballoDTO.getNombreJinete());
			System.out.println("\t" + caballoDTO.getNacionalidadJinete());
		} else {
			System.out.println("El caballo seleccionado no tiene jinete");
		}

		String nombreJinete = Utilidades.pideDatoString("Nombre Jinete: ");
		String nacionalidadJinete = Utilidades.pideDatoString("Nacionalidad Jinete: ");
		caballoDTO.setNombreJinete(nombreJinete);
		caballoDTO.setNacionalidadJinete(nacionalidadJinete);

		servicio.actualizarJineteCaballo(idCaballo, caballoDTO);
	}

	private void mostrarCaballosPorNacionalidad() {
		String nacionalidad = Utilidades.pideDatoString("Nacionalidad Jinete");
		List<CaballoCarrera> caballos = servicio.obtenerCaballosNacionalidadJinete(nacionalidad);
		for (CaballoCarrera caballoCarrera : caballos) {
			System.out.println(caballoCarrera);
		}
	}
}
