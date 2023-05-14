package org.database;

import org.example.entity.Car;
import org.example.entity.Driver;
import org.example.entity.Truck;
import org.example.ex1.Actor;
import org.example.ex1.Genre;
import org.example.ex1.Movie;
import org.example.ex2.Profession;
import org.example.ex2.Student;
import org.example.ex2.Teacher;
import org.example.relations.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataBaseConfig {

    private static SessionFactory sessionFactory = null;


    private DataBaseConfig(){

    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            sessionFactory = new Configuration()
                    .configure("hibernate.config.xml")
                    .addAnnotatedClass(Car.class)
                    .addAnnotatedClass(Truck.class)
                    .addAnnotatedClass(Driver.class)
                    .addAnnotatedClass(Actor.class)
                    .addAnnotatedClass(Movie.class)
                    .addAnnotatedClass(Profession.class)
                    .addAnnotatedClass(Student.class)
                    .addAnnotatedClass(Teacher.class)
                    .addAnnotatedClass(Child.class)
                    .addAnnotatedClass(Food.class)
                    .addAnnotatedClass(Mother.class)
                    .addAnnotatedClass(Hobby.class)
                    .addAnnotatedClass(Toy.class)
                    .addAnnotatedClass(TvShows.class)
                    .addAnnotatedClass(Animal.class)
                    .addAnnotatedClass(Owner.class)
                    .buildSessionFactory();
        }
        return sessionFactory;


    }



}
