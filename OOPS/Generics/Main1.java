package Generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("Integer box: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String box: " + strBox.get());

        Box<Double> dblBox = new Box<>();
        dblBox.set(3.1416);
        System.out.println("Double box: " + dblBox.get());
    }
}
