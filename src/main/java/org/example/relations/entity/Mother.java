package org.example.relations.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "mothers")
public class Mother {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Job job;

    @OneToMany
    private List<Hobby> hobbies;

    @OneToMany(cascade = {CascadeType.PERSIST})
    private List<TvShows> tvShows;

    public Mother(Integer id, String name, Job job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public Mother(Integer id, String name, Job job, List<Hobby> hobbies, List<TvShows> tvShows) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.hobbies = hobbies;
        this.tvShows = tvShows;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
