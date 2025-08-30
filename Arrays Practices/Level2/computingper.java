import java.util.*;

class computingper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter marks (Physics, Chemistry, Maths) for student "+(i+1));
            int p = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            if(p<0 || c<0 || m<0){
                System.out.println("Invalid marks. Enter again.");
                i--;
                continue;
            }

            marks[i][0]=p;
            marks[i][1]=c;
            marks[i][2]=m;

            int total = p+c+m;
            percentage[i] = total/3.0;

            if(percentage[i] >= 80) grade[i] = "A";
            else if(percentage[i] >= 70) grade[i] = "B";
            else if(percentage[i] >= 60) grade[i] = "C";
            else if(percentage[i] >= 50) grade[i] = "D";
            else if(percentage[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }

        System.out.println("\nResults:");
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1)+": Physics = "+marks[i][0]+", Chemistry = "+marks[i][1]+", Maths = "+marks[i][2]+", Percentage = "+percentage[i]+"%, Grade = "+grade[i]);
        }
    }
}
