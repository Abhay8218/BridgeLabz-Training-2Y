import java.util.*;

class numberguessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100.");
        while (!feedback.equals("correct")) {
            int guess = rand.nextInt(high - low + 1) + low;
            System.out.println("Computer guesses: " + guess);
            System.out.print("Is it high, low, or correct? ");
            feedback = sc.next().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
        System.out.println("Computer guessed it!");
    }
}
