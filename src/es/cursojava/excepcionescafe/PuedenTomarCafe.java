package es.cursojava.excepcionescafe;

public interface PuedenTomarCafe {

	public void tomarCafe(TazaCafe cafe) throws TooHotTemperatureException, TooColdTemperatureException;
}
