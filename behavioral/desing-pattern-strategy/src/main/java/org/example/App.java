package org.example;

import org.example.interfaces.PrintStrategy;
import org.example.models.Book;
import org.example.service.LibraryServiceCheck;
import org.example.service.DetailedPrintStrategy;
import org.example.service.SimplePrintStrategy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Book simpleBook = new Book("Libro de Arquitectura limpia Simple", "Contenido simple");
        Book detailedBook = new Book("Libro de Arquitectura limpia  Detallado", "Contenido detallado");

        PrintStrategy simplePrintStrategy = new SimplePrintStrategy();
        PrintStrategy detailedPrintStrategy = new DetailedPrintStrategy();

        LibraryServiceCheck library = new LibraryServiceCheck();
        // libro simple , impresion simple
        library.checkoutBook(simpleBook, simplePrintStrategy);
        // libro simple , impresion detallada
        library.checkoutBook(simpleBook, detailedPrintStrategy);
        // libro detallado , impresion detallada
        library.checkoutBook(detailedBook, detailedPrintStrategy);
    }

}
