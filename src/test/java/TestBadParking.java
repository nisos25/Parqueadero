<<<<<<< HEAD
=======

>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
import domain.Parking;
import domain.VehicleEnum;
import domain.access.IParkingRepository;
import domain.service.Service;
import domain.service.ParkingService;
<<<<<<< HEAD

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBadParking {

    IParkingRepository repository;

    @Test
    public void testNullVehicle() {
        System.out.println("Null car parking");
        Parking parking = new Parking();

        int precio = new ParkingService().calculateParkingFee(parking);

        assertEquals(0, precio);
    }

    @Test
    public void testwithoutMinutes() {
        System.out.println("Null car parking");
        Parking parking = new Parking(1, VehicleEnum.CARRO, 0);

        boolean methodSave = new Service(repository).saveParking(parking);

        assertEquals(false, methodSave);
    }

    @Test
    public void testWithoutRepositoryInstantiated() {
        System.out.println("Null car parking");
        Parking parking = new Parking(1, VehicleEnum.CARRO, 30);

        boolean methodSave = new Service(repository).saveParking(parking);

        assertEquals(false, methodSave);
    }
=======
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
public class TestBadParking {
    
    IParkingRepository repository;
    
    @Test
    public void testNullVehicle() throws ParseException {
        System.out.println("Null car parking");
        Parking parking = new Parking(); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(0, precio);
        }

    @Test
    public void testwithoutMinutes() throws ParseException {
        System.out.println("Null car parking");
        Parking parking = new Parking(1, VehicleEnum.CARRO, 0); 
        boolean methodSave = new Service(repository).saveParking(parking);
        assertEquals(false, methodSave);
        }
    
    @Test
    public void testWithoutRepositoryInstantiated() throws ParseException {
        System.out.println("Null car parking");
        Parking parking = new Parking(1, VehicleEnum.CARRO, 30); 
        boolean methodSave = new Service(repository).saveParking(parking);
        assertEquals(false, methodSave);
        }
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
}
