package es.cursojava.interfacespago;

import es.cursojava.interfaces.Pago;

public class PagoPaypal implements Pago{
	
	private double monto;
	
	public PagoPaypal(double monto) {
		this.monto = monto;
	}
	
	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public void procesarPago (double monto) {
		System.out.println("Pago con Paypal correcto" );
		System.out.println("Monto: " + monto );
	}
	
}
