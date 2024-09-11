package edu.misena.senaviewer.model;

public class Publication {
    String title;
    String edititionDate;
    String editorial;
    String authors;

    public Publication(String title, String edititionDate, String editorial){
        this.title=title;
        this.edititionDate=edititionDate;
        this.editorial=editorial;
    }
    //Herencia
    public Publication() {}

    // Getters y Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdititionDate() {
        return edititionDate;
    }

    public void setEdititionDate(String edititionDate) {
        this.edititionDate = edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
}
