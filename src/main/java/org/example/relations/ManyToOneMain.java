package org.example.relations;

import org.database.DataBaseConfig;
import org.example.relations.entity.Animal;
import org.example.relations.entity.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class ManyToOneMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = DataBaseConfig.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Owner firstOwner = new Owner(null, "Tyson", new ArrayList<>());
        Animal firstAnimal = new Animal(null, "Tiger","cat",firstOwner);


        session.persist(firstAnimal);

        transaction.commit();
        session.close();
    }
}
