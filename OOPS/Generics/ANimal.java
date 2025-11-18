package Generics;

public class ANimal {
    private final String name;
    public Animal(String name) { this.name = name; }
    public String getName() { return name; }
    @Override
    public String toString() { return getClass().getSimpleName() + "(" + name + ")"; }
}
public class Dog extends Animal {
    public Dog(String name) { super(name); }
}
public class Cat extends Animal {
    public Cat(String name) { super(name); }
}
import java.util.List;

public class Utils {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(a);
    }
}

