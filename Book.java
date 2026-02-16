package com.elevatelabs.libmanagementsys;

public class Book {
    int bookId;
    String title;
    String author;
    boolean isIssued;

    public Book( int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;

    }
    public void displayBook(){
        System.out.println("Book id: " + bookId + ", Author: " + author + ", Title: " + title + ",Issued: " + isIssued);
    }
}
