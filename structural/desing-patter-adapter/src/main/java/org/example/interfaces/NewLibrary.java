package org.example.interfaces;

import org.example.Models.Book;

public interface NewLibrary {
    String subscribeBook(Book book);
    String unsubscribe(Book book);
}
