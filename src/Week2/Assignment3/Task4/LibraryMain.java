
package Week2.Assignment3.Task4;

public class LibraryMain {
    public static void main(String[] args) {
        // Create instances of Book
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);
        Book book4 = new Book("Data Structures and Algorithms 2", "Jane Doe", 2021);
        // Create an instance of Library
        Library library = new Library();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Display the list of all books in the library
        library.displayBooks();

        // Search for books by a specific author and display the results
        System.out.println();
        library.findBooksByAuthor("Jane Doe");

        // Borrow a book
        System.out.println();
        library.borrowBook("Data Structures and Algorithms");

        // Try to borrow the same book again
        System.out.println();
        library.borrowBook("Data Structures and Algorithms");

        // Display the list of all books in the library after borrowing
        System.out.println();
        library.displayBooks();

        // Return a book
        System.out.println();
        library.returnBook(book2);

        // Try to return a book that was not borrowed
        System.out.println();
        library.returnBook(book1);

        // Display the list of all books in the library after returning
        System.out.println();
        library.displayBooks();

        // Check availability of a book
        System.out.println();
        System.out.println("Is 'Data Structures and Algorithms 3' available? " + library.isBookAvailable("Data Structures and Algorithms 3"));
        System.out.println("Is 'Introduction to Java Programming' available? " + library.isBookAvailable("Introduction to Java Programming"));

        // Set rating and add reviews for a book
        System.out.println();
        book1.setRating(4.5);
        book1.addReview("Great introduction to Java!");
        book1.addReview("Very informative and well-written.");

        // Display book details with rating and reviews
        System.out.println("Book: " + book1.getTitle());
        System.out.println("Rating: " + book1.getRating());
        System.out.println("Reviews: " + book1.getReviews());
    }
}