package org.example;

import org.example.interfaces.Book;
import org.example.models.BasicBook;
import org.example.models.HighlightDecorator;
import org.example.models.UnderlineDecorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Book basicBook = new BasicBook("Arquitectura Limpia", "Robert c. Martin");

        Book highlightedBook = new HighlightDecorator(basicBook);
        Book underlinedBook = new UnderlineDecorator(basicBook);

        System.out.println("Basic Book:");
        System.out.println(basicBook.getInfo());

        System.out.println("\nHighlighted Book:");
        System.out.println(highlightedBook.getInfo());

        System.out.println("\nUnderlined Book:");
        System.out.println(underlinedBook.getInfo());
    }
}
