<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/TarifaCamion.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Nicolas Santander, Luis Romero
 */
public class TruckFee extends CalculateFee {

    @Override
    public int CalcularTarifa(int minutos) {
        tarifa = 15000;
        if (minutos <= 720) {
            tarifa = 10000;
        } else if (minutos > 1440) {
            tarifa += (minutos - 1440) * (125.0 / 12.0);
<<<<<<< HEAD:src/main/java/com/unicauca/tallerparqueadero/domain/TarifaCamion.java
            tarifa = redondear(tarifa);
=======
package domain;

public class TruckFee extends CalculateFee {

    @Override
    public int calculateFee(int parkingTime) {

        fee = 15000;

        if (parkingTime <= 720) {
            fee = 10000;
        } else if (parkingTime > 1440) {
            fee += (parkingTime - 1440) * (125.0 / 12.0);
            fee = roundUp(fee);
>>>>>>> Stashed changes:src/main/java/domain/TruckFee.java
=======
            tarifa = approximate(tarifa);
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5:src/main/java/domain/TruckFee.java
        }

        if (Sortear()) {
            fee = 0;
        }

        return fee;
    }

    //No pudimos testear esto sin tener que midificar nuestro proyecto y nuestra arquitectura
    private boolean Sortear() {
<<<<<<< HEAD:src/main/java/com/unicauca/tallerparqueadero/domain/TarifaCamion.java
<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/TarifaCamion.java
        int numeroAleatorio = (int) (Math.random() * (1000 - 1)) + 1;;
=======
        int numeroAleatorio = (int) (Math.random() * (1000 - 1)) + 1;
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5:src/main/java/domain/TruckFee.java
        return tarifa % numeroAleatorio == 0;
=======

        int numeroAleatorio = (int) (Math.random() * (1000 - 1)) + 1;
        return fee % numeroAleatorio == 0;
>>>>>>> Stashed changes:src/main/java/domain/TruckFee.java
    }

}
