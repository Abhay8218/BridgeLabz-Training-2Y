package Generics;

public class Product {
    private final String name;
    private final double price;
    public Product(String name, double price) { this.name = name; this.price = price; }
    public double getPrice() { return price; }
    public String getName() { return name; }
    @Override
    public String toString() { return getClass().getSimpleName() + "(" + name + ", $" + price + ")"; }
}
public class Mobile extends Product {
    public Mobile(String name, double price) { super(name, price); }
}

public class Laptop extends Product {
    public Laptop(String name, double price) { super(name, price); }
}
import java.util.List;

public class Utils {
    public static double calculateTotal(List<? extends Product> items) {
        double sum = 0.0;
        for (Product p : items) sum += p.getPrice();
        return sum;
    }
}

