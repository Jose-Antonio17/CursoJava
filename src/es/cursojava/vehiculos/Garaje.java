package es.cursojava.vehiculos;

public class Garaje {

    private String nombre;
    private Vehiculo[] plazaVehiculos;
    private int maxCoches;
    private int maxMotocicletas;
    private int maxCamiones;

    
    public Garaje(String nombre, int maxCoches, int maxMotocicletas, int maxCamiones) {
        this.nombre = nombre;
        this.maxCoches = maxCoches;
        this.maxMotocicletas = maxMotocicletas;
        this.maxCamiones = maxCamiones;
        this.plazaVehiculos = new Vehiculo[maxCoches+maxMotocicletas+maxCamiones];
    }

    public Vehiculo[] getplazaVehiculos() {
        return plazaVehiculos;
    }

    public void setplazaVehiculos(Vehiculo[] plazaVehiculos) {
        this.plazaVehiculos = plazaVehiculos;
    }

    public void aparcarVehiculos(Vehiculo vehiculoAparcar) {
        int[] plazasOcupadas = plazasOcupadasTipo();
        int plazalibre = 0;
        for (int i = 0; i < plazaVehiculos.length; i++) {
            if (plazaVehiculos[i] == null) {
                plazalibre = i;
                break;
            }
        }
        if (vehiculoAparcar instanceof Coche) {
            if (plazasOcupadas[0] + 1 <= maxCoches) {
                plazaVehiculos[plazalibre] = vehiculoAparcar;
            } else {
                System.out.println("No hay plazas disponibles para coches");
            }
        } else if (vehiculoAparcar instanceof Camion) {
            if (plazasOcupadas[1] + 1 <= maxMotocicletas) {
                plazaVehiculos[plazalibre] = vehiculoAparcar;
            } else {
                System.out.println("No hay plazas disponibles para camiones");
            }
        } else {
            Motocicleta moto2 = (Motocicleta) vehiculoAparcar;
            if (moto2.isTieneSidecar()) {
                System.out.println("No se aceptan motos con sidecar");
            } else {
                if (plazasOcupadas[2] + 1 <= maxCamiones) {
                    plazaVehiculos[plazalibre] = vehiculoAparcar;
                } else {
                    System.out.println("No hay plazas disponibles para motococleta");
                }
            }
        }

    }

    private int[] plazasOcupadasTipo() {
        int[] plazasLibres = new int[3];
        int contadorCoches = 1;
        int contadorCamiones = 1;
        int contadorMotocicleta = 1;
        for (Vehiculo vehiculo : plazaVehiculos) {
            if (vehiculo instanceof Coche) {
                contadorCoches++;
            } else if (vehiculo instanceof Camion) {
                contadorCamiones++;
            } else if(vehiculo instanceof Motocicleta) {
                contadorMotocicleta++;
            }
        }
        plazasLibres[0] = contadorCoches;
        plazasLibres[1] = contadorCamiones;
        plazasLibres[2] = contadorMotocicleta;
        return plazasLibres;
    }
}
