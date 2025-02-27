package es.cursojava.excepcionescafe;

public class ClienteAsiduo extends Cliente implements PuedenTomarCafe{

	private String mote;

	public ClienteAsiduo(String nombre, String mote) {
		super(nombre);
		this.mote = mote;
	}

	public void tomarCafe(TazaCafe cafe) throws TooHotTemperatureException, TooColdTemperatureException {
		if (cafe.getTemperatura()>80) {
			throw new TooHotTemperatureException("Café caliente");
		} else if(cafe.getTemperatura()<20) {
			throw new TooColdTemperatureException("Café frio");
		} else {
			System.out.println("Temperatura del café perfecta");
		}
	}

}
