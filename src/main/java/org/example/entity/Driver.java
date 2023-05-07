package org.example.entity;
/*
Creați un tabel pentru șoferi (drivers)

id - primary key
name - not null
max_traveldistance - integer
email - unic
security_key - string max 30 caractere - de facut security key-ul unic
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "drivers")
public class Driver {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(name = "max_travel_distance")
    private Integer maxTravelDistance;

    @Column(unique = true)
    private String email;

    @Column(name = "security_key",unique = true, length = 30)
    private String securityKey;


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

    public Integer getMaxTravelDistance() {
        return maxTravelDistance;
    }

    public void setMaxTravelDistance(Integer maxTravelDistance) {
        this.maxTravelDistance = maxTravelDistance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }
}
