package models;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static List<Book> getBookShelf(){
        List<Book> bookShelf = new ArrayList<>();

            bookShelf.add(new Book(11, "FUNDAMENTALS OF JAVA", "Vera", 3));
            bookShelf.add(new Book(12, "FUNDAMENTALS OF CSS", "Prosper", 2));
            bookShelf.add(new Book(13, "FUNDAMENTALS OF PYTHON", "Sabinus", 4));
            bookShelf.add(new Book(14, "FUNDAMENTALS OF NODE", "Trinity", 6));
            bookShelf.add(new Book(15, "FUNDAMENTALS OF ALGORITHM", "Oseji", 1));

        return bookShelf;
    }
}
