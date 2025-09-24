// FoodItem.java
abstract class onlinefood {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName(){ return itemName; }
    public double getPrice(){ return price; }
    public int getQuantity(){ return quantity; }

    public void getItemDetails(){
        System.out.println("Item: "+itemName+", Price: "+price+", Quantity: "+quantity);
    }

    public abstract double calculateTotalPrice();
}

// Discountable.java
interface Discountable {
    void applyDiscount(double discount);
    double getDiscountDetails();
}

// VegItem.java
class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String name, double price, int qty){ super(name,price,qty); }

    @Override
    public double calculateTotalPrice(){ return getPrice()*getQuantity() - discount; }

    @Override
    public void applyDiscount(double discount){ this.discount = discount; }

    @Override
    public double getDiscountDetails(){ return discount; }
}

// NonVegItem.java
class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;
    private double extraCharge = 50; // extra charge for non-veg

    public NonVegItem(String name, double price, int qty){ super(name,price,qty); }

    @Override
    public double calculateTotalPrice(){ return (getPrice()*getQuantity() + extraCharge) - discount; }

    @Override
    public void applyDiscount(double discount){ this.discount = discount; }

    @Override
    public double getDiscountDetails(){ return discount; }
}

// MainFoodDelivery.java
import java.util.*;

public class MainFoodDelivery {
    public static void main(String[] args){
        List<FoodItem> order = new ArrayList<>();
        VegItem veg = new VegItem("Paneer Curry",200,2);
        NonVegItem nonVeg = new NonVegItem("Chicken Curry",300,1);

        veg.applyDiscount(20);
        nonVeg.applyDiscount(50);

        order.add(veg);
        order.add(nonVeg);

        for(FoodItem f : order){
            f.getItemDetails();
            System.out.println("Discount Applied: "+((Discountable)f).getDiscountDetails());
            System.out.println("Total Price: "+f.calculateTotalPrice());
            System.out.println("--------------");
        }
    }
}
