package Wrapper;

// SafeParseInt.java
public class SafeParseInt {
    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return -1;
        }
    }

    public static void main(String[] args) {
        String[] tests = {"123", "abc", "45.6", "0"};
        for (String s : tests) {
            System.out.printf("safeParseInt(\"%s\") = %d%n", s, safeParseInt(s));
        }
    }
}
