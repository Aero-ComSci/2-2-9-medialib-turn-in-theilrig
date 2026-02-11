public class Book {

    private String title;
    private String author;
    private int rating;

    public Book(String t, String a) {
        title = t;
        author = a;
        rating = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    public void adjustRating(int r) {
        if (rating + r >= 0 && rating + r <= 10) {
            rating += r;
        }
    }

    public boolean equals(Book b) {
        return this.title.equals(b.title) &&
               this.author.equals(b.author);
    }

    public String toString() {
        return "\"" + title + "\", written by " + author;
    }
}
