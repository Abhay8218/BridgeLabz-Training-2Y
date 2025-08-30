import java.util.*;

public class rockpaperscissor {
    public static String computerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Paper") && comp.equals("Rock")) ||
            (user.equals("Scissors") && comp.equals("Paper")))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Rock/Paper/Scissors: ");
            String user = sc.next();
            String comp = computerChoice();
            String winner = findWinner(user, comp);
            System.out.println("Computer: " + comp + " | Winner: " + winner);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        System.out.println("\nFinal Stats:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("User Win %: " + (userWins * 100.0 / n));
        System.out.println("Computer Win %: " + (compWins * 100.0 / n));
    }
}
