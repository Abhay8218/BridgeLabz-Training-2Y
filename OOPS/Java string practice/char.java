import java.util.*;

class char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];

        for (char ch : str.toCharArray()) freq[ch]++;

        int max = 0;
        char result = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) i;
            }
        }
        System.out.println("Most Frequent Character: " + result);
    }
}
