package org.example.services;

import lombok.extern.java.Log;
import org.example.models.Book;

import java.time.LocalDateTime;

@Log
public class BookServiceImpl implements BookService {

    @Override
    public Book builderBook(int id) {
        log.warning("Creating book...");

        Book book = Book
                .builder()
                .id(id)
                .name("Bible")
                .author("God")
                .isbn("0061042579")
                .price(22.23f)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        log.warning("Book created!");

        return book;
    }

    @Override
    public Book constructBookWithArgs(int id) {
        return new Book(id, "Bible", "God", "0061042579", 22.23f, LocalDateTime.now(), LocalDateTime.now());
    }

    @Override
    public Book constructBookWithoutArgs(int id) {

        Book book = new Book();

        book.setId(id);
        book.setName("Bible");
        book.setAuthor("God");
        book.setIsbn("0061042579");
        book.setPrice(22.23f);
        book.setCreatedDate(LocalDateTime.now());
        book.setUpdateDate(LocalDateTime.now());

        return book;
    }
}
