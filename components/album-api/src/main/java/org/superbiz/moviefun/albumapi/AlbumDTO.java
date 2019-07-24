package org.superbiz.moviefun.albumapi;

import java.util.Objects;

public class AlbumDTO {

    private Long id;

    private String artist;
    private String title;
    private int year;
    private int rating;


    public AlbumDTO() {
    }

    public AlbumDTO(String artist, String title, int year, int rating) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumDTO albumDTO = (AlbumDTO) o;
        return year == albumDTO.year &&
                rating == albumDTO.rating &&
                Objects.equals(id, albumDTO.id) &&
                Objects.equals(artist, albumDTO.artist) &&
                Objects.equals(title, albumDTO.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, artist, title, year, rating);
    }
}
