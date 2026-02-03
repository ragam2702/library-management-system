package service;

import dao.BookDAO;
import dao.BookDAOImpl;
import dto.Book;

public class BookService {

    BookDAO dao = new BookDAOImpl();

    public void addBook(Book book) {
        dao.addBook(book);
    }

    public void viewBooks() {
        dao.getAllBooks();
    }

    public void issueBook(int id) {
        dao.issueBook(id);
    }

    public void returnBook(int id) {
        dao.returnBook(id);
    }

    public void deleteBook(int id) {
        dao.deleteBook(id);
    }
}
