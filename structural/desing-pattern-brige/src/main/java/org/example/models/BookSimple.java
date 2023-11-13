package org.example.models;

import org.example.interfaces.PrintI;

public class BookSimple extends Book{
    public BookSimple(String title, String description, PrintI print) {
        super(title, description, print);
    }

    @Override
    public void print() {
        print.printBook(title,description);
    }
}
