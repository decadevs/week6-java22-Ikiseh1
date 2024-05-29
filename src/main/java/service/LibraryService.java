package service;

import models.Book;
import models.User;

import java.util.List;

public interface LibraryService {
    public String addUserToPriorityQueue(User user);
    public String addUserToQueue(User user);
    public String collectBookOnPriority(String nameOfBook, List<Book> books);
    public String collectBookOnFIFO(String nameOfBook, List<Book> books);
    Book checkBook(String nameOfBook, List<Book> books);

}
