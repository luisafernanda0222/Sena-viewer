package edu.misena.senaviewer.model;

public class Movie extends Film {

    private int movieYear;

    // Constructor
    public Movie(String title, String genre, String creator, String duration, int movieYear) {
        super(title, genre, creator, duration);
        this.movieYear = movieYear;
    }

    // Getter y Setter para movieYear
    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    //metodo para mostrar la informaciòn
    public String toString() {
        return "Movie{" +
                "Title='" + getTitle() + '\'' +
                ", Genre='" + getGenre() + '\'' +
                ", Creator='" + getCreator() + '\'' +
                ", Duration='" + getDuration() + '\'' +
                ", Movie Year=" + movieYear +
                '}';
    }
}
