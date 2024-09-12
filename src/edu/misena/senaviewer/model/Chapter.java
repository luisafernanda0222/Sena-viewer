package edu.misena.senaviewer.model;

public class Chapter {
    int id;
    String title;
    int duration;
    int year;
    String viewed;
    int timeReaded;
    int sessionNumber;

    public Chapter(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
        this.viewed = "";
        this.timeReaded = 0;
        this.sessionNumber = 0;
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

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
}