package domain;

public class Parking {
    
    private int parkingId;
    private VehicleEnum vehicleType;
    private int parkingTime;

    public Parking(int parkingId, VehicleEnum vehicleType, int parkingTime) {
        this.parkingId = parkingId;
        this.vehicleType = vehicleType;
        this.parkingTime = parkingTime;
    }

    public Parking() {
        
    }

    public int getParkingId() {
        return parkingId;
    }

    public VehicleEnum getVehicleType() {
        return vehicleType;
    }

    public int getParkingTime() {
        return parkingTime;
    }

    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

    public void setVehicleType(VehicleEnum vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setParkingTime(int parkingTime) {
        this.parkingTime = parkingTime;
    }
    
    @Override
    public String toString() {
        return "Ingreso: " + parkingId + ", tipo de vehículo: " + 
                vehicleType.toString().toLowerCase()+ ", tiempo =  " + parkingTime + " minutos";
    }
}
