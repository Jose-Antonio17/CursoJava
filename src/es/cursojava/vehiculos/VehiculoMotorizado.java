package es.cursojava.vehiculos;

import es.cursojava.interfaces.Apagable;
import es.cursojava.interfaces.Encendible;

public abstract class VehiculoMotorizado extends Vehiculo implements Encendible, Apagable{
    
    String motor;
    public VehiculoMotorizado(String marca, String modelo, int anio, double velocidadMaxima, String tipo) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        //TODO Auto-generated constructor stub
    }

    public VehiculoMotorizado(String marca, String modelo, int anio, double velocidadMaxima, String tipo,
            String motor) {
        super(marca, modelo, anio, velocidadMaxima, tipo);
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }

    
    

}
