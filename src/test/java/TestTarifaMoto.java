import org.junit.Test;
<<<<<<< HEAD
<<<<<<< Updated upstream
import com.unicauca.tallerparqueadero.domain.*;
=======
import domain.Parking;
import domain.VehicleEnum;
import domain.service.ParkingService;

>>>>>>> Stashed changes
=======
import domain.Parking;
import domain.VehicleEnum;
import domain.service.ParkingService;
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
import static org.junit.Assert.*;

public class TestTarifaMoto {
    @Test
<<<<<<< Updated upstream
    public void testMotoRedondeo() throws ParseException {
<<<<<<< HEAD
        System.out.println("Moto Con redondeo");
        Ticket ticket = new Ticket(AutoEnum.MOTO,80); 
        int precio = parqueadero.calcularTarifa(ticket);
=======
    public void testMotoRedondeo() {

        System.out.println("Moto mas de 60 minutos");
        Parking parking = new Parking(1, VehicleEnum.MOTO, 80);

        int precio = new ParkingService().calculateParkingFee(parking);

>>>>>>> Stashed changes
=======
        System.out.println("Moto mas de 60 minutos");
        Parking parking = new Parking(1,VehicleEnum.MOTO,80); 
        int precio = new ParkingService().calculateParkingFee(parking);
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
        assertEquals(1200, precio);
    }

    @Test
<<<<<<< HEAD
<<<<<<< Updated upstream
    public void testCarroMenosTiempo() throws ParseException {
=======
    public void testMotoMenosTiempo() throws ParseException {
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
        System.out.println("Moto menos de 60 minutos");
        Parking parking = new Parking(1,VehicleEnum.MOTO,10); 
        int precio = new ParkingService().calculateParkingFee(parking);
        assertEquals(1000, precio);
        }
<<<<<<< HEAD
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
=======
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5
    }
}
