import java.util.Scanner;

public class trimspaces {
    public static String trimSpaces(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        String trimmed = trimSpaces(text);
        System.out.println("Custom Trim: [" + trimmed + "]");
        System.out.println("Built-in Trim: [" + text.trim() + "]");
    }
}
