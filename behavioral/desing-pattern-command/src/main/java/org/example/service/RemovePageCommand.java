package org.example.service;

import org.example.interfaces.Command;
import org.example.models.Book;

public class RemovePageCommand  implements Command {
    private Book book;

    public RemovePageCommand(Book book) {
        this.book = book;
    }

    @Override
    public void execute() {
        book.removeLastPage();
    }

    @Override
    public void undo() {
        book.addPage();
    }
}
