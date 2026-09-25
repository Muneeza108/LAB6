/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author natas
 */
public interface LibrarySystem {

    void addBook(Book book);

    void removeBook(int bookId);

    Book searchBook(int bookId);

    void issueBook(int bookId);

    void returnBook(int bookId);
}