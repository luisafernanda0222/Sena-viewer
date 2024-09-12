package edu.misena.senaviewer.model;

public class Movie extends Film {
    // Atributo específico de Movie
    private int movieYear;

    // Constructor
    public Movie(String title, String genre, String creator, String duration, int movieYear) {

        // Llamar al padre Film

        super(title, genre, creator, duration);
        this.movieYear = movieYear;
    }

    // Getters y Setters

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    // Método toString() que muestra la información de Movie
    @Override
    public String toString() {
        return "Movie{" +
                "Title='" + getTitle() + '\'' +
                ", Genre='" + getGenre() + '\'' +
                ", Creator='" + getCreator() + '\'' +
                ", Duration='" + getDuration() + '\'' +
                ", Year=" + movieYear +
                ", Viewed=" + isViewed() +
                '}';
    }
}
