package Wrapper;

public class aj // SensorDataLogger.java
import java.util.ArrayList;
import java.util.List;

public class SensorDataLogger {
    // accepts primitive double
    public static void storePrimitive(double value, List<Double> store) {
        store.add(value); // auto-boxing to Double
    }

    // accepts wrapper Double (can be null)
    public static void storeWrapper(Double value, List<Double> store) {
        store.add(value); // stores null if value is null
    }

    public static void main(String[] args) {
        List<Double> storage = new ArrayList<>();
        storePrimitive(23.5, storage);
        storeWrapper(26.0, storage);
        storeWrapper(null, storage); // cache or null allowed
        storePrimitive(21.2, storage);

        System.out.println("Stored sensor readings (allowing nulls): " + storage);

        // reading: auto-unboxing careful with nulls
        double sum = 0.0;
        int count = 0;
        for (Double d : storage) {
            if (d != null) {
                sum += d; // auto-unboxing
                count++;
            }
        }
        System.out.println("Average (ignoring nulls): " + (count==0?0:sum/count));
    }
}
{
}
