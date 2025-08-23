// WELCOME TO BRIDGELABZ
public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Welcome to Bridgelabz!");
    }
}


// ADD TWO NUMBERS

import java.util.Scanner;

public class HelloWorld {
    public static void main(String years[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("The submission of first number " + num1 + " and the second number " + num2 + " is " + (num1 + num2));
        sc.close();
    }
}

// CELSIUS TO FAHRANHEIT

import java.util.Scanner;
public class HelloWorld {
    public static void main(String abhay[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        int celsius = sc.nextInt();

        int answer = (celsius * 9/5) + 32;
        System.out.print("The temperature in Fahranheit is : " + answer);
    }
}

// Area of circle
import java.util.Scanner;
public class HelloWorld {
    public static void main(String abhay[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the radius of circle : ");
        double radius = sc.nextInt();

        double answer = 3.14 * (radius * radius) ;

        System.out.print("The area of circle is : " + answer);
        sc.close();
    }
}


// Volume to cylinder
import java.util.Scanner;

public class HelloWorld {
    public static void main(String abhay[]){

    Scanner sc = new Scanner (System.in); 
    System.out.print("Enter the radius: ");
    double radius = sc.nextDouble();

    System.out.print("Enter the height: ");
    double height = sc.nextDouble();

    double answer = 3.14 * radius *radius  * height;

    System.out.print("The volume of cylinder is " + answer);
    }
}
