class AccountNotFoundException extends Exception { public AccountNotFoundException(String msg){super(msg);} }

class BankTransactionManager {
    void verifyAccount(boolean exists) throws AccountNotFoundException {
        if (!exists) throw new AccountNotFoundException("Account Not Found!");
    }

    void processTransaction(boolean enoughFunds) throws InsufficientFundsException {
        if (!enoughFunds) throw new InsufficientFundsException("Insufficient Funds!");
    }

    void executeTransaction() throws Exception {
        verifyAccount(false);
        processTransaction(true);
    }

    public static void main(String[] args) {
        BankTransactionManager b = new BankTransactionManager();
        try {
            b.executeTransaction();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
