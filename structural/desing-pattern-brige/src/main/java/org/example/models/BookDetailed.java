package org.example.models;

import org.example.interfaces.PrintI;

public class BookDetailed extends Book{
    public BookDetailed(String title, String description, PrintI print) {
        super(title, description, print);
    }

    @Override
    public void print() {
        print.printBook(title,description);
    }
}
