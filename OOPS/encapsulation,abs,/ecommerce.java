// Product.java
abstract class ecommerce {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId(){ return productId; }
    public String getName(){ return name; }
    public double getPrice(){ return price; }

    public void setPrice(double price){ this.price = price; }

    public abstract double calculateDiscount();
}

// Taxable.java
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Electronics.java
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price){ super(id,name,price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.10; }

    @Override
    public double calculateTax() { return getPrice() * 0.18; }

    @Override
    public String getTaxDetails() { return "GST 18%"; }
}

// Clothing.java
class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price){ super(id,name,price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.20; }

    @Override
    public double calculateTax() { return getPrice() * 0.12; }

    @Override
    public String getTaxDetails() { return "GST 12%"; }
}

// Groceries.java
class Groceries extends Product {
    public Groceries(int id, String name, double price){ super(id,name,price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.05; }
}

// MainEcommerce.java
import java.util.*;

public class MainEcommerce {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1,"Laptop",50000));
        products.add(new Clothing(2,"Shirt",1000));
        products.add(new Groceries(3,"Rice",500));

        for(Product p : products){
            double tax = 0;
            if(p instanceof Taxable) tax = ((Taxable)p).calculateTax();
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
}
