/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/TarifaMoto.java
package com.unicauca.tallerparqueadero.domain;
/**
 *
 * @author User
 */
public class TarifaMoto extends CalcularTarifa {
      @Override
    public int CalcularTarifa(int minutos) {
         tarifa=1000;
        if (minutos>60){
            tarifa += (minutos-60)*(25/3);
            tarifa= redondear(tarifa);
         }    
        return tarifa;
    }   
=======
package domain;

public class MotoFee extends CalculateFee {

    @Override
    public int calculateFee(int parkingTime) {

        fee = 1000;

        if (parkingTime > 60) {
            fee += (parkingTime - 60) * (25 / 3);
            fee = roundUp(fee);
        }

        return fee;
    }
>>>>>>> Stashed changes:src/main/java/domain/MotoFee.java
}
        

