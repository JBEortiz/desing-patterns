package org.example;

import org.example.Models.Book;
import org.example.interfaces.NewLibrary;
import org.example.interfaces.OldLibrary;
import org.example.service.AdapterLibrary;
import org.example.service.OldLibraryImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // podemos utilizar la nueva interfaz sin modificar la antigua
        OldLibrary oldLibrary= new OldLibraryImpl();
        NewLibrary adapter= new AdapterLibrary(oldLibrary);
        Book book = new Book("Arquitectura Limpia", "Robert C. Martin");
        //oldLibrary
        System.out.println( oldLibrary.lendBook(book));
        System.out.println(oldLibrary.returnBook(book));
        //adapter
        System.out.println( adapter.subscribeBook(book));
        System.out.println(adapter.unsubscribe(book));
    }
}
