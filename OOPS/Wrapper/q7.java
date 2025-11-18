package Wrapper;// PricesAnalysis.java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PricesAnalysis {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        List<Double> list = new ArrayList<>();
        for (double p : prices) list.add(p); // auto-boxing

        double maxPrice = Collections.max(list);
        double sum = 0.0;
        for (Double d : list) sum += d;
        double avg = sum / list.size();

        System.out.println("Prices: " + list);
        System.out.println("Highest price: " + maxPrice);
        System.out.println("Average price: " + avg);
    }
}

