package domain.service;

import domain.Parking;
import domain.access.IParkingRepository;

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
        return new ParkingService().calculateParkingFee(parking);
    }
}
