package edu.misena.senaviewer.model;

public class Chapter {
    int id;
    String title;
    String duration;
    int year;
    String viewed;
    int timeViewed;
    String sessionNumber;

    public Chapter(String title, String duration,int year) {
        this.title = title;
        this.duration=duration;
        this.year = year;
        this.viewed ="no";
        this.timeViewed =0;
        this.sessionNumber = sessionNumber;

    }

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

    public String getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(String sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
}