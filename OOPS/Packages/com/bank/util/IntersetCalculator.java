package com.bank.util;

public class IntersetCalculator {

    // SI = (P × R × T) / 100
    public static double calculateSimpleInterest(double principal, double ratePercent, double timeYears) {
        return (principal * ratePercent * timeYears) / 100.0;
    }

    // CI = P × (pow((1 + R/100), T)) - P
    public static double calculateCompoundInterest(double principal, double ratePercent, double timeYears) {
        return principal * (Math.pow(1 + ratePercent/100.0, timeYears)) - principal;
    }
}
