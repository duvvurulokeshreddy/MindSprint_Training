import java.util.*;

public class Library {
    static Scanner scanner = new Scanner(System.in);
    static Book[] books = new Book[5];

    public static void main(String[] args) {
        // Accepting book details from the user
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Enter Book ID: ");
            int bookId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Title: ");
            String title = scanner.nextLine();
            System.out.print("Enter Author: ");
            String author = scanner.nextLine();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();

            books[i] = new Book(bookId, title, author, price);
        }

        // Display all books
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            book.displayBook();
        }

        // Search for a book by title
        System.out.print("Enter book title to search: ");
        scanner.nextLine(); // Consume newline
        String searchTitle = scanner.nextLine();
        searchBookByTitle(searchTitle);

        // Find and display the most expensive book
        findMostExpensiveBook();
    }

    public static void searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("\nBook found:");
                book.displayBook();
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found.");
    }

    public static void findMostExpensiveBook() {
        Book expensiveBook = books[0];
        for (Book book : books) {
            if (book.price > expensiveBook.price) {
                expensiveBook = book;
            }
        }
        System.out.println("\nMost Expensive Book:");
        expensiveBook.displayBook();
    }

}
