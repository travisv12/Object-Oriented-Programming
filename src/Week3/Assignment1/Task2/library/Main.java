package Week3.Assignment1.Task2.library;

import Week3.Assignment1.Task2.library.model.Book;
import Week3.Assignment1.Task2.library.model.LibraryMember;
import Week3.Assignment1.Task2.library.system.Library;

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

        // Borrowing and returning books
        library.borrowBook("M001", "9780743273565"); // Alice borrows The Great Gatsby
        library.borrowBook("M002", "9780061120084"); // Bob borrows To Kill a Mockingbird
        library.returnBook("M001", "9780743273565"); // Alice returns The Great Gatsby
    }
}
