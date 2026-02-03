package main;

import dto.Book;
import service.BookService;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookService service = new BookService();

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    service.addBook(new Book(title, author, true));
                    break;

                case 2:
                    service.viewBooks();
                    break;

                case 3:
                    System.out.print("Book ID: ");
                    service.issueBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Book ID: ");
                    service.returnBook(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Book ID: ");
                    service.deleteBook(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting Library System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
