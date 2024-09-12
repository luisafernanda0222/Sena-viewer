package edu.misena.senaviewer.model;

import java.util.List;

public class Publication {
    private String title;
    private String editionDate;  // Corregido a "editionDate"
    private String editorial;
    private List<String> authors;

    public Publication(String title, String editionDate, String editorial) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }

    // herencia

    public Publication() {}

    // Getters y Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    // Método toString() opcional para representar la clase como texto
    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", editionDate='" + editionDate + '\'' +
                ", editorial='" + editorial + '\'' +
                ", authors=" + authors +
                '}';
    }
}