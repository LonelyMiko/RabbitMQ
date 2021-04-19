package md.usm.fmi.assets;

public class Movie {
    private long id;
    private long rating;
    private long reviews;
    private long year;
    private String title;
    private String genres;

    public Movie(long id, long rating, long reviews, long year, String title, String genres) {
        this.id = id;
        this.rating = rating;
        this.reviews = reviews;
        this.year = year;
        this.title = title;
        this.genres = genres;
    }

    public long getId() {
        return id;
    }

    public long getRating() {
        return rating;
    }

    public long getReviews() {
        return reviews;
    }

    public long getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getGenres() {
        return genres;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Movie{" + "\n" +
                "   id=" + id + "\n" +
                "   rating=" + rating + "\n" +
                "   reviews=" + reviews + "\n" +
                "   year=" + year + "\n" +
                "   title='" + title + '\'' + "\n" +
                "   genres='" + genres + '\'' + "\n" +
                '}';
    }
}
