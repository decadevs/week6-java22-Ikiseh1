package service.impl;

import models.Book;
import models.User;
import service.LibraryService;

import java.util.*;

public class LibraryServiceImpl implements LibraryService {
    PriorityQueue<User> userOnPriorityQueue;
    Queue<User> userOnQueue2;

    public LibraryServiceImpl() {
        this.userOnPriorityQueue = new PriorityQueue<>(new RoleComparator());
    }

    public LibraryServiceImpl(int impl2) {
        this.userOnQueue2 = new LinkedList<User>();
    }

    @Override
    public String addUserToPriorityQueue(User user) {
        userOnPriorityQueue.add(user);
        return user.getName();
    }

    @Override
    public String addUserToQueue(User user) {
        userOnQueue2.add(user);
        return user.getName();
    }

    @Override
    public Book checkBook(String nameOfBook, List<Book> books) {
        Optional<Book> bookOptional = books.stream()
                .filter(b -> nameOfBook.equals(b.getName()) && b.getNumberOfCopies() != 0)
                .findFirst();

        bookOptional.ifPresent(b -> b.setNumberOfCopies(b.getNumberOfCopies() - 1));

        bookOptional.ifPresentOrElse(
                b -> {},
                () -> System.out.println(nameOfBook + " is not available at the moment, try again later.")
        );
        return bookOptional.orElse(null);
    }

    @Override
    public String collectBookOnPriority(String nameOfBook, List<Book> books) {
        return userOnPriorityQueue.stream()
                .map(p -> {
                    if (checkBook(nameOfBook, books) != null) {
                        System.out.println(p.getName() + " has borrowed " + nameOfBook);
                        return nameOfBook;
                    } else {
                        System.out.println(p.getName() + " we are sorry, " + nameOfBook + " is not available!");
                        return "";
                    }
                })
                .filter(result -> !result.isEmpty())
                .findFirst()
                .orElse(" ");
    }
    ////Filters out empty strings from the stream.
////Finds the first non-empty string.
////If found, it returns that string.
////If not found, it returns a single space " " as a default value.
//
    @Override
    public String collectBookOnFIFO(String nameOfBook, List<Book> books) {
        return userOnQueue2.stream()
                .map(p -> {
                    if (checkBook(nameOfBook, books) != null) {
                        System.out.println(p.getName() + " has borrowed " + nameOfBook);
                        return nameOfBook;
                    } else {
                        System.out.println(p.getName() + " we are sorry, " + nameOfBook + " is not available!");
                        return "";
                    }
                })
                .filter(result -> !result.isEmpty())
                .findFirst()
                .orElse(" ");
    }

}


//    @Override
//    public Book checkBook(String nameOfBook, List<Book> books) {
//
//        Book book = null;
//        for (Book b : books) {
//            if (nameOfBook.equals(b.getName()) && b.getNumberOfCopies() != 0) {
//                b.setNumberOfCopies(b.getNumberOfCopies() - 1);
//                book = b;
//            } else if (!books.contains(b)) {
//                System.out.println(nameOfBook + "is not available at the moment, try again later.");
//            }
//        }
//        return book;
//    }


//    @Override
//    public String collectBookOnFIFO(String nameOfBook, List<Book> books) {
//        String result = " ";
//        for (User p : userOnQueue2) {
//            if (checkBook(nameOfBook, books) != null) {
//                System.out.println(p.getName() + " has borrowed " + nameOfBook);
//                result = nameOfBook;
//            } else {
//                System.out.println(p.getName() + " we are sorry, " + nameOfBook + " is not available");
//            }
//        }
//        return result;
//    }
//
//    @Override
//    public String collectBookOnPriority(String nameOfBook, List<Book> books) {

//        String result = " ";
//
//        for (User p : userOnPriorityQueue) {
//            if (checkBook(nameOfBook, books) != null) {
//                System.out.println(p.getName() + " has borrowed " + nameOfBook);
//                result = nameOfBook;
//            } else {
//                System.out.println(p.getName() + " we are sorry, " + nameOfBook + " is not available!");
//            }
//        }
//        return result;
//  }



