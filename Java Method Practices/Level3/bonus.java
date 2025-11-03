import java.util.Random;

public class EmployeeBonus {

    public static int[][] generateEmployeeData(int employees) {
        Random rand = new Random();
        int[][] data = new int[employees][2]; 

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = 1 + rand.nextInt(15); 
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        int employees = data.length;
        double[][] result = new double[employees][2]; 

        for (int i = 0; i < employees; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }
    public static void printSummary(int[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-15s %-10s %-12s %-12s\n",
                "ID", "Salary", "YearsOfService", "Bonus", "NewSalary", "BonusRate");

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double newSalary = result[i][0];
            double bonus = result[i][1];
            double bonusRate = (years > 5) ? 5 : 2;

            totalOld += salary;
            totalNew += newSalary;
            totalBonus += bonus;

            System.out.printf("%-5d %-10d %-15d %-10.2f %-12.2f %-12.0f%%\n",
                    (i + 1), salary, years, bonus, newSalary, bonusRate);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("TOTAL  %-10.2f %-15s %-10.2f %-12.2f\n",
                totalOld, "", totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int employees = 10;

        int[][] data = generateEmployeeData(employees);
        double[][] result = calculateBonus(data);
        printSummary(data, result);
    }
}
