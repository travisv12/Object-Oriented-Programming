package Week3.Assignment1.Task3.library.system;

import Week3.Assignment1.Task3.library.model.Book;
import Week3.Assignment1.Task3.library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Added member: " + member.getName());
    }

    public boolean borrowBook(String memberId, String isbn) {
        LibraryMember member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null && book.isAvailable() && !book.isReserved()) {
            member.borrowBook(book);
            book.setAvailable(false);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
            return true;
        }
        System.out.println("Unable to borrow book.");
        return false;
    }

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

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println(member.getName() + " reserved " + book.getTitle());
        } else {
            System.out.println("Book " + book.getTitle() + " is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println(member.getName() + "'s reservation canceled for book: " + book.getTitle());
        } else {
            System.out.println("This book was not reserved by " + member.getName());
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        if (member.getReservedBooks().isEmpty()) {
            System.out.println("No reserved books.");
        } else {
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());}
        }
    }

    private LibraryMember findMemberById(String memberId) {
        for (LibraryMember member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
