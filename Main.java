public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        // Adding Data
        myLibrary.addBook(new Book("Effective Java", "Joshua Bloch"));
        myLibrary.addBook(new Book("Clean Code", "Robert Martin"));
        myLibrary.addBook(new Book("Java: The Complete Reference", "Herbert Schildt"));

        // Simulating App Logic
        myLibrary.showAllBooks();
        
        System.out.println("\nAction: Borrowing 'Clean Code'...");
        myLibrary.borrowBook("Clean Code");

        myLibrary.showAllBooks();
    }
}