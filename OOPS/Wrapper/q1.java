package Wrapper;

// PrimitiveToWrapper.java
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int primitive = sc.nextInt();

        // convert primitive to wrapper (boxing)
        Integer wrapped = Integer.valueOf(primitive);

        System.out.println("Primitive int value: " + primitive);
        System.out.println("Wrapped Integer value: " + wrapped);

        sc.close();
    }
}
