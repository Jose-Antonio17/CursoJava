package es.cursojava.vehiculos;

public class VehiculosMain {

    public static void main(String[] args) {

        VehiculosMain vehiculosMain = new VehiculosMain();
        vehiculosMain.Vehiculos();

    }

    private void Vehiculos() {
        Vehiculo[] vehiculos = crearVehiculos();
        mostrarInformacion(vehiculos);
        System.out.println("Impuesto de cada vehiculo:");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.impuesto();
        }
        aparcarGaraje(vehiculos);
    }

    private Vehiculo[] crearVehiculos() {
        Coche coche = new Coche("Toyota", "Corolla", 2004, 180, "hibrido", 5, true);
        Motocicleta motocicleta = new Motocicleta("Honda", "Monkey", 2024, 90, "diesel", true, 125);
        Camion camion = new Camion("Volvo", "FH", 2013, 100, "gasolina", 750, 4);
        Vehiculo[] vehiculos = { coche, motocicleta, camion };
        return vehiculos;
    }

    private void mostrarInformacion(Vehiculo[] vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
        }
    } 
    private void aparcarGaraje( Vehiculo[] vehiculos){
        Garaje garaje = new Garaje(3);
        for (Vehiculo vehiculo : vehiculos) {
            garaje.aparcarVehiculos(vehiculo);
        }
    }
}
