import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("The number of digits: 1");
            sc.close();
            return;
        }

        int count = 0;

        while (number != 0) {
            number = number / 10; 
            count++;              
        }

        System.out.println("The number of digits: " + count);

        sc.close();
    }
}
