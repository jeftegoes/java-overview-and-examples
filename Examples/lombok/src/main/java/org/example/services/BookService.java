package org.example.services;

import org.example.models.Book;

public interface BookService {
    Book builderBook(int id);
    Book constructBookWithArgs(int id);
    Book constructBookWithoutArgs(int id);
}
