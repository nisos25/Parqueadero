import domain.Parking;
import domain.VehicleEnum;
import domain.access.IParkingRepository;
import domain.service.Service;
import domain.service.ParkingService;

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
}
