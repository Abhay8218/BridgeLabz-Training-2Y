import java.util.Scanner;

public class collinear {

    static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        if (areCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Slope Method)");
        } else {
            System.out.println("Points are NOT collinear (Slope Method)");
        }

        if (areCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Area Method)");
        } else {
            System.out.println("Points are NOT collinear (Area Method)");
        }

        sc.close();
    }
}
