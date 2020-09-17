<<<<<<< HEAD
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
package domain.service;

import domain.Parking;
import domain.access.IParkingRepository;
<<<<<<< HEAD

import java.util.List;

public class Service {

    private IParkingRepository repository;

    public Service(IParkingRepository repository) {
        this.repository = repository;
    }

    public boolean saveParking(Parking newParking) {

        if (newParking == null || newParking.getParkingTime() <= 0 ||
                newParking.getVehicleType() == null || newParking.getParkingId() <= 0) {
            return false;
        }

        if (repository == null)
            return false;

        repository.save(newParking);
        return true;
    }

    public List<Parking> listParking() {
        List<Parking> parking;
        parking = repository.list();

        return parking;
    }

    public int calculateFee(Parking parking) {
=======
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Santander, Luis Romero
 */
public class Service {
    
    private IParkingRepository repository;
    
    public Service(IParkingRepository repository) {
        this.repository = repository;
    }
    
    public boolean saveParking(Parking newParking) {

        //Validate product
        if (newParking == null || newParking.getParkingMinutes()<= 0 || 
                newParking.getTypeVehicle() == null || newParking.getParkingId() <= 0) {
            return false;
        }
        if (repository == null)
            return false;
        repository.save(newParking);
        return true;

    }

    public List<Parking> listParking() {
        List<Parking> parking = new ArrayList<>();
        parking = repository.list();;

        return parking;
    }
    
    public int calculateFee(Parking parking){
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
        return new ParkingService().calculateParkingFee(parking);
    }
}
