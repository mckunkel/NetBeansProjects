/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIT_ONLINE_COURSES;

import java.util.*;

public class Library {

    String address;
    ArrayList<Book> books = new ArrayList<Book>();

    Library() {

    }

    Library(String location) {
        this.address = location;
        //books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " in the book loop");
    }

    public void getsize() {// Get size and display.
        int count = books.size();
        System.out.println("Library has: " + count + " total books in its catalouge");
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " is in the library's catalouge");
        }
    }

    static void printOpeningHours() {
        System.out.println("0900 - 1700 Daily");
    }

    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String book_title) {
        int found = 0;
        for (Book book : books) {
            if (book.getTitle().equals(book_title)) {
                if (book.isBorrowed()) {
                    if (found == 0) {
                        found = 1;
                        break;
                    }
                } else {
                    book.borrowed();
                    found = 2;
                    break;

                }
            }
        }
        if (found == 0) {
            System.out.println("Book " + book_title + " not in this library");
        } else if (found == 1) {
            System.out.println("Book is already borrowed");

        } else if (found == 2) {
            System.out.println("Book " + book_title + " 1 succesfully borrowed");

        }

    }

    public void returnBook(String book_title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equals(book_title) && book.isBorrowed()) {
                book.returned();
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("You have returned "+ book_title);
        }
    }

    public void printAvailableBooks() {
        boolean book_located = false;
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
                book_located = true;
            }
        }

        if (!book_located) {
            System.out.println("No books left in this library");
        }

    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}
