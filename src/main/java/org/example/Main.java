package org.example;

import org.example.entity.Car;
import org.example.entity.Driver;
import org.example.entity.Truck;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.config.xml")
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Truck.class)
                .addAnnotatedClass(Driver.class)
                .buildSessionFactory();


    }

}