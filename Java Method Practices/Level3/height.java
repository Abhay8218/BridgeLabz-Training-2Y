import java.util.Arrays;

public class height {

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(150 + Math.random() * 101); // 150–250
        }

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean: " + findMean(heights));
    }
}
