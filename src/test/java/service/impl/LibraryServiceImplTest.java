package service.impl;

import enumm.Role;
import models.Library;
import models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {
    LibraryServiceImpl libraryService = new LibraryServiceImpl();

    @Test
    void addUserToPriorityQueue() {

        assertEquals("Mr. Segun Osiki",libraryService.addUserToPriorityQueue(new User("Mr. Segun Osiki",45, Role.TEACHER)));
    }

    @Test
    void checkBook() {
        assertNotNull(libraryService.checkBook("FUNDAMENTALS OF JAVA ", Library.getBookShelf()));
    }
}