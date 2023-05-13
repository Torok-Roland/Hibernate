package org.example.ex2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    private Integer id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "profesie")
    private Profession profession;

    @Column(name = "birth_date")
    private Integer birthDate;

    public Student(){

    }

    public Student(Integer id, String fullName, Integer birthDate) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthDate = birthDate;
    }
}
