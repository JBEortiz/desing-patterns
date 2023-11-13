package org.example;

import org.example.interfaces.Command;
import org.example.models.Book;
import org.example.service.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Crear un libro
        Book book = new Book();

        // Crear comandos
        Command addPageCommand = new AddPageCommand(book);
        Command removePageCommand = new RemovePageCommand(book);
        Command printBookCommand = new PrintBookCommand(book);
        Command addBuyCommand = new AddBuyCommand(book);
        Command removeBuyCommand = new RemoveBuyCommand(book);

        // Ejecutar comandos
        book.executeCommand(addPageCommand);
        book.executeCommand(addPageCommand);
        book.executeCommand(addPageCommand);

        book.undoCommand(addPageCommand);

        book.executeCommand(printBookCommand);

        book.executeCommand(removePageCommand);

        book.executeCommand(addBuyCommand);
        book.executeCommand(addBuyCommand);
        book.executeCommand(removeBuyCommand);


    }
}
