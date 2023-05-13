package org.example.entity;

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
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Car c = new Car();
        c.setId(11);
        c.setName("Test car");

        session.persist(c); // un fel de insert

        // driver
        Driver driver = new Driver();
        driver.setId(77);
        driver.setName("Mikey");
        driver.setEmail("mikey@gmail.com");
        driver.setMaxTravelDistance(1000);
        driver.setSecurityKey("Mouse");

        session.persist(driver);// un fel de insert

        transaction.commit(); // toate modificarile se duc in baza de date
        session.close();

    }

}