package org.example.relations.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "children")
public class Child {

    @Id

    private Integer Id;

    private String name;

    // presupun că fiecare copil are o singură mâncare favorită
    // presupun că fiecare mâncare este favorită unui singur copil
    @OneToOne()
    private Food favoriteFood;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Toy favoriteToy;

    public Child(Integer id, String name, Food favoriteFood, Toy favoriteToy) {
        Id = id;
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.favoriteToy = favoriteToy;
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

    public Food getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(Food favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Toy getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(Toy favoriteToy) {
        this.favoriteToy = favoriteToy;
    }
}
