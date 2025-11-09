class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class ATM {
    private int balance = 10000;

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed: Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount + " | Remaining Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(15000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
