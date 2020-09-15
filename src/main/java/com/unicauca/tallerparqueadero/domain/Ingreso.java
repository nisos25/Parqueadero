package com.unicauca.tallerparqueadero.domain;

public class Ingreso {

    private int ingresoId;
    private AutoEnum tipo;
    private int tiempo;
    private int tarifa;


    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public int getTarifa() {
        return tarifa;
    }

    public Ingreso(int ingresoId, AutoEnum tipo, int tiempo) {
        this.ingresoId = ingresoId;
        this.tipo = tipo;
        this.tiempo = tiempo;

        crearTicket();
    }

    public Ingreso() {
    }

    public int getIngresoId() {
        return ingresoId;
    }

    public void setIngresoId(int ingresoId) {
        this.ingresoId = ingresoId;
    }

    public AutoEnum getTipo() {
        return tipo;
    }

    public void setTipo(AutoEnum tipo) {
        this.tipo = tipo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    private void crearTicket(){
        Ticket ticket = new Ticket(tipo, tiempo);
        Parqueadero parqueadero = new Parqueadero();

        tarifa = parqueadero.calcularTarifa(ticket);
    }

    @Override
    public String toString() {
        return "Ingreso: " + ingresoId + ", tipo de vehículo: " + 
                tipo.toString().toLowerCase()+ ", tiempo =  " + tiempo + " minutos, " + "tarifa: " + tarifa;
    }
}
