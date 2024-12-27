package org.example;


import org.example.models.Book;
import org.example.services.BookService;
import org.example.services.BookServiceImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();

        Book bookBuilt = bookService.builderBook(1);
        System.out.println(bookBuilt.toString());

        Book bookWithArgs = bookService.constructBookWithArgs(2);
        System.out.println(bookWithArgs.toString());

        Book bookWithoutArgs = bookService.constructBookWithoutArgs(3);
        System.out.println(bookWithoutArgs.toString());
    }
}
