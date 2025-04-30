package es.cursojava.hibernate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.funciones.Utilidades;

import es.cursojava.hibernate.entity.Cliente;
import es.cursojava.hibernate.entity.Pedido;

public class HibernateClientes {

	public static void main(String[] args) {

		HibernateClientes main = new HibernateClientes();
		// main.crearClientes();

		//main.mediaPedido();

		String fecha = Utilidades.pideDatoString("Insertar fecha");
		main.fechaPedido(fecha);
	}

	public void crearClientes() {

		Session session = HibernateUtil.getSession();

		Cliente c1 = new Cliente("C1", "cliente1@gmail.es");
		Pedido p1 = new Pedido("electronica", fecha("17-07-2025"), 120);
		p1.setCliente(c1);
		Pedido p2 = new Pedido("videojuegos", fecha("08-02-2025"), 85);
		p2.setCliente(c1);
		Pedido p3 = new Pedido("alimentacion", fecha("21-05-2025"), 95);
		p3.setCliente(c1);

		c1.setPedidos(Arrays.asList(p1, p2, p3));

		Cliente c2 = new Cliente("C2", "cliente2@gmail.es");
		Pedido p4 = new Pedido("electronica", fecha("13-06-2025"), 100);
		p4.setCliente(c2);
		Pedido p5 = new Pedido("videojuegos", fecha("08-02-2025"), 105);
		p5.setCliente(c2);
		Pedido p6 = new Pedido("alimentacion", fecha("15-08-2025"), 90);
		p6.setCliente(c2);
		Pedido p7 = new Pedido("hogar", fecha("17-07-2025"), 75);
		p7.setCliente(c2);

		c2.setPedidos(Arrays.asList(p5, p5, p6, p7));

		Cliente c3 = new Cliente("C3", "cliente3@gmail.es");
		Pedido p8 = new Pedido("hogar", fecha("15-08-2025"), 80);
		p8.setCliente(c3);
		Pedido p9 = new Pedido("libros", fecha("13-06-2025"), 50);
		p9.setCliente(c3);
		Pedido p10 = new Pedido("iluminacion", fecha("21-05-2025"), 60);
		p10.setCliente(c3);

		c3.setPedidos(Arrays.asList(p8, p9, p10));

		List<Cliente> clientes = Arrays.asList(c1, c2, c3);

		for (Cliente cliente : clientes) {

			Transaction tx = session.beginTransaction();

			try {
				session.persist(cliente);
				tx.commit();
			} catch (Throwable e) {
				tx.rollback();
				System.err.println("Error al crear la SessionFactory." + e);

			}
		}

	}

	public void mediaPedidoSegunEmail(String email) {
		Session session = HibernateUtil.getSession();
		String queryMediaPedidos = "select AVG(p.totalPedido) from Pedido p join p.cliente c where c.email=:param1";

		Query<Double> query = session.createQuery(queryMediaPedidos, Double.class);

		query.setParameter("param1", email);
		Double media = query.uniqueResult();

		System.out.println("Media de pedidos de " + email + " : " + media);
	}

	public void mediaPedido() {
		Session session = HibernateUtil.getSession();
		String queryCorreos = "select c.email from Cliente c";

		Query<String> query = session.createQuery(queryCorreos, String.class);

		List<String> correos = query.list();

		for (String correo : correos) {
			mediaPedidoSegunEmail(correo);
		}
	}

	public void fechaPedido(String fechaPedido) {

		Date fecha = fecha(fechaPedido);

		Session session = HibernateUtil.getSession();
		String queryTotalPedidos = "select SUM(p.totalPedido) from Pedido p where p.fechaPedido=:param1";

		Query<Long> query = session.createQuery(queryTotalPedidos, Long.class);
		query.setParameter("param1", fecha);

		Long total = query.uniqueResult();

		System.out.println("Total pedidos de dia de " + fechaPedido + " : "+ total);
	}

	public Date fecha(String fechaString) {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date fecha = null;
		try {
			fecha = format.parse(fechaString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return fecha;
	}
}
