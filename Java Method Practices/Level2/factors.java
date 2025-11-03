import java.util.Scanner;

public class factors {
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sum(int[] factors) {
        int s = 0;
        for (int f : factors) s += f;
        return s;
    }

    public static int product(int[] factors) {
        int p = 1;
        for (int f : factors) p *= f;
        return p;
    }

    public static int sumOfSquares(int[] factors) {
        int s = 0;
        for (int f : factors) s += Math.pow(f, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}
