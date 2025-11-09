import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class mainapple {
    public static void main(String[] args) {
        // Adding a new book
        Book b = new Book("ISBN001", "Effective Java");
        System.out.println("Added: " + b);

        // Registering a new member
        Member m = new Member("M001", "Aby");
        System.out.println("Registered: " + m);

        // Issuing a book
        transaction t = new transaction(b, m);
        t.issue();             // issues and sets book unavailable
        System.out.println(b); // shows availability false

        // Return the book
        t.returnBook();
        System.out.println("After return: " + b);
    }
}
