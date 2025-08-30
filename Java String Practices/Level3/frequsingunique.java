import java.util.Scanner;

class frequsingunique {
    
    static char[] findUniqueCharacters(String text) {
        int n = text.length();
        char[] result = new char[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (c == text.charAt(j)) { isUnique = false; break; }
            }
            if (isUnique) result[count++] = c;
        }
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) unique[i] = result[i];
        return unique;
    }

    static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;

        char[] unique = findUniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] freq = findFrequency(text);
        System.out.println("Character | Frequency");
        for (String[] row : freq) System.out.println(row[0] + " | " + row[1]);
    }
}
