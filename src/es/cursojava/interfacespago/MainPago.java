package es.cursojava.interfacespago;

public class MainPago {
	
 public static void main(String [] args) {
	 
	 MainPago main = new MainPago();
	 main.validarPagos();
	 
	 
 }

 public void validarPagos() {
	 
	 PagoTarjetaCredito pago1 = new PagoTarjetaCredito(12);
	 PagoPaypal pago2 = new PagoPaypal(15);
	 PagoCriptomoneda pago3 = new PagoCriptomoneda(20);
	 
	 ProcesadorPagos validar = new ProcesadorPagos();
	 validar.realizarPago(pago1, pago1.getMonto());
	 validar.realizarPago(pago2, pago2.getMonto());
	 validar.realizarPago(pago3, pago3.getMonto());	  
 }
 
}
