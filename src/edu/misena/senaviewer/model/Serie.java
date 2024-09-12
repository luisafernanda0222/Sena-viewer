package edu.misena.senaviewer.model;

public class Serie extends Film {
    int seasons;
    int episodesPerSeason;
    int totalEpisodes;

    // Constructor

    public Serie(String title, String genre, String creator, String duration, int seasons, int episodesPerSeason) {

        // Llamar al constructor de la clase padre Film

        super(title, genre, creator, duration);
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
        this.totalEpisodes = seasons * episodesPerSeason;
    }

    // Getters y Setters

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
        this.totalEpisodes = seasons * this.episodesPerSeason;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
        this.totalEpisodes = this.seasons * episodesPerSeason;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    // Método para mostrar la información de Series
    @Override
    public String toString() {
        return "Series{" +
                "Title='" + getTitle() + '\'' +
                ", Genre='" + getGenre() + '\'' +
                ", Creator='" + getCreator() + '\'' +
                ", Duration='" + getDuration() + '\'' +
                ", Seasons=" + seasons +
                ", Episodes per Season=" + episodesPerSeason +
                ", Total Episodes=" + totalEpisodes +
                ", Viewed=" + isViewed() +
                '}';
    }
}
