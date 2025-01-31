package es.cursojava.poo;

public class Tienda {

	private String nombre;
	private Maniqui[] maniquis;

	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {

		Tienda tiendaJose = new Tienda("Zara");
		Maniqui[] maniquisTienda = tiendaJose.abrirTienda();
		tiendaJose.maniquis = maniquisTienda;
		tiendaJose.mostrarEscaparate(tiendaJose.maniquis);
		System.out.println("================================");
		tiendaJose.cerrarTienda(tiendaJose.maniquis);

	}

	public Maniqui[] abrirTienda() {

		Maniqui maniqui1 = new Maniqui(1);

		Boton botonPantalon = new Boton("azul", 4, "circular");
		Pantalon pantalon1 = new Pantalon("negro", 15, "M", botonPantalon);
		Boton botonCamisa1 = new Boton("blanco", 2, "hexagono");
		Boton botonCamisa2 = new Boton("blanco", 2, "hexagono");
		Boton botonCamisa3 = new Boton("blanco", 2, "hexagono");
		Boton[] botonesCamisa = { botonCamisa1, botonCamisa2, botonCamisa3 };
		Camisa camisa1 = new Camisa("gris", 12, "M", botonesCamisa);
		Maniqui maniqui2 = new Maniqui(2, pantalon1, camisa1);

		Vestido vestido1 = new Vestido("rosa", 20, "S");
		Maniqui maniqui3 = new Maniqui(3, vestido1);

		Maniqui[] maniquisTienda = { maniqui1, maniqui2, maniqui3 };

		return maniquisTienda;
	}

	public void mostrarEscaparate(Maniqui[] maniquiesTienda) {
		for (Maniqui mostrarManiqui : maniquiesTienda) {
			System.out.println();
			boolean sinRopa = true;
			double precioRopa = 0;
			System.out.println("Maniqui numero " + mostrarManiqui.getId() + ":");
			if (mostrarManiqui.getVestido() != null) {
				System.out.println("Vestido");
				System.out.println("\t" + mostrarManiqui.getVestido().getColor());
				System.out.println("\t" + mostrarManiqui.getVestido().getPrecio());
				System.out.println("\t" + mostrarManiqui.getVestido().getTalla());
				sinRopa = false;
				precioRopa += mostrarManiqui.getVestido().getPrecio();
			}
			if (mostrarManiqui.getPantalon() != null) {
				System.out.println("Pantalón");
				System.out.println("\t" + mostrarManiqui.getPantalon().getColor());
				System.out.println("\t" + mostrarManiqui.getPantalon().getPrecio());
				System.out.println("\t" + mostrarManiqui.getPantalon().getTalla());
				System.out.println("\tBoton: ");
				System.out.println("\t\t" + mostrarManiqui.getPantalon().getBoton().getColor());
				System.out.println("\t\t" + mostrarManiqui.getPantalon().getBoton().getTamanyo());
				System.out.println("\t\t" + mostrarManiqui.getPantalon().getBoton().getForma());
				sinRopa = false;
				precioRopa += mostrarManiqui.getPantalon().getPrecio();
			}
			if (mostrarManiqui.getCamisa() != null) {
				System.out.println("Camisa");
				System.out.println("\t" + mostrarManiqui.getCamisa().getColor());
				System.out.println("\t" + mostrarManiqui.getCamisa().getPrecio());
				System.out.println("\t" + mostrarManiqui.getCamisa().getTalla());
				System.out.println("\t" + mostrarManiqui.getCamisa().getBotones().length + " botones: ");
				int i = 1;
				for (Boton botonCamisa : mostrarManiqui.getCamisa().getBotones()) {
					System.out.println("\t  Boton" + i + ":");
					System.out.println("\t\t" + botonCamisa.getColor());
					System.out.println("\t\t" + botonCamisa.getTamanyo());
					System.out.println("\t\t" + botonCamisa.getForma());
					i++;
				}
				sinRopa = false;
				precioRopa += mostrarManiqui.getCamisa().getPrecio();
			}
			if (sinRopa) {
				System.out.println("El maniqui numero " + mostrarManiqui.getId() + " no tiene ropa.");
			} else {
				System.out.println(
						"Precio total de la ropa del manquini " + mostrarManiqui.getId() + " es " + precioRopa);
			}
		}

	}

	public void cerrarTienda(Maniqui[] maniquiesTienda) {
		System.out.println("Se cierra la tienda, quitamos la ropa a los maniquies");
		for (Maniqui mostrarManiqui : maniquiesTienda) {
			mostrarManiqui.setPantalon(null);
			mostrarManiqui.setCamisa(null);
			mostrarManiqui.setVestido(null);
		}
		mostrarEscaparate(maniquiesTienda);

	}
}
