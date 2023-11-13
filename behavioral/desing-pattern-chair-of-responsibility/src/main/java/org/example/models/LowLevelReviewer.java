package org.example.models;

public class LowLevelReviewer extends AbstractReviewer {
    @Override
    protected boolean canApprove(Book book) {
        return book.getPageCount() <= 200;
    }
}
