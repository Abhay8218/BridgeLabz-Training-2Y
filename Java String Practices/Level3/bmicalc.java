import java.util.Scanner;

public class bmicalc {

    // (a) Take user input of weight & height and store in 2D array
    public static double[][] takeInput(int members) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[members][2]; // [weight, height]

        for (int i = 0; i < members; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        return data;
    }

    // (b) Compute BMI and return status
    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm -> m
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    }

    // (c) Create a 2D String array with Height, Weight, BMI, Status
    public static String[][] processData(double[][] data) {
        int members = data.length;
        String[][] result = new String[members][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < members; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiInfo = computeBMI(weight, height);

            result[i][0] = String.valueOf(height);   // Height (cm)
            result[i][1] = String.valueOf(weight);   // Weight (kg)
            result[i][2] = bmiInfo[0];               // BMI
            result[i][3] = bmiInfo[1];               // Status
        }
        return result;
    }

    // (d) Display data in tabular form
    public static void display(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

    // (e) Main function
    public static void main(String[] args) {
        int members = 10;  // team of 10 members

        double[][] data = takeInput(members);
        String[][] result = processData(data);
        display(result);
    }
}
