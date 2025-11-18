package Wrapper;

// WrapperUtilities.java
public class WrapperUtilities {
    public static void main(String[] args) {
        int parsedInt = Integer.parseInt("123");
        double parsedDouble = Double.parseDouble("3.14");
        boolean parsedBool = Boolean.parseBoolean("true");
        String binary = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');

        System.out.println("Integer.parseInt(\"123\") => " + parsedInt);
        System.out.println("Double.parseDouble(\"3.14\") => " + parsedDouble);
        System.out.println("Boolean.parseBoolean(\"true\") => " + parsedBool);
        System.out.println("Integer.toBinaryString(10) => " + binary);
        System.out.println("Character.isDigit('5') => " + isDigit);
        System.out.println("Character.toUpperCase('a') => " + upper);
    }
}

