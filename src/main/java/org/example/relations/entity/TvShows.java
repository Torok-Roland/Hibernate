package org.example.relations.entity;

import jakarta.persistence.*;
import org.example.ex1.Genre;

@Entity
@Table(name = "tv_shows")
public class TvShows {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    public TvShows(Integer id, String name, Genre genre) {
        Id = id;
        this.name = name;
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
