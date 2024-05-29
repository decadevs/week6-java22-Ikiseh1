package service;

import enumm.Role;
import models.Library;
import models.User;
import service.impl.LibraryServiceImpl;

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryServiceImpl libraryService = new LibraryServiceImpl();
        LibraryServiceImpl libraryService2 = new LibraryServiceImpl(2);


        User juniorStudent = new User("Preye Donyabi", 15, Role.JUNIOR_STUDENT);
        User seniorStudent = new User("Shola Afolagboye", 20, Role.SENIOR_STUDENT);
        User teacher = new User("Mr. Segun Osiki", 45, Role.TEACHER);

        libraryService.addUserToPriorityQueue(juniorStudent);
        libraryService.addUserToPriorityQueue(seniorStudent);
        libraryService.addUserToPriorityQueue(teacher);

        libraryService2.addUserToQueue(juniorStudent);
        libraryService2.addUserToQueue(seniorStudent);
        libraryService2.addUserToQueue(teacher);

        System.out.println("IMPLEMENTATION 1 BASE ON PRIORITY");
        System.out.println("-------------------------------------");
        libraryService.collectBookOnPriority("FUNDAMENTALS OF JAVA", Library.getBookShelf());

        System.out.println(" ");
        System.out.println("IMPLEMENTATION 1 BASE ON FIFO");
        System.out.println("-------------------------------------");
        libraryService2.collectBookOnFIFO("FUNDAMENTALS OF ALGORITHM", Library.getBookShelf());

    }
}
