package library.books;

public class Book {
    private String isbn;
    private String title;
    private boolean available = true;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return "Book[" + isbn + ", " + title + ", available=" + available + "]";
    }
}
