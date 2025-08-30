import java.util.Scanner;

public class length {
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        int customLength = findLength(str);
        System.out.println("Length without length(): " + customLength);
        System.out.println("Length with length(): " + str.length());
    }
}
