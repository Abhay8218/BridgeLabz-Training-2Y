package Generics;

public class q5 {
    private final String name;
    public Fruit(String name) { this.name = name; }
    public String getName() { return name; }
    @Override
    public String toString() { return getClass().getSimpleName() + "(" + name + ")"; }
}
public class Apple extends Fruit {
    public Apple(String name) { super(name); }
}
public class Mango extends Fruit {
    public Mango(String name) { super(name); }
}
