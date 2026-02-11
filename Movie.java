public class Movie {

    private String title;
    private double duration;
    private int rating;

    public Movie(String t, double d) {
        title = t;
        duration = d;
        rating = 0;
    }

    public int getRating() {
        return rating;
    }

    public void adjustRating(int r) {
        if (rating + r >= 0 && rating + r <= 10) {
            rating += r;
        }
    }

    public boolean equals(Movie m) {
        return this.title.equals(m.title) &&
               this.duration == m.duration;
    }

    public String toString() {
        return title + " (" + duration + " hrs)";
    }
}
