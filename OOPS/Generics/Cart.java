package Generics;

import java.util.ArrayList;
import java.util.List;

public class Cart<T> {
    private final List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public boolean removeItem(T item) { return items.remove(item); }
    public void displayItems() {
        System.out.println("Cart items:");
        for (T it : items) System.out.println(" - " + it);
    }
}

public class Clothing {
    private final String name;
    public Clothing(String name) { this.name = name; }
    @Override
    public String toString() { return "Clothing[" + name + "]"; }
}
