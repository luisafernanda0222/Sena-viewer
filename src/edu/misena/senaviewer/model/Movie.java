package edu.misena.senaviewer.model;

public class Movie {
    int id;
    String title;
    String genre;
    String creator;
    int duration;
    int year;
    String viewed;
    int timeViewed;

    public Movie(String title,  String genre,  String creator,int duration,int year) {
        this.title = title;
        this.genre = genre;
        this.creator=creator;
        this.duration=duration;
        this.year = year;
        this.viewed = "";
        this.timeViewed =timeViewed;

    }
    //Getter y Setters

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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getViewed() {
        return viewed;
    }

    public void setViewed(String viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }
