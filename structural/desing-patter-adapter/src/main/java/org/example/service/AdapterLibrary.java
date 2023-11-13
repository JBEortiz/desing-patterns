package org.example.service;

import org.example.Models.Book;
import org.example.interfaces.NewLibrary;
import org.example.interfaces.OldLibrary;

public class AdapterLibrary implements NewLibrary {
    private OldLibrary oldLibrary;

    public AdapterLibrary(OldLibrary oldLibrary) {
        this.oldLibrary= oldLibrary;

    }

    @Override
    public String subscribeBook(Book book) {
        return "te has suscrito para poder leer este libro: "+book;
    }

    @Override
    public String unsubscribe(Book book) {
        return  "te has dessuscrito asique ya no podras leer este libro: "+book;
    }
}
