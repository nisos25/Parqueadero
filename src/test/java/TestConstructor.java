<<<<<<< HEAD
import domain.Parking;
import domain.VehicleEnum;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestConstructor {

    @Test
    public void testCamion() {

        System.out.println("Camion más de un día completo");
        Parking parking = new Parking(1, VehicleEnum.CAMION, 1445);

        assertEquals(parking.getParkingId(), 1);
        assertEquals(parking.getParkingTime(), 1445);
        assertEquals(parking.getVehicleType(), VehicleEnum.CAMION);
    }

    @Test
    public void testCarro() {

        System.out.println("Camion día completo");
        Parking parking = new Parking(1, VehicleEnum.CARRO, 1440);

        assertEquals(parking.getParkingId(), 1);
        assertEquals(parking.getParkingTime(), 1440);
        assertEquals(parking.getVehicleType(), VehicleEnum.CARRO);
    }

    @Test
    public void testMoto() {

        System.out.println("Camion más de medio día");
        Parking parking = new Parking(1, VehicleEnum.MOTO, 800);

        assertEquals(parking.getParkingId(), 1);
        assertEquals(parking.getParkingTime(), 800);
        assertEquals(parking.getVehicleType(), VehicleEnum.MOTO);
    }

=======

import domain.Parking;
import domain.VehicleEnum;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan-
 */
public class TestConstructor {
    
     @Test
    public void testCamion() throws ParseException {
        System.out.println("Camion más de un día completo");
        Parking parking = new Parking(1,VehicleEnum.CAMION,1445); 
        assertEquals(parking.getParkingId(), 1);
        assertEquals(parking.getParkingMinutes(), 1445);
        assertEquals(parking.getTypeVehicle(), VehicleEnum.CAMION);
        }

    @Test
    public void testCarro() throws ParseException {
        System.out.println("Camion día completo");
        Parking parking = new Parking(1,VehicleEnum.CARRO,1440); 
        assertEquals(parking.getParkingId(), 1);
        assertEquals(parking.getParkingMinutes(), 1440);
        assertEquals(parking.getTypeVehicle(), VehicleEnum.CARRO);
        }

    @Test
    public void testMoto() throws ParseException {
        System.out.println("Camion más de medio día");
        Parking parking = new Parking(1,VehicleEnum.MOTO,800); 
        assertEquals(parking.getParkingId(), 1);
        assertEquals(parking.getParkingMinutes(), 800);
        assertEquals(parking.getTypeVehicle(), VehicleEnum.MOTO);
        }
    
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
}
