package org.example.models;

import org.example.interfaces.Command;

public class Book {
    private int totalPages;
    private int numberBuy;

    public void addPage() {
        totalPages++;
        System.out.println("Página agregada. Total de páginas: " + totalPages);
    }

    public void removeLastPage() {
        if (totalPages > 0) {
            totalPages--;
            System.out.println("Última página eliminada. Total de páginas: " + totalPages);
        } else {
            System.out.println("No hay páginas para eliminar.");
        }
    }

    public void print() {
        System.out.println("Imprimiendo el libro con " + totalPages + " páginas.");
    }

    // Método para ejecutar comandos
    public void executeCommand(Command command) {
        command.execute();
    }

    // Método para deshacer comandos
    public void undoCommand(Command command) {
        command.undo();
    }

    public void addBuy() {
        numberBuy++;
        System.out.println("Compra hecha, Numero de descargas: " + numberBuy);
    }

    public void returnBuy() {
        if (numberBuy > 0) {
            numberBuy--;
            System.out.println("Compra cancelada. Numero de compras: " + numberBuy);
        } else {
            System.out.println("No existe ninguna compra");
        }
    }
}
