package Wrapper;

// AutoBoxingExample.java
import java.util.ArrayList;
import java.util.List;

public class AutoBoxingExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // auto-boxing when adding
        list.add(5);
        list.add(10);
        list.add(8);
        list.add(12);
        list.add(20);

        // auto-unboxing when summing
        int sum = 0;
        for (Integer n : list) sum += n;

        System.out.println("Sum of numbers = " + sum); // expected 55
    }
}

