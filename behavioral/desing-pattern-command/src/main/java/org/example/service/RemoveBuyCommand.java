package org.example.service;

import org.example.interfaces.Command;
import org.example.models.Book;

public class RemoveBuyCommand  implements Command {
    private Book book;

    public RemoveBuyCommand(Book book) {
        this.book = book;
    }

    @Override
    public void execute() {
        book.returnBuy();
    }

    @Override
    public void undo() {
        book.addBuy();

    }
}
