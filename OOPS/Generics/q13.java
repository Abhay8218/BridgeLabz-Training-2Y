package Generics;

public interface Category { String categoryName(); }
public enum BookCategory implements Category {
    FICTION, NONFICTION, EDUCATION;
    public String categoryName() { return name(); }
}
public enum ClothingCategory implements Category {
    MEN, WOMEN, KIDS;
    public String categoryName() { return name(); }
}
public class Product<C extends Category> {
    private final String name;
    private final double price;
    private final C category;
    public Product(String name, double price, C category) {
        this.name = name; this.price = price; this.category = category;
    }
    public double getPrice() { return price; }
    public C getCategory() { return category; }
    public String getName() { return name; }
    @Override
    public String toString() { return "Product(" + name + ", $" + price + ", " + category.categoryName() + ")"; }
}

public class Utils {
    // apply discount on product
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        // can't change price since Product.price is final; instead demonstrate discountedPrice
        double discounted = product.getPrice() * (1 - percentage / 100.0);
        System.out.printf("Original: $%.2f, After %.1f%% discount: $%.2f%n", product.getPrice(), percentage, discounted);
    }
}

