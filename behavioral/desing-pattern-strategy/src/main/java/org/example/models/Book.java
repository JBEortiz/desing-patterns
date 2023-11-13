package org.example.models;

import org.example.interfaces.PrintStrategy;

public class Book {
        private String title;
        private String content;

        public Book(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public String getTitle() {
            return title;
        }

        public void print(PrintStrategy printStrategy) {
            printStrategy.print(title, content);
        }
}
