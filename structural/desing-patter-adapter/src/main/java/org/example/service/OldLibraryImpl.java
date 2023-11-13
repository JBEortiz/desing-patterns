package org.example.service;

import org.example.Models.Book;
import org.example.interfaces.OldLibrary;

public class OldLibraryImpl implements OldLibrary {
    @Override
    public String lendBook(Book book) {
        return "Has recogido el libro:"+ book;
    }

    @Override
    public String returnBook(Book book){
        return "Has devuelto el libro"+ book;
    }
}
