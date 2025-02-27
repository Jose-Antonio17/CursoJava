package es.cursojava.excepcionescafe;

public class TazaCafe {

	private String tipoCafe;
	private int temperatura;
	
	public TazaCafe(String tipoCafe) {
		super();
		this.tipoCafe = tipoCafe;
		this.temperatura = temperaturaCafe();
	}
	
	public int temperaturaCafe() {
		
		int temp = (int) (Math.random()*100);
		return temp;
		
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
}
