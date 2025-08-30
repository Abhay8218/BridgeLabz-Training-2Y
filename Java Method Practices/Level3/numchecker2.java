import java.util.Arrays;

public class numchecker2 {

    public static int[] toDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int n) {
        int[] digits = toDigits(n);
        int sum = sumDigits(digits);
        return n % sum == 0;
    }

    public static int[][] frequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int num = 1729;
        int[] digits = toDigits(num);
        System.out.println("Sum: " + sumDigits(digits));
        System.out.println("Squares sum: " + sumSquares(digits));
        System.out.println("Harshad? " + isHarshad(num));
        int[][] freq = frequency(digits);
        System.out.println("Digit frequencies: " + Arrays.deepToString(freq));
    }
}
