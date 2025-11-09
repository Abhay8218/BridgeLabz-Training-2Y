import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class MainApp {
    public static void main(String[] args) {
        SalesReport sr = new SalesReport();
        EmployeeReport er = new EmployeeReport();

        sr.printRegionSales();
        System.out.println();
        er.printEmployeePerformance();

        System.out.println("\nCombined Company Report generated.");
    }
}
