package es.cursojava.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import es.cursojava.funciones.Utilidades;
import es.cursojava.hibernate.entity.CarnetDeBiblioteca;
import es.cursojava.hibernate.entity.Estudiante;

public class HibernateEstudiante {
	private static Session session = HibernateUtil.getSession();

	public static void main(String[] args) {

		// insertarEstudiante();
		
		consultarEstudiante();
		session.close();
	}

	private static void insertarEstudiante() {

		String nombre = Utilidades.pideDatoString("Nombre del estudiante: ");
		Date fechaEmision = Utilidades.pideDatoDate("Fecha de alta(dd-MM-yyyy): ");

		CarnetDeBiblioteca carnet = new CarnetDeBiblioteca(fechaEmision);
		Estudiante estudiante = new Estudiante(nombre, carnet);

		Transaction tx = session.beginTransaction();
		session.persist(estudiante);
		tx.commit();
		System.out.println("Estudiante insertado.");

	}

	private static void consultarEstudiante() {
		List<Estudiante> estudiantes = session.createQuery("from Estudiante", Estudiante.class).getResultList();
		System.out.println("===================");
		for (Estudiante estudiante : estudiantes) {
			System.out.println("Carnet de " + estudiante.getNombre() + ":\n Emision: "
					+ estudiante.getCarnetDeBiblioteca().getFechaEmision()+ "\n Expira: "
					+ estudiante.getCarnetDeBiblioteca().getFechaExpiracion());
		}
	}

}
