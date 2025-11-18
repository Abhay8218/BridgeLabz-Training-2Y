package Wrapper;

// WrapperToPrimitive.java
public class q2 {
    public static void main(String[] args) {
        Double wrapper = Double.valueOf(45.67);

        // to double primitive
        double d = wrapper.doubleValue();

        // to int primitive using casting
        int i = (int) wrapper.doubleValue();

        System.out.println("Double wrapper: " + wrapper);
        System.out.println("double primitive: " + d);
        System.out.println("int primitive (cast): " + i);
    }
}

