package org.example.service;

import org.example.interfaces.Command;
import org.example.models.Book;

public class PrintBookCommand implements Command {
    private Book book;

    public PrintBookCommand(Book book) {
        this.book = book;
    }

    @Override
    public void execute() {
        book.print();
    }

    @Override
    public void undo() {
        System.out.println("No se puede deshacer la impresión.");
    }
}
