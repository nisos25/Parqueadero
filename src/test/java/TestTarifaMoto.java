import org.junit.Test;
<<<<<<< Updated upstream
import com.unicauca.tallerparqueadero.domain.*;
=======
import domain.Parking;
import domain.VehicleEnum;
import domain.service.ParkingService;

>>>>>>> Stashed changes
import static org.junit.Assert.*;

public class TestTarifaMoto {
    Parqueadero parqueadero = new Parqueadero();
    @Test
<<<<<<< Updated upstream
    public void testMotoRedondeo() throws ParseException {
        System.out.println("Moto Con redondeo");
        Ticket ticket = new Ticket(AutoEnum.MOTO,80); 
        int precio = parqueadero.calcularTarifa(ticket);
=======
    public void testMotoRedondeo() {

        System.out.println("Moto mas de 60 minutos");
        Parking parking = new Parking(1, VehicleEnum.MOTO, 80);

        int precio = new ParkingService().calculateParkingFee(parking);

>>>>>>> Stashed changes
        assertEquals(1200, precio);
    }

    @Test
<<<<<<< Updated upstream
    public void testCarroMenosTiempo() throws ParseException {
        System.out.println("Moto menos de 60 minutos");
        Ticket ticket = new Ticket(AutoEnum.MOTO,10); 
        int precio = parqueadero.calcularTarifa(ticket);
        assertEquals(1000, precio);
        }
    public void testCarroNoRedondeo() throws ParseException {
        System.out.println("Moto sin redondeo");
        Ticket ticket = new Ticket(AutoEnum.MOTO,120); 
        int precio = parqueadero.calcularTarifa(ticket);
        assertEquals(1500, precio);
        }
=======
    public void testMotoMenosTiempo() {

        System.out.println("Moto menos de 60 minutos");
        Parking parking = new Parking(1, VehicleEnum.MOTO, 10);

        int precio = new ParkingService().calculateParkingFee(parking);

        assertEquals(1000, precio);
>>>>>>> Stashed changes
    }
}
