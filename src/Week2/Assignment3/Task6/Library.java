package Week2.Assignment3.Task6;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User \"" + user.getName() + "\" added to the library.");
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int i = 1;
        for (Book book : books) {
            System.out.println(i + ". Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\", Year: " + book.getPublicationYear());
            i++;
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by Author \"" + author + "\":");
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + book.getPublicationYear());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author \"" + author + "\".");
        }
    }

    public void borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                user.borrowBook(book);
                System.out.println(user.getName() + " borrowed book: \"" + title + "\"");
                return;
            }
        }
        System.out.println("Book \"" + title + "\" is not available in the library.");
    }

    public void returnBook(Book book, User user) {
        if (user.getBorrowedBooks().contains(book)) {
            user.returnBook(book);
            books.add(book);
            System.out.println(user.getName() + " returned book: \"" + book.getTitle() + "\"");
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" was not borrowed by " + user.getName() + ".");
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }
        double totalRating = 0.0;
        int ratedBooksCount = 0;
        for (Book book : books) {
            if (book.getRating() > 0) {
                totalRating += book.getRating();
                ratedBooksCount++;
            }
        }
        return ratedBooksCount > 0 ? totalRating / ratedBooksCount : 0.0;
    }

    public List<Book> getMostReviewedBooks() {
        if (books.isEmpty()) {
            return new ArrayList<>();
        }
        List<Book> mostReviewedBooks = new ArrayList<>();
        int maxReviews = 0;
        for (Book book : books) {
            int reviewCount = book.getReviews().size();
            if (reviewCount > maxReviews) {
                mostReviewedBooks.clear();
                mostReviewedBooks.add(book);
                maxReviews = reviewCount;
            } else if (reviewCount == maxReviews) {
                mostReviewedBooks.add(book);
            }
        }
        return mostReviewedBooks;
    }
}