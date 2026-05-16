import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAllBooks() {
        System.out.println("\n--- Current Library Inventory ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void borrowBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && b.isAvailable()) {
                b.setAvailable(false);
                System.out.println("Success! You have borrowed: " + title);
                return;
            }
        }
        System.out.println("Sorry, book not found or already borrowed.");
    }
}