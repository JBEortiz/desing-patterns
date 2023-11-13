package org.example.models;

public class MediumLevelReviewer extends AbstractReviewer {
    @Override
    protected boolean canApprove(Book book) {
        return book.getPageCount() <= 500;
    }
}
