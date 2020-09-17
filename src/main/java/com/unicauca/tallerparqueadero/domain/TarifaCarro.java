<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/TarifaCarro.java
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
public class TarifaCarro extends CalcularTarifa {
      
    @Override
    public int CalcularTarifa(int minutos) {
         tarifa=2000;
        if (minutos>60){
            tarifa += (minutos-60)*(50/3);
            tarifa = redondear(tarifa);
         }    
        return tarifa;
    }   
=======
package domain;

public class CarFee extends CalculateFee {

    @Override
    public int calculateFee(int parkingTime) {

        fee = 2000;

        if (parkingTime > 60) {
            fee += (parkingTime - 60) * (50 / 3);
            fee = roundUp(fee);
        }

        return fee;
    }
>>>>>>> Stashed changes:src/main/java/domain/CarFee.java
}
