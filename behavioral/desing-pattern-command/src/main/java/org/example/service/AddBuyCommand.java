package org.example.service;

import org.example.interfaces.Command;
import org.example.models.Book;

public class AddBuyCommand implements Command {
    private Book book;

    public AddBuyCommand(Book book) {
        this.book = book;
    }
    @Override
    public void execute() {
        book.addBuy();
    }

    @Override
    public void undo() {
        book.returnBuy();
    }
}
