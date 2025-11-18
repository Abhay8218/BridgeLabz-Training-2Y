package Generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> eleStore = new Storage<>();
        eleStore.addItem(new Electronics("E01", "TV"));
        eleStore.addItem(new Electronics("E02", "Speaker"));

        Storage<Groceries> groStore = new Storage<>();
        groStore.addItem(new Groceries("G01", "Rice"));
        groStore.addItem(new Groceries("G02", "Wheat"));

        // Display using wildcard method:
        Utils.displayAll(eleStore.getAll());
        Utils.displayAll(groStore.getAll());
    }
}

