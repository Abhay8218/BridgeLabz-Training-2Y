package Generics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.0);

        System.out.println("Sum ints: " + Utils.sumNumbers(ints));       // 10.0
        System.out.println("Sum doubles: " + Utils.sumNumbers(doubles)); // 7.0
    }
}

