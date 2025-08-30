import java.util.Scanner;

public class eucleadian {

    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double)(y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        double distance = euclideanDistance(x1, y1, x2, y2);
        double[] equation = lineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean Distance = %.2f\n", distance);
        System.out.printf("Equation of Line: y = %.2fx + %.2f\n", equation[0], equation[1]);

        sc.close();
    }
}
