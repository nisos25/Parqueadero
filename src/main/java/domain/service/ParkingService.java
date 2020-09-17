package domain.service;

import domain.Parking;
import domain.CalculateFee;
import domain.access.Factory;

public class ParkingService {

    public int calculateParkingFee(Parking parking) {

        int result = 0;

        if (parking == null) {
            return result;
        }

        CalculateFee fee = Factory.getInstance().getVehicle(parking.getVehicleType());

        if (fee != null)
            result = fee.calculateFee(parking.getParkingTime());

        return result;
    }
}
