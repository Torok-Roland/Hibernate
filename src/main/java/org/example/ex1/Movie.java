package org.example.ex1;


import jakarta.persistence.*;

import java.sql.Date;

/*
-id
-numele
-genul
-imdb score
-release date
-incasari
* */
@Entity

public class Movie {

    @Id
    private Integer Id;
    private String name;

    @Enumerated(value = EnumType.STRING)
    private Genre type;

    @Column(name = "imdb_score")
    private Integer imdbScore;

    @Column(name = "release_date")
    private Date releaseDate;
    private Double incasari;

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

    public Genre getType() {
        return type;
    }

    public void setType(Genre type) {
        this.type = type;
    }

    public Integer getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(Integer imdbScore) {
        this.imdbScore = imdbScore;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getIncasari() {
        return incasari;
    }

    public void setIncasari(Double incasari) {
        this.incasari = incasari;
    }
}
