<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
package com.unicauca.tallerparqueadero.domain.access;
=======
package domain.access;
>>>>>>> Stashed changes:src/main/java/domain/access/ParkingRepository.java

import com.unicauca.tallerparqueadero.domain.Ingreso;
import com.unicauca.tallerparqueadero.domain.AutoEnum;
import com.unicauca.tallerparqueadero.service.Service;
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

<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
/**
 * Es una implementación que tiene libertad de hacer una implementación del
 * contrato. Lo puede hacer con Sqlite, postgres, mysql, u otra tecnología
 *
 * @author Libardo, Julio
 */
public class IngresoRepository implements IIngresoRepository {
=======
public class ParkingRepository implements IParkingRepository{
>>>>>>> Stashed changes:src/main/java/domain/access/ParkingRepository.java

    private Connection conn;

    public IngresoRepository() {
        initDatabase();
    }

    @Override
    public boolean save(Ingreso newIngreso) {

        try {
            //Validate product
<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
            if (newIngreso == null || newIngreso.getIngresoId() < 0 
                    || newIngreso.getTipo().toString().isBlank() || newIngreso.getTiempo()<=0) {
=======
            if (newParking == null || newParking.getParkingTime()<= 0 || newParking.getVehicleType() == null) {
>>>>>>> Stashed changes:src/main/java/domain/access/ParkingRepository.java
                return false;
            }
            //this.connect();

<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
            String sql = "INSERT INTO Ingreso ( IngresoId, Tipo, Tiempo ) "
                    + "VALUES ( ?, ?, ? )";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, newIngreso.getIngresoId());
            pstmt.setString(2, newIngreso.getTipo().toString());
            pstmt.setInt(3, newIngreso.getTiempo());
=======
            String sql = "INSERT INTO Parking ( ParkingId, VehicleType, ParkingTime ) "
                    + "VALUES ( ?, ?, ? )";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, newParking.getParkingId());
            pstmt.setString(2, newParking.getVehicleType().name());
            pstmt.setDouble(3, newParking.getParkingTime());
>>>>>>> Stashed changes:src/main/java/domain/access/ParkingRepository.java
            pstmt.executeUpdate();
            //this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Ingreso> list() {
        List<Ingreso> products = new ArrayList<>();
        try {

<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
            String sql = "SELECT IngresoId, Tipo, Tiempo FROM Ingreso";
=======
            String sql = "SELECT ParkingId, VehicleType, ParkingTime FROM Parking";
>>>>>>> Stashed changes:src/main/java/domain/access/ParkingRepository.java
            //this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
                Ingreso newIngreso = new Ingreso();
                newIngreso.setIngresoId(rs.getInt("IngresoId"));
                String upperString= rs.getString("Tipo").toUpperCase();
                AutoEnum autoEnum = AutoEnum.valueOf(upperString);
                newIngreso.setTipo(autoEnum);
                newIngreso.setTiempo(rs.getInt("Tiempo"));

                products.add(newIngreso);
=======
                Parking newParking = new Parking();
                newParking.setParkingId(rs.getInt("ParkingId"));
                String upperString = rs.getString("VehicleType").toUpperCase();
                VehicleEnum vehicleEnum = VehicleEnum.valueOf(upperString);
                newParking.setVehicleType(vehicleEnum);
                newParking.setParkingTime(rs.getInt("ParkingTime"));

                parking.add(newParking);   

>>>>>>> Stashed changes:src/main/java/domain/access/ParkingRepository.java
            }
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    private void initDatabase() {
        // SQL statement for creating a new table
<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
        String sql = "CREATE TABLE IF NOT EXISTS Ingreso (\n"
                + "	IngresoId integer PRIMARY KEY,\n"
                + "	Tipo text NOT NULL,\n"
                + "	Tiempo integer\n"
=======
        String sql = "CREATE TABLE IF NOT EXISTS Parking (\n"
                + "	ParkingId integer PRIMARY KEY,\n"
                + "	VehicleType text NOT NULL,\n"
                + "	ParkingTime int\n"
>>>>>>> Stashed changes:src/main/java/domain/access/ParkingRepository.java
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

