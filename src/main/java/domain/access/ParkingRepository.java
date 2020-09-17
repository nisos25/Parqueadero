package domain.access;

import domain.Parking;
import domain.VehicleEnum;
import domain.service.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParkingRepository implements IParkingRepository {

    private Connection conn;

    public ParkingRepository() {
        initDatabase();
    }

    @Override
    public boolean save(Parking newParking) {

        try {
            //Validate product
            if (newParking == null || newParking.getParkingTime() <= 0 || newParking.getVehicleType() == null) {
                return false;
            }
            //this.connect();

            String sql = "INSERT INTO Parking ( ParkingId, VehicleType, ParkingTime ) "
                    + "VALUES ( ?, ?, ? )";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, newParking.getParkingId());
            pstmt.setString(2, newParking.getVehicleType().name());
            pstmt.setDouble(3, newParking.getParkingTime());
            pstmt.executeUpdate();
            //this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Parking> list() {
        List<Parking> parking = new ArrayList<>();
        try {

            String sql = "SELECT ParkingId, VehicleType, ParkingTime FROM Parking";
            //this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Parking newParking = new Parking();
                newParking.setParkingId(rs.getInt("ParkingId"));
                String upperString = rs.getString("VehicleType").toUpperCase();
                VehicleEnum vehicleEnum = VehicleEnum.valueOf(upperString);
                newParking.setVehicleType(vehicleEnum);
                newParking.setParkingTime(rs.getInt("ParkingTime"));

                parking.add(newParking);

            }
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parking;
    }

    private void initDatabase() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Parking (\n"
                + "	ParkingId integer PRIMARY KEY,\n"
                + "	VehicleType text NOT NULL,\n"
                + "	ParkingTime int\n"
                + ");";

        try {
            this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void connect() {
        // SQLite connection string
        //String url = "jdbc:sqlite:./mydatabase.db";
        String url = "jdbc:sqlite::memory:";

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
