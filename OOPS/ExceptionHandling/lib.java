import java.util.*;

class BookNotAvailableException extends Exception { public BookNotAvailableException(String msg){super(msg);} }
class InvalidReturnException extends Exception { public InvalidReturnException(String msg){super(msg);} }
class UserLimitExceededException extends Exception { public UserLimitExceededException(String msg){super(msg);} }

class LibraryManagement {
    List<String> books = new ArrayList<>(Arrays.asList("Java", "DBMS", "DSA"));
    List<String> borrowed = new ArrayList<>();

    public void borrowBook(String book) throws Exception {
        if (borrowed.size() >= 5) throw new UserLimitExceededException("User limit exceeded!");
        if (!books.contains(book)) throw new BookNotAvailableException("Book not available!");
        books.remove(book);
        borrowed.add(book);
        System.out.println("Book Borrowed: " + book);
    }

    public void returnBook(String book) throws Exception {
        if (!borrowed.contains(book)) throw new InvalidReturnException("This book was not borrowed!");
        borrowed.remove(book);
        books.add(book);
        System.out.println("Returned: " + book);
    }

    public static void main(String[] args) {
        LibraryManagement lib = new LibraryManagement();
        try {
            lib.borrowBook("AI");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
