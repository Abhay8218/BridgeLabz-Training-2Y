package Generics;

public class Main {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 50.0, BookCategory.EDUCATION);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20.0, ClothingCategory.MEN);

        System.out.println(book);
        System.out.println(shirt);

        Utils.applyDiscount(book, 10);  // apply 10% on book
        Utils.applyDiscount(shirt, 25); // apply 25% on clothing
    }
}

