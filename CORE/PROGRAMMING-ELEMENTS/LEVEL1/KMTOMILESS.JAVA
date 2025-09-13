import java.util.Scanner;

public class KMTOMILESS {
    public static void main(String[] args) {
        double km, miles;
        Scanner input = new Scanner(System.in);
        km =input.nextDouble();
        miles =km/1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}