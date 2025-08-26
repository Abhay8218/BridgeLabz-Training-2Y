//Q15
import java.util.Scanner;

public class PURCHASEPRISE {
    public static void main(String[] args) {
        double unitPrice, totalPrice;
        int quantity;
        Scanner input = new Scanner(System.in);
        unitPrice = input.nextDouble();
        quantity = input.nextInt();
        totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}