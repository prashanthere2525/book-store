import java.util.ArrayList;
import java.util.List;

// Book class to represent individual books
class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private double price;

    public Book(int id, String title, String author, String genre, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    // Getters and setters
    // Implement as needed
}

// Bookstore class to manage books and orders
public class Bookstore {
    private List<Book> inventory;
    private List<Order> orders;

    public Bookstore() {
        this.inventory = new ArrayList<>();
        this.orders = new ArrayList<>();
        // Initialize inventory and orders from database or file
    }

    // Add a book to the inventory
    public void addBook(Book book) {
        inventory.add(book);
    }

    // Remove a book from the inventory
    public void removeBook(int bookId) {
        // Implement as needed
    }

    // Process a new order
    public void processOrder(Order order) {
        // Implement order processing logic
    }

    // Getters and setters
    // Implement as needed

    public static void main(String[] args) {
        // Create a new Bookstore instance
        Bookstore bookstore = new Bookstore();

        // Add some sample books to the inventory
        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 10.99);
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee", "Fiction", 12.99);
        bookstore.addBook(book1);
        bookstore.addBook(book2);

        // Example of processing a new order
        Order order = new Order(1, "John Doe");
        order.addBookToCart(book1);
        order.addBookToCart(book2);
        bookstore.processOrder(order);
    }
}

// Order class to represent customer orders
class Order {
    private int id;
    private String customerName;
    private List<Book> cart;

    public Order(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
        this.cart = new ArrayList<>();
    }

    // Add a book to the cart
    public void addBookToCart(Book book) {
        cart.add(book);
    }

    // Remove a book from the cart
    public void removeBookFromCart(int bookId) {
        // Implement as needed
    }

    // Getters and setters
    // Implement as needed
}
