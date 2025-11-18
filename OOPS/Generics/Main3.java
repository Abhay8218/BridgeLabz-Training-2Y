package Generics;


public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.isEqual("abc", "abc")); // true
        System.out.println(Utils.isEqual(10, 20));       // false
        System.out.println(Utils.isEqual(null, null));   // true
        System.out.println(Utils.isEqual(null, "x"));    // false
    }
}
