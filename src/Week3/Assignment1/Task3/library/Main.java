package Week3.Assignment1.Task3.library;

import Week3.Assignment1.Task3.library.model.Book;
import Week3.Assignment1.Task3.library.model.LibraryMember;
import Week3.Assignment1.Task3.library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        library.addBook(book1);
        library.addBook(book2);

        // Adding members
        LibraryMember member1 = new LibraryMember("Alice", "M001");
        LibraryMember member2 = new LibraryMember("Bob", "M002");
        library.addMember(member1);
        library.addMember(member2);

        // Reserving a book
        library.reserveBook(member1, book1);
        library.reserveBook(member2, book2);

        // Trying to reserve an already reserved book
        library.reserveBook(member2, book1);

        // Display reserved books for each member
        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);

        // Canceling a reservation
        library.cancelReservation(member1, book1);
        library.displayReservedBooks(member1);
    }
}
