package es.cursojava.excepcionescafe;

public interface PuedenTomarCafe {

	void tomarCafe(TazaCafe cafe) throws TooHotTemperatureException, TooColdTemperatureException;
}
