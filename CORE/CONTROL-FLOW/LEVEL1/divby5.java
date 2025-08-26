import java.util.Scanner;

public class divby5 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isDivisible = (num % 5 == 0);
        System.out.print("Is the number " + num + " divisible by 5? " + isDivisible);
        sc.close();
        

    }
}
