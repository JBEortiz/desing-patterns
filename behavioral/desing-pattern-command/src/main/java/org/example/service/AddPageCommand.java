package org.example.service;

import org.example.interfaces.Command;
import org.example.models.Book;

public class AddPageCommand implements Command {
    private Book book;

    public AddPageCommand(Book book) {
        this.book = book;
    }
    @Override
    public void execute() {
        book.addPage();
    }

    @Override
    public void undo() {
        book.removeLastPage();
    }
}
