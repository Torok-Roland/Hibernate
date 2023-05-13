package org.example.relations.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mothers")
public class Mother {
    @Id
    private Integer id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Job job;

    public Mother(Integer id, String name, Job job) {
        this.id = id;
        this.name = name;
        this.job = job;
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
