package es.cursojava.excepcionescafe;

public class Comensal extends Cliente implements PuedenTomarCafe {

	private boolean tieneReserva;

	public Comensal(String nombre, boolean tieneReserva) {
		super(nombre);
		this.tieneReserva = tieneReserva;
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
