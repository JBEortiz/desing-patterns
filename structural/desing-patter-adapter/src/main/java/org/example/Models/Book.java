package org.example.Models;

public class Book {
    private String title;
    private String Author;

    public Book(String title, String author) {
        this.title = title;
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
