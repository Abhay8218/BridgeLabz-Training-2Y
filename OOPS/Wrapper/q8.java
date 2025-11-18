package Wrapper;
// CharacterCounter.java
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int letters = 0, digits = 0, specials = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
            else if (Character.isWhitespace(ch)) {
                // ignore spaces for special count (optionally)
            } else specials++;
        }

        System.out.println("Total letters: " + letters);
        System.out.println("Total digits: " + digits);
        System.out.println("Total special characters: " + specials);

        sc.close();
    }
}

