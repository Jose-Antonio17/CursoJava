package es.cursojava.vehiculos;

public class Garaje {

    private Vehiculo[] plazaVehiculos;

    public Garaje(int capacidad) {
        Vehiculo[] plazaVehiculos = new Vehiculo[capacidad];
        this.plazaVehiculos = plazaVehiculos;
    }

    public Vehiculo[] getplazaVehiculos() {
        return plazaVehiculos;
    }

    public void setplazaVehiculos(Vehiculo[] plazaVehiculos) {
        this.plazaVehiculos = plazaVehiculos;
    }

    public void aparcarVehiculos(Vehiculo vehiculoAparcar) {
        Vehiculo[] plazas = getplazaVehiculos();
        int[] plazasOcupadas = plazasOcupadasTipo(plazas);
        int plazalibre = 0;
        for (int i = 0; i < plazas.length; i++) {
            if (plazas[i] == null) {
                plazalibre = i;
                break;
            }
        }
        if (vehiculoAparcar instanceof Coche) {
            if (plazasOcupadas[0] + 1 < 2) {
                plazas[plazalibre] = vehiculoAparcar;
            } else {
                System.out.println("No hay plazas disponibles para coches");
            }
        } else if (vehiculoAparcar instanceof Camion) {
            if (plazasOcupadas[1] + 1 < 2) {
                plazas[plazalibre] = vehiculoAparcar;
            } else {
                System.out.println("No hay plazas disponibles para camiones");
            }
        } else {
            Motocicleta moto2 = (Motocicleta) vehiculoAparcar;
            if (moto2.isTieneSidecar()) {
                System.out.println("No se aceptan motos con sidecar");
            } else {
                if (plazasOcupadas[2] + 1 < 2) {
                    plazas[plazalibre] = vehiculoAparcar;
                } else {
                    System.out.println("No hay plazas disponibles para motococleta");
                }
            }
        }

    }

    private int[] plazasOcupadasTipo(Vehiculo[] vehiculosEnGaraje) {
        int[] plazasLibres = new int[3];
        int contadorCoches = 1;
        int contadorCamiones = 1;
        int contadorMotocicleta = 0;
        for (Vehiculo vehiculo : vehiculosEnGaraje) {
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
