/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.tallerparqueadero.domain;

/**
 *
 * @author User
 */
public class TarifaCamion extends CalcularTarifa {

    @Override
    public int CalcularTarifa(int minutos) {
        tarifa = 15000;
        if (minutos < 720) {
            tarifa = 10000;
        } else if (minutos > 1440) {
            tarifa += (minutos - 1440) * (125.0 / 12.0);
            tarifa = redondear(tarifa);
        }
        if (Sortear()) {
            tarifa = 0;
        }
        return tarifa;
    }

    private boolean Sortear() {
        int numeroAleatorio = (int) (Math.random() * (1000 - 1)) + 1;;
        return tarifa % numeroAleatorio == 0;
    }

}
