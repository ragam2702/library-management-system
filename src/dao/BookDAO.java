package dao;

import dto.Book;
import java.util.List;

public interface BookDAO {
    void addBook(Book book);
    List<Book> getAllBooks();
    void issueBook(int bookId);
    void returnBook(int bookId);
    void deleteBook(int bookId);
}
