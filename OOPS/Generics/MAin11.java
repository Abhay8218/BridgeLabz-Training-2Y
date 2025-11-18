package Generics;

public class MAin11 public class Main {
    public static void main(String[] args) {
        FleetManager<Truck> tm = new FleetManager<>();
        tm.addVehicle(new Truck("T-001"));
        tm.addVehicle(new Truck("T-002"));
        tm.showFleet();

        FleetManager<Bike> bm = new FleetManager<>();
        bm.addVehicle(new Bike("B-100"));
        bm.addVehicle(new Bike("B-200"));
        bm.showFleet();
    }
}
{
}
