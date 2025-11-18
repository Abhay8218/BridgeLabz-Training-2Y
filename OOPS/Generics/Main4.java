package Generics;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.maximum(3, 7, 5));                // 7
        System.out.println(Utils.maximum(2.2, 3.3, 1.1));        // 3.3
        System.out.println(Utils.maximum("apple","banana","pear")); // pear
    }
}
