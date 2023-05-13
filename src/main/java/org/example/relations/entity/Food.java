package org.example.relations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "food")
public class Food {
    @Id
    private Integer Id;

    private String name;

    private Boolean healthy;

    public Food(Integer id, String name, Boolean healthy) {
        Id = id;
        this.name = name;
        this.healthy = healthy;
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

    public Boolean getHealthy() {
        return healthy;
    }

    public void setHealthy(Boolean healthy) {
        this.healthy = healthy;
    }
}
