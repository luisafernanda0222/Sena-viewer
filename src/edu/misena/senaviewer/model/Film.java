package edu.misena.senaviewer.model;

public class Film {

    private int id;
    private String title;
    private String genre;
    private String creator;
    private String duration;
    private int year;
    private boolean viewed;

    public Film(String title, String genre, String creator, String duration) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
    }

    // herencia

    public Film() {}

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    // Método toString() opcional para representar la clase como texto
    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'' +
                ", duration='" + duration + '\'' +
                ", year=" + year +
                ", viewed=" + viewed +
                '}';
    }
}