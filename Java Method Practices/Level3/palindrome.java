import java.util.Arrays;

public class palindrome {

    public static int[] toDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean isPalindrome(int n) {
        int[] d = toDigits(n);
        return Arrays.equals(d, reverse(d));
    }

    public static boolean isDuck(int n) {
        for (int d : toDigits(n)) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int num = 1221;
        System.out.println("Palindrome? " + isPalindrome(num));
        System.out.println("Duck? " + isDuck(num));
    }
}
