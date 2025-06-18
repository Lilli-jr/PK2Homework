package Exercise3;

public class Movie {
    private String title;
    private double rating;
    private int year;

    public Movie(String title,double rating,  int year) {
        this.rating = rating;
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " (" + year + "), Rating: " + rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
