package org.example.models;

import org.example.interfaces.ApprovalProcess;

public abstract class AbstractReviewer implements ApprovalProcess {
    private ApprovalProcess nextApprover;

    public void setNextApprover(ApprovalProcess nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void approve(Book book) {
        if (canApprove(book)) {
            System.out.println(getClass().getSimpleName() + " aprobó la publicación del libro: " + book.getTitle());
        } else if (nextApprover != null) {
            System.out.println(getClass().getSimpleName() + " no puede aprobar la publicación. Pasando al siguiente nivel.");
            nextApprover.approve(book);
        } else {
            System.out.println("Ningún revisor puede aprobar la publicación del libro: " + book.getTitle());
        }
    }

    protected abstract boolean canApprove(Book book);
}

