// Vehicle.java
abstract class ride {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm){
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId(){ return vehicleId; }
    public String getDriverName(){ return driverName; }
    public double getRatePerKm(){ return ratePerKm; }

    public void getVehicleDetails(){
        System.out.println("Vehicle ID: "+vehicleId+", Driver: "+driverName+", Rate/Km: "+ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

// GPS.java
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

// Car.java
class RideCar extends RideVehicle implements GPS {
    private String location;

    public RideCar(String id, String driver, double rate){
        super(id, driver, rate);
        location = "HQ";
    }

    @Override
    public double calculateFare(double distance){ return distance * getRatePerKm(); }

    @Override
    public String getCurrentLocation(){ return location; }

    @Override
    public void updateLocation(String loc){ location = loc; }
}

// Bike.java
class RideBike extends RideVehicle implements GPS {
    private String location;

    public RideBike(String id, String driver, double rate){
        super(id, driver, rate);
        location = "HQ";
    }

    @Override
    public double calculateFare(double distance){ return distance * getRatePerKm() * 0.8; }

    @Override
    public String getCurrentLocation(){ return location; }

    @Override
    public void updateLocation(String loc){ location = loc; }
}

// Auto.java
class RideAuto extends RideVehicle implements GPS {
    private String location;

    public RideAuto(String id, String driver, double rate){
        super(id, driver, rate);
        location = "HQ";
    }

    @Override
    public double calculateFare(double distance){ return distance * getRatePerKm() * 0.9; }

    @Override
    public String getCurrentLocation(){ return location; }

    @Override
    public void updateLocation(String loc){ location = loc; }
}

// MainRideHailing.java
import java.util.*;

public class MainRideHailing {
    public static void main(String[] args){
        List<RideVehicle> rides = new ArrayList<>();
        rides.add(new RideCar("V101","Alice",20));
        rides.add(new RideBike("V102","Bob",10));
        rides.add(new RideAuto("V103","Charlie",15));

        double distance = 10; // km
        for(RideVehicle rv : rides){
            rv.getVehicleDetails();
            System.out.println("Fare for "+distance+" km: "+rv.calculateFare(distance));
            GPS gps = (GPS) rv;
            System.out.println("Current Location: "+gps.getCurrentLocation());
            gps.updateLocation("Downtown");
            System.out.println("Updated Location: "+gps.getCurrentLocation());
            System.out.println("--------------");
        }
    }
}
