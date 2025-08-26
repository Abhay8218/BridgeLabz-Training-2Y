//Q12

import java.util.Scanner;

public class AREATRI {
    public static void main(String[] args) {
        double base, height, areaInInches, areaInCm;
        Scanner input = new Scanner(System.in);
        base = input.nextDouble();
        height = input.nextDouble();
        areaInInches = 0.5 * base * height;
        areaInCm = areaInInches * 6.4516; 

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");
        input.close();
    }
}