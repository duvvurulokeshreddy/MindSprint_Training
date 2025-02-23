public class Book {

    int bookId;
    String title;
    String author;
    double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBook(){
        System.out.println("Display the book "+ bookId);
        System.out.println("Display the book "+ title);
        System.out.println("Display the book "+ author);
        System.out.println("Display the book "+ price);
    }
}
