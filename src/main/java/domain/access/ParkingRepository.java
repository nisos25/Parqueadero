<<<<<<< HEAD:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
package com.unicauca.tallerparqueadero.domain.access;
=======
package domain.access;
>>>>>>> Stashed changes:src/main/java/domain/access/ParkingRepository.java
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.access;
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5:src/main/java/domain/access/ParkingRepository.java

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

<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
/**
 *
 * @author juan-
 */
<<<<<<< HEAD:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
public class IngresoRepository implements IIngresoRepository {
=======
public class ParkingRepository implements IParkingRepository{
>>>>>>> Stashed changes:src/main/java/domain/access/ParkingRepository.java
=======
public class ParkingRepository implements IParkingRepository{
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5:src/main/java/domain/access/ParkingRepository.java

    private Connection conn;

    public ParkingRepository() {
        initDatabase();
    }

    @Override
    public boolean save(Parking newParking) {

        try {
            //Validate product
<<<<<<< HEAD:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
            if (newIngreso == null || newIngreso.getIngresoId() < 0 
                    || newIngreso.getTipo().toString().isBlank() || newIngreso.getTiempo()<=0) {
=======
            if (newParking == null || newParking.getParkingTime()<= 0 || newParking.getVehicleType() == null) {
>>>>>>> Stashed changes:src/main/java/domain/access/ParkingRepository.java
=======
            if (newParking == null || newParking.getParkingMinutes()<= 0 || newParking.getTypeVehicle() == null) {
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5:src/main/java/domain/access/ParkingRepository.java
                return false;
            }
            //this.connect();

<<<<<<< HEAD:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
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
=======
            String sql = "INSERT INTO Parking ( ParkingId, TypeVehicle, ParkingMinutes ) "
                    + "VALUES ( ?, ?, ? )";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, newParking.getParkingId());
            pstmt.setString(2, newParking.getTypeVehicle().name());
            pstmt.setDouble(3, newParking.getParkingMinutes());
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5:src/main/java/domain/access/ParkingRepository.java
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

<<<<<<< HEAD:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
<<<<<<< Updated upstream:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
            String sql = "SELECT IngresoId, Tipo, Tiempo FROM Ingreso";
=======
            String sql = "SELECT ParkingId, VehicleType, ParkingTime FROM Parking";
>>>>>>> Stashed changes:src/main/java/domain/access/ParkingRepository.java
=======
            String sql = "SELECT ParkingId, TypeVehicle, ParkingMinutes FROM Parking";
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5:src/main/java/domain/access/ParkingRepository.java
            //this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
<<<<<<< HEAD:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
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
=======
                Parking newParking = new Parking();
                newParking.setParkingId(rs.getInt("ParkingId"));
                String upperString = rs.getString("TypeVehicle").toUpperCase();
                VehicleEnum vehicleEnum = VehicleEnum.valueOf(upperString);
                newParking.setTypeVehicle(vehicleEnum);
                newParking.setParkingMinutes(rs.getInt("ParkingMinutes"));

                parking.add(newParking);   

>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5:src/main/java/domain/access/ParkingRepository.java
            }
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parking;
    }

    private void initDatabase() {
        // SQL statement for creating a new table
<<<<<<< HEAD:src/main/java/com/unicauca/tallerparqueadero/domain/access/IngresoRepository.java
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
=======
        String sql = "CREATE TABLE IF NOT EXISTS Parking (\n"
                + "	ParkingId integer PRIMARY KEY,\n"
                + "	TypeVehicle text NOT NULL,\n"
                + "	ParkingMinutes int\n"
>>>>>>> ba20c8aadc5be6e12bffedc5162c853e687e36a5:src/main/java/domain/access/ParkingRepository.java
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
