class SeatUnavailableException extends Exception { public SeatUnavailableException(String msg){super(msg);} }

class FlightBooking {
    void checkSeatAvailability(boolean available) throws SeatUnavailableException {
        if (!available) throw new SeatUnavailableException("Seat Unavailable!");
    }

    void processPayment(boolean success) throws PaymentFailedException {
        if (!success) throw new PaymentFailedException("Payment Failed!");
    }

    void bookTicket() throws Exception {
        checkSeatAvailability(false);
        processPayment(true);
    }

    public static void main(String[] args) {
        FlightBooking f = new FlightBooking();
        try {
            f.bookTicket();
        } catch (SeatUnavailableException | PaymentFailedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
