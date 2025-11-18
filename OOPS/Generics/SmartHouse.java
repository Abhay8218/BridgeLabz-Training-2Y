package Generics;

public abstract class WarehouseItem {
    private final String id;
    private final String name;
    public WarehouseItem(String id, String name) { this.id = id; this.name = name; }
    public String getId() { return id; }
    public String getName() { return name; }
    @Override
    public String toString() { return getClass().getSimpleName() + "(" + id + ", " + name + ")"; }
}
public class Electronics extends WarehouseItem {
    public Electronics(String id, String name) { super(id, name); }
}
public class Groceries extends WarehouseItem {
    public Groceries(String id, String name) { super(id, name); }
}
public class Furniture extends WarehouseItem {
    public Furniture(String id, String name) { super(id, name); }
}
import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private final List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public T getItem(int index) { return items.get(index); }
    public List<T> getAll() { return new ArrayList<>(items); }
}
import java.util.List;

public class Utils {
    // wildcard display method: works for any subtype of WarehouseItem
    public static void displayAll(List<? extends WarehouseItem> items) {
        System.out.println("Warehouse items:");
        for (WarehouseItem it : items) System.out.println(" - " + it);
    }
}

