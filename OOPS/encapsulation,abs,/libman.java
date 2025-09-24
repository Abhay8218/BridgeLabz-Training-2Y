// LibraryItem.java
abstract class libman {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author){
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId(){ return itemId; }
    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }

    public void getItemDetails(){
        System.out.println("ID: "+itemId+", Title: "+title+", Author: "+author);
    }

    public abstract int getLoanDuration();
}

// Reservable.java
interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

// Book.java
class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(int id, String title, String author){
        super(id,title,author);
    }

    @Override
    public int getLoanDuration(){ return 14; }

    @Override
    public void reserveItem(String borrower){
        if(available){
            available = false;
            System.out.println("Book reserved by "+borrower);
        } else {
            System.out.println("Book not available");
        }
    }

    @Override
    public boolean checkAvailability(){ return available; }
}

// Magazine.java
class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(int id, String title, String author){
        super(id,title,author);
    }

    @Override
    public int getLoanDuration(){ return 7; }

    @Override
    public void reserveItem(String borrower){
        if(available){
            available = false;
            System.out.println("Magazine reserved by "+borrower);
        } else {
            System.out.println("Magazine not available");
        }
    }

    @Override
    public boolean checkAvailability(){ return available; }
}

// DVD.java
class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(int id, String title, String author){
        super(id,title,author);
    }

    @Override
    public int getLoanDuration(){ return 3; }

    @Override
    public void reserveItem(String borrower){
        if(available){
            available = false;
            System.out.println("DVD reserved by "+borrower);
        } else {
            System.out.println("DVD not available");
        }
    }

    @Override
    public boolean checkAvailability(){ return available; }
}

// MainLibrary.java
import java.util.*;

public class MainLibrary {
    public static void main(String[] args){
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book(1,"Java Basics","Author A"));
        items.add(new Magazine(2,"Tech Today","Author B"));
        items.add(new DVD(3,"Inception","Director C"));

        for(LibraryItem item : items){
            item.getItemDetails();
            System.out.println("Loan Duration: "+item.getLoanDuration()+" days");
            if(item instanceof Reservable){
                Reservable res = (Reservable)item;
                System.out.println("Available: "+res.checkAvailability());
                res.reserveItem("John");
            }
            System.out.println("--------------");
        }
    }
}
