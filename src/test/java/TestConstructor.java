import domain.Parking;
import domain.VehicleEnum;

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
}
