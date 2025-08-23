//QUES1
public class Calculateprofit{
    public static void main (String[] harry){
        int birthYear = 2000;
        int currYear = 2024;
        System.out.print("Harry's age in 2024 is: " + (  currYear - birthYear)); 
    }
}

//QUES2.
public class Calculateprofit{
    public static void main(String[] args){
        int marksMath = 94;
        int marksPhysics = 95;
        int marksChemistry = 96;
        System.out.print(" Sam’s average mark in PCM is : " + (marksMath + marksPhysics + marksChemistry)/3);
    }
}

//QUES.3
public class Calculateprofit{
    public static void main(String[] args){
        double km = 10.8;
        double kmToMiles =1.6;
        System.out.print("The distance " + km + " km in miles is : " + ( km * kmToMiles )); 
    }
}

//QUES4.
public class Calculateprofit{
    public static void main(String[] args){
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice ;
        double profitPercentage = ((double) profit / costPrice )*(100);
        System.out.print("The Cost Price is INR " + costPrice + " and Selling price is INR "+ sellingPrice + "\n" + "The profit is INR "+ profit + " and the Profit percentage is " + profitPercentage );
    }
}

//QUES 5.
public class Calculateprofit{
    public static void main(String[] args) {
        int totalPens= 14;
        int students= 3;
        int pensPerStudent=totalPens/students;
        int remainingPens= totalPens%students;

        System.out.print("The Pen Per Student is " + pensPerStudent +" and the remaining pen not distributed is " + remainingPens);
    }
}



//Q6
public class Calculateprofit{
    public static void main(String[] args) {
        int fee= 125000;                 
        int discountPercent =10;         

        int discount = (fee * discountPercent)/100;   
        int discountedPrice= fee-discount;           

        System.out.println("The discount amount is INR" + discount + "and final discounted fee is INR "+discountedPrice);
    }
}

//Q7
public class Calculateprofit{
    public static void main(String[] args) {
        double radiusKm = 6378;
        double radiusMiles = radiusKm * 0.621371;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 +" and cubic miles is " + volumeMiles3);
    }
}
//Q8
import java.util.Scanner;

public class Calculateprofit {
    public static void main(String[] args) {
        double km, miles;
        Scanner input = new Scanner(System.in);
        km =input.nextDouble();
        miles =km/1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}
//Q9
import java.util.Scanner;

public class Calculateprofit {
    public static void main(String[] args) {
        double fee, discountPercent, discount, finalFee;
        Scanner input= new Scanner(System.in);
        fee =input.nextDouble();
        discountPercent = input.nextDouble();
        discount = (fee*discountPercent)/ 100;
        finalFee = fee -discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
//Q10
import java.util.Scanner;

public class Calculateprofit {
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
//Q11
import java.util.Scanner;

public class Calculateprofit {
    public static void main(String[] args) {
        double number1, number2, addition, subtraction, multiplication, division;
        Scanner input = new Scanner(System.in);
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

    }
}
//Q12
import java.util.Scanner;

public class Calculateprofit {
    public static void main(String[] args) {
        double base, height, areaInInches, areaInCm;
        Scanner input = new Scanner(System.in);
        base = input.nextDouble();
        height = input.nextDouble();
        areaInInches = 0.5 * base * height;
        areaInCm = areaInInches * 6.4516; 

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");

    }
}
//Q13
import java.util.Scanner;

public class Calculateprofit {
    public static void main(String[] args) {
        double perimeter, side;
        Scanner input = new Scanner(System.in);
        perimeter = input.nextDouble();
        side = perimeter/4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

    }
}
//q14
import java.util.Scanner;

public class Calculateprofit {
    public static void main(String[] args) {
        double distanceInFeet, distanceInYards, distanceInMiles;
        Scanner input = new Scanner(System.in);
        distanceInFeet = input.nextDouble();
        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInYards / 1760;
        System.out.println("Your distance in feet is " + distanceInFeet + " which is "+ distanceInYards + " yards and " + distanceInMiles + " miles");
    }
}
//Q15
import java.util.Scanner;

public class Calculateprofit {
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
//Q16
import java.util.Scanner;

public class Calculateprofit {
    public static void main(String[] args) {
        int numberOfStudents;
        int maxHandshakes;
        Scanner input = new Scanner(System.in);
        numberOfStudents = input.nextInt();
        maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes);

    }
}
//LEVEL2
//Q5.
import java.util.Scanner;

public class PurchasePrice {
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

//Q6
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int number1, number2, quotient, remainder;
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        quotient = number1 / number2;
        remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);

        input.close();
    }
}
//Q7
    import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        int a, b, c;
        int result1, result2, result3, result4;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        result1 = a + b * c;      
        result2 = a * b + c;      
        result3 = c + a / b;      
        result4 = a % b + c;      

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}
//Q8.
import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        double a, b, c;
        double result1, result2, result3, result4;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        result1 = a + b * c;     
        result2 = a * b + c;     
        result3 = c + a / b;     
        result4 = a % b + c;     

        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

    }
}











