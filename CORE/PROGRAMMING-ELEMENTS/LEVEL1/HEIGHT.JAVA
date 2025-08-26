//Q10
import java.util.Scanner;

public class HEIGHT {
    public static void main(String[] args) {
        double heightCm, totalInches, heightFeet, remainingInches;
        Scanner input = new Scanner(System.in);
        heightCm=input.nextDouble();
        totalInches= heightCm /2.54;
        heightFeet =(int)(totalInches/ 12);
        remainingInches =totalInches %12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + (int)heightFeet + " and inches is " + (remainingInches));

    }
}