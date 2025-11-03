public class numberchecker {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] toDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuck(int n) {
        for (int d : toDigits(n)) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] digits = toDigits(n);
        int pow = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, pow);
        return sum == n;
    }

    public static int[] findTwoLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) { second = first; first = d; }
            else if (d > second && d != first) second = d;
        }
        return new int[]{first, second};
    }

    public static int[] findTwoSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) { second = first; first = d; }
            else if (d < second && d != first) second = d;
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = toDigits(num);

        System.out.println("Count: " + countDigits(num));
        System.out.println("Duck? " + isDuck(num));
        System.out.println("Armstrong? " + isArmstrong(num));
        int[] largest = findTwoLargest(digits);
        int[] smallest = findTwoSmallest(digits);
        System.out.println("Largest: " + largest[0] + ", Second: " + largest[1]);
        System.out.println("Smallest: " + smallest[0] + ", Second: " + smallest[1]);
    }
}
