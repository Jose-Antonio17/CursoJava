package es.cursojava.ficherosejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FicherosEventos {

	private static final Logger logger = LoggerFactory.getLogger(FicherosEjercicio1.class);

	public static void main(String[] args) {

		FicherosEventos main = new FicherosEventos();
		File ubicacion = new File("D:\\ficheros\\eventos.txt");
		Map<Integer, Evento> eventos = main.crearObjetos(ubicacion);

		String comunidad = "Madrid";
		main.eventosPorComunidad(eventos, comunidad);

		main.generarFicheroPorComunidad(eventos, comunidad);

	}

	public Map<Integer, Evento> crearObjetos(File ubicacion) {
		String linea;
		Map<Integer, Evento> eventos = new HashMap();
		try (BufferedReader reader = new BufferedReader(new FileReader(ubicacion))) {
			reader.readLine(); // lee el encabezado
			while ((linea = reader.readLine()) != null) {
				String[] dato = linea.split(",");
				int id = Integer.parseInt(dato[0]);
				String nombre = dato[1];
				String fecha = dato[2];
				String lugar = dato[3];
				String descripcion = dato[4];
				int duracion = Integer.parseInt(dato[5]);
				double precio = Double.parseDouble(dato[6]);
				String organizador = dato[7];
				boolean gratuito = Boolean.parseBoolean(dato[8]);

				Evento evento = new Evento(id, nombre, fecha, lugar, descripcion, duracion, precio, organizador,
						gratuito);

				eventos.put(id, evento);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return eventos;
	}

	public void eventosPorComunidad(Map<Integer, Evento> eventos, String comunidad) {
		int i = 0;
		Collection<Evento> eventosCiudad = eventos.values();
		for (Evento evento : eventosCiudad) {
			if (evento.getLugar().equals(comunidad)) {
				i++;
			}
		}
		logger.info("Hay " + i + " eventos en la comunidad de " + comunidad);
	}

	public void generarFicheroPorComunidad(Map<Integer, Evento> eventos, String comunidad) {

		File fichero = new File("D:\\ficheros\\" + comunidad + ".txt");
		try {
			fichero.createNewFile();
		} catch (IOException e) {
			logger.error("Error al crear fichero");
		}
		Path ruta = Paths.get("D:\\ficheros\\" + comunidad + ".txt");
		Collection<Evento> eventosCiudad = eventos.values();
		for (Evento evento : eventosCiudad) {
			if (evento.getLugar().equals(comunidad)) {
				StringBuilder sb = new StringBuilder();
				sb.append(evento.getId()+",");
				sb.append(evento.getNombre()+",");
				sb.append(evento.getFecha()+",");
				sb.append(evento.getLugar()+",");
				sb.append(evento.getDescripcion()+",");
				sb.append(evento.getDuracion()+",");
				sb.append(evento.getPrecio()+",");
				sb.append(evento.getOrganizador()+",");
				sb.append(evento.isGratuito()+",");
				sb.append("\n");
				String linea = sb.toString();
				try {
					Files.write(ruta, linea.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,
							StandardOpenOption.APPEND);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void eventosGratis(Map<Integer, Evento> eventos, String comunidad) {
		int i = 0;
		Collection<Evento> eventosCiudad = eventos.values();
		for (Evento evento : eventosCiudad) {
		}
		logger.info("Hay " + i + " eventos en la comunidad de " + comunidad);
	}

}
