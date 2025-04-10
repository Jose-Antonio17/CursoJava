package es.cursojava.hibernate;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import es.cursojava.hibernate.entity.CaballoCarrera;
import es.cursojava.hibernate.entity.Persona;

public class HibernateCaballos {
	public static void main(String[] args) {

		Session session = HibernateUtil.getSession();

		System.out.println(session);

		CaballoCarrera c1 = new CaballoCarrera("Caballo1", 25, 75, 5, 8, true);
		CaballoCarrera c2 = new CaballoCarrera("Caballo2", 28, 78, 2, 5, false);
		CaballoCarrera c3 = new CaballoCarrera("Caballo3", 15, 80, 1, 6, true);
		CaballoCarrera c4 = new CaballoCarrera("Caballo4", 18, 79, 3, 5, true);
		CaballoCarrera c5 = new CaballoCarrera("Caballo5", 10, 76, 5, 7, true);

		List<CaballoCarrera> caballos = Arrays.asList(c1, c2, c3, c4, c5);

		for (CaballoCarrera caballoCarrera : caballos) {
			
			Transaction tx = session.beginTransaction();
			
			try {			
				session.persist(caballoCarrera);
				tx.commit();
			} catch (Throwable e) {
				tx.rollback();
				System.err.println("Error al crear la SessionFactory." + e);
				
			}
		}
	}
}
