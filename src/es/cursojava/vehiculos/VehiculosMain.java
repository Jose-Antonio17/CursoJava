package es.cursojava.vehiculos;

public class VehiculosMain {

    public static void main(String[] args) {

        VehiculosMain vehiculos = new VehiculosMain();
        Coche coche1 = new Coche("alfa", "ala", 1991, 50, null, 4, false);
        System.out.println(coche1);
        
    }

    private Vehiculo [] crearVehiculos(){
        Coche coche = new Coche("Toyota", "Corolla", 2024, 180, "diesel", 5, true);
        Motocicleta motocicleta = new Motocicleta("Honda", "Monkey", 2024, 90, "gasolina", false, 125);
        Camion camion = new Camion("Volvo", "FH", 2024, 100, "gasolina", 750, 4);
        Vehiculo [] vehiculos = {coche,motocicleta,camion};
        return vehiculos;
    }

    private void mostrarInformacion(Vehiculo [] vehiculos){
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion(vehiculo);
        }
    }

    private int calcularImpuesto(Vehiculo vehiculo){
        int impuesto = 200;
        
        return impuesto;
    }
}
