package org.example.models;

import org.example.interfaces.Book;

public class HighlightDecorator extends BookDecorator {
    public HighlightDecorator(Book decoratedBook) {
        super(decoratedBook);
    }

    @Override
    public String getInfo() {
        return "**" + super.getInfo() + "**";
    }
}