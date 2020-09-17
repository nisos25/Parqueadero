<<<<<<< HEAD
package domain;

public class Parking {

    private int parkingId;
    private VehicleEnum vehicleType;
    private int parkingTime;

    public Parking(int parkingId, VehicleEnum vehicleType, int parkingTime) {
        this.parkingId = parkingId;
        this.vehicleType = vehicleType;
        this.parkingTime = parkingTime;
    }

    public Parking() {

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Nicolas Santander, Luis Romero
 */
public class Parking {
    
    private int parkingId;
    private VehicleEnum typeVehicle;
    private int parkingMinutes;

    public Parking(int parkingId, VehicleEnum typeVehicle, int parkingMinutes) {
        this.parkingId = parkingId;
        this.typeVehicle = typeVehicle;
        this.parkingMinutes = parkingMinutes;
    }

    public Parking() {
        
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
    }

    public int getParkingId() {
        return parkingId;
    }

<<<<<<< HEAD
    public VehicleEnum getVehicleType() {
        return vehicleType;
    }

    public int getParkingTime() {
        return parkingTime;
=======
    public VehicleEnum getTypeVehicle() {
        return typeVehicle;
    }

    public int getParkingMinutes() {
        return parkingMinutes;
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
    }

    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

<<<<<<< HEAD
    public void setVehicleType(VehicleEnum vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setParkingTime(int parkingTime) {
        this.parkingTime = parkingTime;
    }

    @Override
    public String toString() {
        return "Ingreso: " + parkingId + ", tipo de vehículo: " +
                vehicleType.toString().toLowerCase() + ", tiempo =  " + parkingTime + " minutos";
=======
    public void setTypeVehicle(VehicleEnum typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public void setParkingMinutes(int parkingMinutes) {
        this.parkingMinutes = parkingMinutes;
    }
    
    @Override
    public String toString() {
        return "Ingreso: " + parkingId + ", tipo de vehículo: " + 
                typeVehicle.toString().toLowerCase()+ ", tiempo =  " + parkingMinutes + " minutos";
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
    }
}
