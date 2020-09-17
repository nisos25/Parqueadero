import org.junit.Test;
import domain.Parking;
import domain.VehicleEnum;
import domain.service.ParkingService;

import static org.junit.Assert.*;

public class TestTarifaCarro {

    @Test
    public void testCarroRedondeo() {
        System.out.println("Carro mas de 60 minutos");
        Parking parking = new Parking(1, VehicleEnum.CARRO, 80);
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(2400, precio);
    }

    @Test
    public void testCarroMenosTiempo() {
        System.out.println("Carro menos de 60 minutos");
        Parking parking = new Parking(1, VehicleEnum.CARRO, 10);
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(2000, precio);
    }
}
    
    
