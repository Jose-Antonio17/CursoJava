package es.cursojava.poo;

public class Maniqui {

	private int id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;
	public Maniqui(int id, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}
	public Maniqui(int id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
	}
	public Maniqui(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pantalon getPantalon() {
		return pantalon;
	}
	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}
	public Camisa getCamisa() {
		return camisa;
	}
	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}
	public Vestido getVestido() {
		return vestido;
	}
	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	
	
}
