
package Week2.Assignment3.Task6;

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

        // Create instances of User
        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);

        // Add users to the library
        library.addUser(user1);
        library.addUser(user2);

        // Display the list of all books in the library
        library.displayBooks();

        // Search for books by a specific author and display the results
        System.out.println();
        library.findBooksByAuthor("Jane Doe");

        // Borrow a book
        System.out.println();
        library.borrowBook("Data Structures and Algorithms", user1);

        // Try to borrow the same book again
        System.out.println();
        library.borrowBook("Data Structures and Algorithms", user2);

        // Display the list of all books in the library after borrowing
        System.out.println();
        library.displayBooks();

        // Return a book
        System.out.println();
        library.returnBook(book2, user1);

        // Try to return a book that was not borrowed
        System.out.println();
        library.returnBook(book1, user2);

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
        book2.setRating(4.0);
        book2.addReview("Excellent resource for data structures.");
        book3.setRating(3.5);
        book3.addReview("Interesting read.");
        book4.setRating(4.0);
        book4.addReview("Good follow-up to the first book.");

        // Display book details with rating and reviews
        System.out.println("Book: " + book1.getTitle());
        System.out.println("Rating: " + book1.getRating());
        System.out.println("Reviews: " + book1.getReviews());

        // Calculate and display the average book rating
        System.out.println();
        System.out.println("Average book rating: " + library.getAverageBookRating());

        // Find and display the most reviewed books
        System.out.println();
        System.out.println("Most reviewed books:");
        for (Book book : library.getMostReviewedBooks()) {
            System.out.println("Title: " + book.getTitle() + ", Reviews: " + book.getReviews().size());
        }
    }
}