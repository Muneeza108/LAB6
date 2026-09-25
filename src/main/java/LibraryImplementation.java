/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author natas
 */
import java.util.ArrayList;
import java.util.List;

public class LibraryImplementation implements LibrarySystem {

    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(int bookId) {

        books.removeIf(book -> book.getBookId() == bookId);
    }

    @Override
    public Book searchBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    @Override
    public void issueBook(int bookId) {

        Book book = searchBook(bookId);

        if (book != null) {
            System.out.println("Book issued: " + book.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }

    @Override
    public void returnBook(int bookId) {

        Book book = searchBook(bookId);

        if (book != null) {
            System.out.println("Book returned: " + book.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }
}