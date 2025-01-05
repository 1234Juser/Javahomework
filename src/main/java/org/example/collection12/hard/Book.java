package org.example.collection12.hard;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private Boolean isForeignBook;

    public Book(String title, String author, int isbn, Boolean isForeignBook) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isForeignBook = isForeignBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Boolean getForeignBook() {
        return isForeignBook;
    }

    public void setForeignBook(Boolean foreignBook) {
        isForeignBook = foreignBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", isForeignBook=" + isForeignBook +
                '}';
    }
}


