import java.util.Scanner;

public class number {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();

            if (isPositive(nums[i])) {
                System.out.print(nums[i] + " is Positive and ");
                if (isEven(nums[i]))
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else {
                System.out.println(nums[i] + " is Negative");
            }
        }

        int result = compare(nums[0], nums[nums.length - 1]);
        if (result == 0) System.out.println("First and Last are Equal");
        else if (result > 0) System.out.println("First is Greater than Last");
        else System.out.println("First is Less than Last");
    }
}
