import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) { super(msg); }
}
class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) { super(msg); }
}

class OnlineOrder {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random r = new Random();
        int val = r.nextInt(2);
        if (val == 0) throw new OutOfStockException("Product is Out of Stock!");
        else throw new PaymentFailedException("Payment Failed!");
    }

    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder();
        try {
            order.placeOrder();
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
