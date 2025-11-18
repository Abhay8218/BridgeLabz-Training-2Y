package Wrapper;

public class q9 // EmployeeDataProcessing.java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {25, 30, 22, 45, 29};
        List<Integer> ageList = new ArrayList<>();
        for (int a : ages) ageList.add(a); // auto-boxing

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Ages: " + ageList);
        System.out.println("Youngest: " + youngest);
        System.out.println("Oldest: " + oldest);
    }
}
{
}
