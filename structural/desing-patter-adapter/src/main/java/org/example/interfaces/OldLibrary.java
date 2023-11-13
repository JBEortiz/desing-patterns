package org.example.interfaces;

import org.example.Models.Book;

public interface OldLibrary {
   String lendBook(Book book);
   String returnBook(Book book);
}
