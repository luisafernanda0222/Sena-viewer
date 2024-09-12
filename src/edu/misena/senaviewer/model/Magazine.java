package edu.misena.senaviewer.model;

public class Magazine extends Publication {

    // Atributo específico de Magazine

    private int issueNumber;

    // Constructor
    public Magazine(String title, String editionDate, String editorial, int issueNumber) {

        // Llamar al padre Publication

        super(title, editionDate, editorial);
        this.issueNumber = issueNumber;
    }

    // Getter y Setter

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    // Método toString() para mostrar la información de Magazine
    @Override
    public String toString() {
        return "Magazine{" +
                "Title='" + getTitle() + '\'' +
                ", Edition Date='" + getEditionDate() + '\'' +
                ", Editorial='" + getEditorial() + '\'' +
                ", Issue Number=" + issueNumber +
                ", Authors=" + getAuthors() +
                '}';
    }
}