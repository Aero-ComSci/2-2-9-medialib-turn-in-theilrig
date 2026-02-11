public class Song {

    private String title;
    private int rating;

    public Song(String t) {
        title = t;
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

    public boolean equals(Song s) {
        return this.title.equals(s.title);
    }

    public String toString() {
        return title;
    }
}
