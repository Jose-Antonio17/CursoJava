package es.cursojava.interfacespago;

import es.cursojava.interfaces.Pago;

public class ProcesadorPagos {

	public void realizarPago(Pago metodoPago, double monto) {
		
		metodoPago.procesarPago(monto);
		
	}
}

