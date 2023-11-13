package org.example.models;

import org.example.interfaces.PrintI;

abstract class Book {
    protected PrintI print;
    protected String title;
    protected String description;

    public Book(String title, String description, PrintI print) {
        this.title = title;
        this.description = description;
        this.print = print;
    }

    public abstract void print();
}



