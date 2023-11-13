package org.example.service;

import org.example.interfaces.PrintStrategy;

public class SimplePrintStrategy implements PrintStrategy {
    @Override
    public void print(String title, String content) {
        System.out.println("Imprimiendo libro: " + title);
    }
}
