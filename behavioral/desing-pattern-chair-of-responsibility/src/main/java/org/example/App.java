package org.example;

import org.example.interfaces.ApprovalProcess;
import org.example.models.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApprovalProcess reviewerChain = createReviewerChain();

        Book shortBook = new Book("Libro Corto", 150);
        Book mediumBook = new Book("Libro Mediano", 400);
        Book longBook = new Book("Libro Largo", 800);
        Book veryLongBook = new Book("Libro Muy Largo", 1200);

        // Proceso de aprobación para cada libro
        reviewerChain.approve(shortBook);
        System.out.println("------------------------");
        reviewerChain.approve(mediumBook);
        System.out.println("------------------------");
        reviewerChain.approve(longBook);
        System.out.println("------------------------");
        reviewerChain.approve(veryLongBook);
    }

    private static ApprovalProcess createReviewerChain() {
        AbstractReviewer lowLevelReviewer = new LowLevelReviewer();
        AbstractReviewer mediumLevelReviewer = new MediumLevelReviewer();
        AbstractReviewer highLevelReviewer = new HighLevelReviewer();

        lowLevelReviewer.setNextApprover(mediumLevelReviewer);
        mediumLevelReviewer.setNextApprover(highLevelReviewer);

        return lowLevelReviewer;
    }
}