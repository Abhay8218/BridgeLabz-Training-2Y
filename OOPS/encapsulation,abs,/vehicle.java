// Vehicle.java
abstract class vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate: " + rentalRate);
    }

    public abstract double calculateRentalCost(int days);
}

// Insurable.java
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car.java
class Car extends Vehicle implements Insurable {
    private String insurancePolicy;

    public Car(String vehicleNumber, double rate, String insurancePolicy) {
        super(vehicleNumber, "Car", rate);
        this.insurancePolicy = insurancePolicy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // fixed insurance for simplicity
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: " + insurancePolicy;
    }
}

// Bike.java
class Bike extends Vehicle implements Insurable {
    private String insurancePolicy;

    public Bike(String vehicleNumber, double rate, String insurancePolicy) {
        super(vehicleNumber, "Bike", rate);
        this.insurancePolicy = insurancePolicy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8; // cheaper than car
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: " + insurancePolicy;
    }
}

// Truck.java
class Truck extends Vehicle implements Insurable {
    private String insurancePolicy;

    public Truck(String vehicleNumber, double rate, String insurancePolicy) {
        super(vehicleNumber, "Truck", rate);
        this.insurancePolicy = insurancePolicy;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; // more expensive
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: " + insurancePolicy;
    }
}

// MainVehicleRental.java
import java.util.*;

public class MainVehicleRental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C123", 2000, "POL123"));
        vehicles.add(new Bike("B456", 500, "POL456"));
        vehicles.add(new Truck("T789", 5000, "POL789"));

        for (Vehicle v : vehicles) {
            v.displayDetails();
            int days = 3; // assume 3 days rental
            System.out.println("Rental Cost for " + days + " days: " + v.calculateRentalCost(days));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance Cost: " + ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            }
            System.out.println("--------------");
        }
    }
}
