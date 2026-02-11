public class MediaLib {

    private Book book;
    private Movie movie;
    private Song song;

//all my statics are here 
    private static int numBooks = 0;
    private static int numMovies = 0;
    private static int numSongs = 0;
    private static int numEntries = 0;

    public MediaLib() {
    }

    // addBook using parameters (9required by test)
    public void addBook(String title, String author) {
        if (book == null) {
            book = new Book(title, author);
            numBooks++;
            numEntries++;
        }
    }

    public void addMovie(String title, double duration) {
        if (movie == null) {
            movie = new Movie(title, duration);
            numMovies++;
            numEntries++;
        }
    }

    public void addSong(String title) {
        if (song == null) {
            song = new Song(title);
            numSongs++;
            numEntries++;
        }
    }

    //other adds are same as prev ones 
    // REQUIRED ACCESSORS from 2.9 
    public static int getNumBooks() {
        return numBooks;
    }

    public static int getNumMovies() {
        return numMovies;
    }

    public static int getNumSongs() {
        return numSongs;
    }

    public static int getNumEntries() {
        return numEntries;
    }

    public String toString() {
        String info = "";

        if (book != null)
            info += "Book: " + book + "\n";

        if (movie != null)
            info += "Movie: " + movie + "\n";

        if (song != null)
            info += "Song: " + song + "\n";

        return info;
    }
}
