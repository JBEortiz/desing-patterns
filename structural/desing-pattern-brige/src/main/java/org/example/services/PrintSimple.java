package org.example.services;

import org.example.interfaces.PrintI;

public class PrintSimple implements PrintI {
    @Override
    public void printBook(String title, String description) {
        System.out.println("impresion simple del libro: "+title);
    }
}
