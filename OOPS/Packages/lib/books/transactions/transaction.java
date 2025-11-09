package library.transactionxs;

import library.books.Book;
import library.members.Member;
import java.time.LocalDate;

public class transaction {
    private Book book;
    private Member member;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public transaction(Book book, Member member) {
        this.book = book; this.member = member;
        this.issueDate = LocalDate.now();
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
        book.setAvailable(true);
    }

    public void issue() {
        if(book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Issued " + book.getTitle() + " to " + member.getName());
        } else {
            System.out.println("Book not available.");
        }
    }

    @Override
    public String toString() {
        return "Transaction[book=" + book.getTitle() + ", member=" + member.getName() + ", issued=" + issueDate + ", returned=" + returnDate + "]";
    }
}
