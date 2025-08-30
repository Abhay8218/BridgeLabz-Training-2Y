import java.util.Random;

public class grade {

    // Method a:generate random 2-digit scores (10-99)
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3]; 
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(90) + 10; 
            }
        }
        return scores;
    }

    // Method b:calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; 
        // [0]=total, [1]=average, [2]=percentage

        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100; // out of 300

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method c:assign grade
    public static char[] assignGrades(double[][] results) {
        int students = results.length;
        char[] grades = new char[students];

        for (int i = 0; i < students; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) grades[i] = 'A';
            else if (percentage >= 70) grades[i] = 'B';
            else if (percentage >= 60) grades[i] = 'C';
            else if (percentage >= 50) grades[i] = 'D';
            else if (percentage >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    // Method d:display scorecard
    public static void displayScorecard(int[][] scores, double[][] results, char[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-12s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-12.2f %-12.2f %-10c\n",
                    (i + 1),
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2],
                    grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int students = 5; // You can change number of students
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        char[] grades = assignGrades(results);
        displayScorecard(scores, results, grades);
    }
}
