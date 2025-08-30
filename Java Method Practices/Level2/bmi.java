import java.util.*;

class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];  
        String[] weightStatus = new String[n];

        for(int i=0;i<n;i++){
            double w, h;
            while(true){
                System.out.println("Enter weight (kg) and height (m) for person "+(i+1));
                w = sc.nextDouble();
                h = sc.nextDouble();
                if(w>0 && h>0) break;
                System.out.println("Invalid values. Enter positive numbers.");
            }
            personData[i][0] = w;  
            personData[i][1] = h;  
            personData[i][2] = w / (h*h);  

            double bmi = personData[i][2];
            if(bmi <= 18.4) weightStatus[i] = "Underweight";
            else if(bmi <= 24.9) weightStatus[i] = "Normal";
            else if(bmi <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nResults:");
        for(int i=0;i<n;i++){
            System.out.println("Person "+(i+1)+": Weight = "+personData[i][0]+" kg, Height = "+personData[i][1]+" m, BMI = "+personData[i][2]+", Status = "+weightStatus[i]);
        }
    }
}
