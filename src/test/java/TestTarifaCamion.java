<<<<<<< Updated upstream


/**
 *
 * @author User
 */
/**
 *
 * @author User
 */
import java.text.ParseException;
import org.junit.Test;
import com.unicauca.tallerparqueadero.domain.*;
=======
import org.junit.Test;
import domain.Parking;
import domain.VehicleEnum;
import domain.service.ParkingService;

>>>>>>> Stashed changes
import static org.junit.Assert.*;

public class TestTarifaCamion {
<<<<<<< Updated upstream
    Parqueadero parqueadero = new Parqueadero();
    @Test
    public void testCamionRedondeo() throws ParseException {
        System.out.println("Camion con redondeo");
        Ticket ticket = new Ticket(AutoEnum.CAMION,1600); 
        int precio = parqueadero.calcularTarifa(ticket);
        assertEquals(16700, precio);
        }

    @Test
    public void testCamionUnDia() throws ParseException {
        System.out.println("Camion un día");
        Ticket ticket = new Ticket(AutoEnum.CAMION,1000); 
        int precio = parqueadero.calcularTarifa(ticket);
        assertEquals(15000, precio);
        }
    @Test
    public void testCamionMedioDia() throws ParseException {
        System.out.println("Camion medio dia");
        Ticket ticket = new Ticket(AutoEnum.CAMION,120); 
        int precio = parqueadero.calcularTarifa(ticket);
        assertEquals(10000, precio);
        }
    @Test
    public void testCamionSinRedondeo() throws ParseException {
        System.out.println("Camion sin redondeo");
        Ticket ticket = new Ticket(AutoEnum.CAMION,2640); 
        int precio = parqueadero.calcularTarifa(ticket);
        assertEquals(27500, precio);
        }
=======

    @Test
    public void testCamionMasDelDia() {

        System.out.println("Camion más de un día completo");
        Parking parking = new Parking(1, VehicleEnum.CAMION, 1445);

        int precio = new ParkingService().calculateParkingFee(parking);

        assertEquals(15100, precio);
    }

    @Test
    public void testCamionDiaCompleto() {

        System.out.println("Camion día completo");
        Parking parking = new Parking(1, VehicleEnum.CAMION, 1440);

        int precio = new ParkingService().calculateParkingFee(parking);

        assertEquals(15000, precio);
    }

    @Test
    public void testCamionMasDeMedioDia() {

        System.out.println("Camion más de medio día");
        Parking parking = new Parking(1, VehicleEnum.CAMION, 800);

        int precio = new ParkingService().calculateParkingFee(parking);

        assertEquals(15000, precio);
    }

    @Test
    public void testCamionMedioDia() {

        System.out.println("Camion medio día");
        Parking parking = new Parking(1, VehicleEnum.CAMION, 720);

        int precio = new ParkingService().calculateParkingFee(parking);

        assertEquals(10000, precio);
    }

    @Test
    public void testCamionMenosMedioDia() {

        System.out.println("Camion menos de medio día");
        Parking parking = new Parking(1, VehicleEnum.CAMION, 600);

        int precio = new ParkingService().calculateParkingFee(parking);

        assertEquals(10000, precio);
>>>>>>> Stashed changes
    }

}
