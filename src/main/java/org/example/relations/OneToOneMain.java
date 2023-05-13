package org.example.relations;

import org.example.relations.entity.Child;
import org.example.relations.entity.Food;
import org.example.relations.entity.Mother;
import org.example.relations.entity.Toy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.config.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Mother.class)
                .addAnnotatedClass(Food.class)
                .addAnnotatedClass(Toy.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Food firstFood = new Food(1,"milk", true);
        session.persist(firstFood);
        Toy toy1 = new Toy(1,"Bear");

        Child firstChild = new Child(1, "Johnny", firstFood,toy1);
        session.persist(firstChild);


        transaction.commit(); // toate modificarile se duc in baza de date
        System.out.println("Child was saved");

        Transaction t2 = session.beginTransaction();
        session.remove(firstChild);

        t2.commit();
        System.out.println("Child was removed");
        System.out.println("Check what happened with toy");
        session.close();
    }
}
