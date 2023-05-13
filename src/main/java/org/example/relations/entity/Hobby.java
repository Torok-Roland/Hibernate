package org.example.relations.entity;

import jakarta.persistence.*;

@Entity
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String name;

    @Column(name = "difficulty_level")
    private String difficultyLevel;

    public Hobby(Integer id, String name, String difficultyLevel) {
        Id = id;
        this.name = name;
        this.difficultyLevel = difficultyLevel;
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

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
