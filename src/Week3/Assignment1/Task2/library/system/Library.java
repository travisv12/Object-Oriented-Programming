package Week3.Assignment1.Task2.library.system;

import Week3.Assignment1.Task2.library.model.Book;
import Week3.Assignment1.Task2.library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Method to add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    // Method to add a new member to the library
    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Added member: " + member.getName());
    }

    // Method for a member to borrow a book
    public boolean borrowBook(String memberId, String isbn) {
        LibraryMember member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
            book.setAvailable(false);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
            return true;
        }
        System.out.println("Unable to borrow book.");
        return false;
    }

    // Method for a member to return a book
    public boolean returnBook(String memberId, String isbn) {
        LibraryMember member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null && member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            book.setAvailable(true);
            System.out.println(member.getName() + " returned " + book.getTitle());
            return true;
        }
        System.out.println("Unable to return book.");
        return false;
    }

    // Find a member by ID
    private LibraryMember findMemberById(String memberId) {
        for (LibraryMember member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    // Find a book by ISBN
    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
