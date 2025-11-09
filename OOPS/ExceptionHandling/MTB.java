import java.util.*;

class InvalidSeatException extends Exception { public InvalidSeatException(String msg){super(msg);} }
class SeatAlreadyBookedException extends Exception { public SeatAlreadyBookedException(String msg){super(msg);} }

class MovieTicketBooking {
    Set<Integer> bookedSeats = new HashSet<>();

    public void bookSeat(int seat) throws Exception {
        if (seat < 1 || seat > 50) throw new InvalidSeatException("Invalid seat number!");
        if (bookedSeats.contains(seat)) throw new SeatAlreadyBookedException("Seat already booked!");
        bookedSeats.add(seat);
        System.out.println("Seat " + seat + " booked!");
    }

    public static void main(String[] args) {
        MovieTicketBooking m = new MovieTicketBooking();
        try {
            m.bookSeat(55);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
