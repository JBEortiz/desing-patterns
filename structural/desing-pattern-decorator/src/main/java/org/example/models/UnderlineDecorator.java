package org.example.models;

import org.example.interfaces.Book;

public class UnderlineDecorator extends BookDecorator {
    public UnderlineDecorator(Book decoratedBook) {
        super(decoratedBook);
    }

    @Override
    public String getInfo() {
        return "__" + super.getInfo() + "__";
    }
}
