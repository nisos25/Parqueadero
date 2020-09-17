package domain.access;

import domain.Parking;
import java.util.List;


public interface IParkingRepository {
    boolean save(Parking newParking);

    List<Parking> list();
}
