import java.util.Random;

class NegativeAmountException extends Exception { public NegativeAmountException(String msg){super(msg);} }
class NetworkFailureException extends Exception { public NetworkFailureException(String msg){super(msg);} }

class Transaction {
    public void doTransaction(int amount, int balance) throws Exception {
        Random r = new Random();
        int val = r.nextInt(3);

        if (amount < 0) throw new NegativeAmountException("Amount cannot be negative!");
        if (amount > balance) throw new InsufficientFundsException("Insufficient balance!");
        if (val == 1) throw new NetworkFailureException("Network Failure!");

        System.out.println("Transaction Successful!");
    }

    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.doTransaction(5000, 4000);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
