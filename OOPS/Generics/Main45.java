package Generics;

public class Main {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple("Red Delicious"));
        appleBox.add(new Apple("Granny Smith"));
        appleBox.display();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango("Alphonso"));
        mangoBox.display();

        // The following won't compile (uncomment to see compiler error):
        // FruitBox<String> bad = new FruitBox<>(); // String is not a Fruit
    }
}
