import java.util.*;

class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter weight (kg) and height (m) for person "+(i+1));
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if(bmi[i] <= 18.4) status[i] = "Underweight";
            else if(bmi[i] <= 24.9) status[i] = "Normal";
            else if(bmi[i] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nResults:");
        for(int i=0;i<n;i++){
            System.out.println("Person "+(i+1)+": Height = "+height[i]+" m, Weight = "+weight[i]+" kg, BMI = "+bmi[i]+", Status = "+status[i]);
        }
    }
}