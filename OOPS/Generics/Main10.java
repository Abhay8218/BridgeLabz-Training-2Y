package Generics;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile("Phone A", 299.99), new Mobile("Phone B", 499.99));
        List<Laptop> laptops = Arrays.asList(new Laptop("Laptop X", 999.0), new Laptop("Laptop Y", 1299.0));

        System.out.println("Total mobiles: $" + Utils.calculateTotal(mobiles));
        System.out.println("Total laptops: $" + Utils.calculateTotal(laptops));
    }
}

