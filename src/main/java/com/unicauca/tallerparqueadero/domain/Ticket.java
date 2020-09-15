package com.unicauca.tallerparqueadero.domain;

/**
 *
 * @author User
 */
public class Ticket {

    private AutoEnum tipoVehiculo;
    private int minutos;
    private int tarifa;

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }


    public AutoEnum getVehiculo() {
        return tipoVehiculo;
    }

    public int getMinutos() {
        return minutos;
    }

    public Ticket(AutoEnum vehiculo, int minutos) {
        tipoVehiculo = vehiculo;
        this.minutos = minutos;
    }

}
