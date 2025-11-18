package Wrapper;

// WrapperComparison.java
public class WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b: " + (a == b));             // true (cache)
        System.out.println("c == d: " + (c == d));             // false (outside cache)
        System.out.println("a.equals(b): " + a.equals(b));     // true

        System.out.println("\nExplanation:");
        System.out.println("Integer values between -128 and 127 are cached by JVM so 'a==b' is true."
                + " Larger values like 200 are not cached by default, so new objects are created and 'c==d' is false."
                + " .equals() compares numeric value, so it returns true.");
    }
}

