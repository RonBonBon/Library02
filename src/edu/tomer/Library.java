package edu.tomer;

import java.util.ArrayList;

/**
 * Created by hackeru on 13/02/2017.
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private Librarian librarianInDuty;

    public Library() {
        this.librarianInDuty = new Librarian();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void addBook() {
        Book b = new Book();
        books.add(b);
    }

    public void printAllBooks() {
        for (Book b : books) {
            b.print();
        }
        /*
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            b.print();
        }
        */
    }

    public void showBooksByAuthor(String author) {
        for (Book b : books) {
            if (b.getAuthor().toLowerCase().contains(author.toLowerCase()))
                b.print();
        }
    }

    public void showBooksByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(title.toLowerCase()))
                b.print();
        }
    }

}
