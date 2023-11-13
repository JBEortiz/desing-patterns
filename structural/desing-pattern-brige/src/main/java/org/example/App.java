package org.example;

import org.example.interfaces.PrintI;
import org.example.models.BookDetailed;
import org.example.models.BookSimple;
import org.example.services.PrintDetailed;
import org.example.services.PrintSimple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        PrintSimple printSimple= new PrintSimple();
        PrintDetailed printDetailed= new PrintDetailed();

        BookSimple bookSimple= new BookSimple("Arquitectura Limpia","Libro de arquitectura limpia de Robert C. Martin", printSimple);
        BookDetailed bookDetailed= new BookDetailed("Arquitectura Limpia","Libro de arquitectura limpia de Robert C. Martin", printDetailed);

        bookSimple.print();
        bookDetailed.print();
    }
}
