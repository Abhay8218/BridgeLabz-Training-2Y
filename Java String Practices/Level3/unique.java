import java.util.Scanner;

class unique {
    
    static int getLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {}
        return length;
    }

    static char[] findUniqueCharacters(String text) {
        int n = getLength(text);
        char[] result = new char[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (c == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result[count++] = c;
            }
        }
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) unique[i] = result[i];
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] unique = findUniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}
