package org.example.collection12.hard;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(int isbn) {
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        return null;
    }

    public void updateBook(int isbn, String title, String author) {
        Book book = getBook(isbn);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
        }
    }

    public void deleteBook(int isbn) {


        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getIsbn() == isbn) {

                books.remove(i);
                break;
            }
        }
    }

    public List<Book> getAllBooks() {
        return books;
    }
}