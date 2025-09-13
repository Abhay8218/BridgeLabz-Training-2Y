//Q13
import java.util.Scanner;

public class PERIMETER {
    public static void main(String[] args) {
        double perimeter, side;
        Scanner input = new Scanner(System.in);
        perimeter = input.nextDouble();
        side = perimeter/4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

    }
}