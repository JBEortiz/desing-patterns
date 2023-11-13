package org.example.models;

public class HighLevelReviewer extends AbstractReviewer {
    @Override
    protected boolean canApprove(Book book) {
        return book.getPageCount() <= 1000;
    }
}
