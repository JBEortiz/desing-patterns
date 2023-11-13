package org.example.services;

import org.example.interfaces.PrintI;

public class PrintDetailed implements PrintI {
    @Override
    public void printBook(String title, String description) {
        System.out.println("impresion detallada del libro: "+title+ " descripcion: "+ description);
    }
}
