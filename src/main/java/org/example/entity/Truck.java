package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// annotation
@Entity
@Table(name = "truks") //pentru a modifica titlul tabelului din Truck in transport_vehicle...
public class Truck {

    @Id
    private Integer id;

    @Column(name = "truck_name",
    nullable = false)
    private String name;

    public Truck() {
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
}
