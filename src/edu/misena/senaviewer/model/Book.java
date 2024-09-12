package edu.misena.senaviewer.model;
import java.util.List;

public class Book extends Publication {

    // atributo especifico de book

    private int totalPages;

    // Constructor

    public Book(String title, String edititionDate, String editorial, int totalPages) {

        // Llmar al constructor padre de publication

        super(title, edititionDate, editorial);
        this.totalPages = totalPages;

    }
    // Getter y Setter para totalPages

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    //metodo para mostrar la información de book
    @Override
    public String toString() {
        return "Book{" +
                "Title='" + getTitle() + '\'' +
                ", Edition Date='" + getEditionDate() + '\'' +
                ", Editorial='" + getEditorial() + '\'' +
                ", Total Pages=" + totalPages +
                ", Authors=" + getAuthors() +
                '}';
    }
}
