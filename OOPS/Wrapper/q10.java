package Wrapper;

public class q10 // BankLimitUtil.java
public class BankLimitUtil {
    // accepts Double (wrapper) possibly NULL, and primitive double overloaded
    public static double remainingLimit(Double limitFromDb, double used) {
        double limit = (limitFromDb == null) ? 0.0 : limitFromDb.doubleValue();
        double remaining = limit - used;
        return (remaining < 0.0) ? 0.0 : remaining;
    }

    public static void main(String[] args) {
        Double dbLimit = 1000.0;
        double used = 250.5;
        System.out.println("Remaining: " + remainingLimit(dbLimit, used));
        System.out.println("Remaining when null limit: " + remainingLimit(null, used));
    }
}
{
}
