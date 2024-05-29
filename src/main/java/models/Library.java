package models;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static List<Book> getBookShelf(){
        List<Book> bookShelf = new ArrayList<>();
        try {
            bookShelf.add(new Book(11, "FUNDAMENTALS OF JAVA", "Vera", 3));
            bookShelf.add(new Book(12, "FUNDAMENTALS OF CSS", "Prosper", 2));
            bookShelf.add(new Book(13, "FUNDAMENTALS OF PYTHON", "Sabinus", 4));
            bookShelf.add(new Book(14, "FUNDAMENTALS OF NODE", "Trinity", 6));
            bookShelf.add(new Book(15, "FUNDAMENTALS OF ALGORITHM", "Oseji", 1));
        } catch (Exception e) {
            System.err.println("Failed to add books to the shelf: " + e.getMessage());
            // Optionally rethrow the exception if you want to handle it further up the call stack
            throw e;
        }
        return bookShelf;
    }
}
