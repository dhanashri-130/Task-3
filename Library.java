package com.elevatelabs.libmanagementsys;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book Added Successfully!");
    }

    void addUser() {
        System.out.print("Enter User ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        users.add(new User(id, name));
        System.out.println("User Registered Successfully!");
    }

    void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available!");
        } else {
            for (Book b : books) {
                b.displayBook();
            }
        }
    }

    void issueBook() {
        System.out.print("Enter Book ID to Issue: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.bookId == id) {
                if (!b.isIssued) {
                    b.isIssued = true;
                    System.out.println("Book Issued Successfully!");
                } else {
                    System.out.println("Book Already Issued!");
                }
                return;
            }
        }
        System.out.println("Book Not Found!");
    }

    void returnBook() {
        System.out.print("Enter Book ID to Return: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.bookId == id) {
                if (b.isIssued) {
                    b.isIssued = false;
                    System.out.println("Book Returned Successfully!");
                } else {
                    System.out.println("Book Was Not Issued!");
                }
                return;
            }
        }
        System.out.println("Book Not Found!");
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. View Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.addBook();
                    break;
                case 2:
                    lib.addUser();
                    break;
                case 3:
                    lib.viewBooks();
                    break;
                case 4:
                    lib.issueBook();
                    break;
                case 5:
                    lib.returnBook();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }
}


