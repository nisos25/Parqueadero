<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/CalcularTarifa.java
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
public abstract class CalcularTarifa {
=======
package domain;

public abstract class CalculateFee {
>>>>>>> Stashed changes:src/main/java/domain/CalculateFee.java

    protected int fee;

<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/CalcularTarifa.java
    protected int redondear(int valor) {
        int residuo = valor % 100;
        if (residuo != 0) {
            valor += 100 - residuo;
=======
    protected int roundUp(int value) {

        int remainder = value % 100;

        if (remainder != 0) {
            value += 100 - remainder;
>>>>>>> Stashed changes:src/main/java/domain/CalculateFee.java
        }

        return value;
    }

    public abstract int calculateFee(int parkingTime);
}
