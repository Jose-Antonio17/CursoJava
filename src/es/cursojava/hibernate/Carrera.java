package es.cursojava.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import es.cursojava.hibernate.entity.CaballoCarrera;
import es.cursojava.hibernate.entity.Persona;

public class Carrera {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();

		String hql1 = "from CaballoCarrera c where c.estaActivo=:activo";
		Query<CaballoCarrera> query = session.createQuery(hql1, CaballoCarrera.class);
		query.setParameter("activo", true);
		List<CaballoCarrera> caballos = query.list();
		System.out.println(caballos.size());

		System.out.println("=====INICIA LA CARRERA=====");
		iniciarCarrera(caballos);

	}

	public static void iniciarCarrera(List<CaballoCarrera> caballos) {

//		int contador = 0;
//		List<CaballoCarrera> caballosNoActivos = new ArrayList<CaballoCarrera>();
//		for (CaballoCarrera caballo : caballos) {
//			if(caballo.isEstaActivo()) {
//				contador++;
//			} else {
//				caballosNoActivos.add(caballo);
//			}
//		}
		if (caballos.size() < 2) {
			System.out.println("No hay suficientes caballos para la carrera");
		} else {
			//caballos.removeAll(caballosNoActivos);
			boolean meta = true;
			while (meta) {
				System.out.println("================================");
				for (CaballoCarrera caballo : caballos) {
					int ubicacion = caballo.avanzar();
					System.out.println(caballo.getNombre() + " avanza " + ubicacion + " metros");
					System.out
							.println("Ubicacion actual: " + caballo.getUbicacionCarrera() + " metros desde el inicio");
					if (caballo.getUbicacionCarrera() >= 500) {
						System.out.println("==================");
						System.out.println(caballo.getNombre() + " ha ganado la carrera");
						System.out.println("==================");
						meta = false;
						break;
					}
				}
			}
		}
	}
}
