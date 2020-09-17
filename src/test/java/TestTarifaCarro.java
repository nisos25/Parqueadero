import java.text.ParseException;

import org.junit.Test;
<<<<<<< Updated upstream
import com.unicauca.tallerparqueadero.domain.*;
=======
import domain.Parking;
import domain.VehicleEnum;
import domain.service.ParkingService;

>>>>>>> Stashed changes
import static org.junit.Assert.*;

public class TestTarifaCarro {
    Parqueadero parqueadero = new Parqueadero();
    @Test
<<<<<<< Updated upstream
    public void testCarroRedondeo() throws ParseException {
        System.out.println("Carro Con redondeo");
        Ticket ticket = new Ticket(AutoEnum.CARRO,80); 
        int precio = parqueadero.calcularTarifa(ticket);
=======
    public void testCarroRedondeo() {

        System.out.println("Carro mas de 60 minutos");
        Parking parking = new Parking(1, VehicleEnum.CARRO, 80);

        int precio = new ParkingService().calculateParkingFee(parking);

>>>>>>> Stashed changes
        assertEquals(2400, precio);
    }

    @Test
    public void testCarroMenosTiempo() {

        System.out.println("Carro menos de 60 minutos");
<<<<<<< Updated upstream
        Ticket ticket = new Ticket(AutoEnum.CARRO,10); 
        int precio = parqueadero.calcularTarifa(ticket);
        assertEquals(2000, precio);
        }
    public void testCarroNoRedondeo() throws ParseException {
        System.out.println("Carro sin redondeo");
        Ticket ticket = new Ticket(AutoEnum.CARRO,120); 
        int precio = parqueadero.calcularTarifa(ticket);
        assertEquals(3000, precio);
        }
=======
        Parking parking = new Parking(1, VehicleEnum.CARRO, 10);

        int precio = new ParkingService().calculateParkingFee(parking);

        assertEquals(2000, precio);
>>>>>>> Stashed changes
    }
}
    
    
