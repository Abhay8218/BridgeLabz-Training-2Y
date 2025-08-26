//q14
import java.util.Scanner;

public class DISTANCE {
    public static void main(String[] args) {
        double distanceInFeet, distanceInYards, distanceInMiles;
        Scanner input = new Scanner(System.in);
        distanceInFeet = input.nextDouble();
        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInYards / 1760;
        System.out.println("Your distance in feet is " + distanceInFeet + " which is "+ distanceInYards + " yards and " + distanceInMiles + " miles");
    }
}