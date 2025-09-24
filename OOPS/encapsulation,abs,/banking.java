// BankAccount.java
abstract class banking {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber(){ return accountNumber; }
    public String getHolderName(){ return holderName; }
    public double getBalance(){ return balance; }

    public void deposit(double amount){ balance += amount; }
    public boolean withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }

    public void displayDetails(){
        System.out.println("Account No: "+accountNumber+", Holder: "+holderName+", Balance: "+balance);
    }

    public abstract double calculateInterest();
}

// Loanable.java
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// SavingsAccount.java
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double balance){
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest(){
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount){
        System.out.println("SavingsAccount: Loan Applied for "+amount);
    }

    @Override
    public boolean calculateLoanEligibility(){
        return getBalance() >= 1000;
    }
}

// CurrentAccount.java
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String name, double balance){
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest(){
        return 0; // no interest for current account
    }

    @Override
    public void applyForLoan(double amount){
        System.out.println("CurrentAccount: Loan Applied for "+amount);
    }

    @Override
    public boolean calculateLoanEligibility(){
        return getBalance() >= 5000;
    }
}

// MainBankingSystem.java
import java.util.*;

public class MainBankingSystem {
    public static void main(String[] args){
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S101","Alice",5000));
        accounts.add(new CurrentAccount("C102","Bob",10000));

        for(BankAccount acc : accounts){
            acc.displayDetails();
            System.out.println("Interest: "+acc.calculateInterest());
            if(acc instanceof Loanable){
                Loanable loanAcc = (Loanable) acc;
                System.out.println("Loan Eligibility: "+loanAcc.calculateLoanEligibility());
                loanAcc.applyForLoan(2000);
            }
            System.out.println("--------------");
        }
    }
}
