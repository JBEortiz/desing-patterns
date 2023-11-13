package org.example.models;

import org.example.interfaces.Book;

public class BasicBook implements Book {
    private String title;
    private String author;
    public BasicBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getInfo() {
        return "Title: " + title + ", Author: " + author;
    }
}
