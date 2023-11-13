package org.example.service;


import org.example.interfaces.PrintStrategy;
import org.example.models.Book;

public class LibraryServiceCheck {

    public void checkoutBook(Book book, PrintStrategy printStrategy) {
        System.out.println("Libro retirado: " + book.getTitle());
        book.print(printStrategy);
    }
}
