package Generics;
public class Main {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics("Phone", 699.99));
        eCart.addItem(new Electronics("Headphones", 149.99));
        eCart.displayItems();

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing("T-shirt"));
        cCart.addItem(new Clothing("Jeans"));
        cCart.displayItems();
    }
}

