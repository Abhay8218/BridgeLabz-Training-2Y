import com.bank.util.InterestCalculator;
import static java.lang.Math.*; // as required by the task (pow available)

public class MainApp {
    public static void main(String[] args) {
        double P = 10000;
        double R = 5;
        double T = 2;

        double si = InterestCalculator.calculateSimpleInterest(P,R,T);
        double ci = P * (pow(1 + R/100.0, T)) - P; // using static import pow()

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
