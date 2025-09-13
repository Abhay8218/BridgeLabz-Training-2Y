import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.next();

        if (input.matches("\\d+")) { 
            int n = Integer.parseInt(input);

            if (n >= 1) {
                int sum = n * (n + 1) / 2;
                System.out.println("The sum of " + n + " natural numbers is " + sum);
            } else {
                System.out.println("The number " + n + " is not a natural number");
            }
        } else {
            System.out.println("The number " + input + " is not a natural number");
        }

        sc.close();
    }
}
