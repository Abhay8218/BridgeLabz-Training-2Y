import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Step 3: Loop to extract digits and calculate cube sum
        while (originalNumber != 0) {
            int digit = originalNumber % 10;   // get last digit
            sum += digit * digit * digit;      // add cube of digit to sum
            originalNumber = originalNumber / 10; // remove last digit
        }

        // Step 4: Check Armstrong condition
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
