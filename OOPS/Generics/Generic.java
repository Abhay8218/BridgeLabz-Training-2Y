package Generics;

public class Vehicle {
    private final String id;
    public Vehicle(String id) { this.id = id; }
    public String getId() { return id; }
    @Override
    public String toString() { return getClass().getSimpleName() + "(" + id + ")"; }
}
public class Truck extends Vehicle { public Truck(String id) { super(id); } }
public class Bike extends Vehicle { public Bike(String id) { super(id); } }

import java.util.ArrayList;
import java.util.List;

public class FleetManager<T extends Vehicle> {
    private final List<T> fleet = new ArrayList<>();
    public void addVehicle(T v) { fleet.add(v); }
    public void showFleet() {
        System.out.println("Fleet content:");
        for (T v : fleet) System.out.println(" - " + v);
    }
}
