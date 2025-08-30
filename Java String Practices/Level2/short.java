import java.util.*;

public class short {
    public static String[] customSplit(String text) {
        return text.trim().split("\\s+");
    }

    public static void findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (w.length() < shortest.length()) shortest = w;
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("Shortest Word: " + shortest);
        System.out.println("Longest Word: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        findShortestLongest(words);
    }
}
