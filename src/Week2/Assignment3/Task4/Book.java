package Week2.Assignment3.Task4;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getRating() { return rating; }

    public void setRating(double rating) {
        if (rating < 0 || rating > 5) {
            System.out.println("Invalid rating. Rating must be between 0 and 5.");
            return;
        }
        this.rating = rating; }

    public void addReview(String review) { reviews.add(review); }

    public ArrayList<String> getReviews() { return reviews; }
}