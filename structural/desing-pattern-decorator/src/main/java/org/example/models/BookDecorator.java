package org.example.models;

import org.example.interfaces.Book;

abstract class BookDecorator implements Book {
    protected Book decoratedBook;

    public BookDecorator(Book decoratedBook) {
        this.decoratedBook = decoratedBook;
    }

    @Override
    public String getInfo() {
        return decoratedBook.getInfo();
    }

}
