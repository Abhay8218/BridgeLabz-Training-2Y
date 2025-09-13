import java.util.Scanner;

public class while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number > 1) {
            int greatestFactor = 1;
            int counter = number - 1;

            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }

            System.out.println("The greatest factor of " + number + " (other than itself) is: " + greatestFactor);
        } else {
            System.out.println("The number " + number + " has no proper factors.");
        }

        sc.close();
    }
}
