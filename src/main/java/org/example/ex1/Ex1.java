package org.example.ex1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Ex1 {
    public static void main(String[] args) {

        //adaugati 2 filme si 3 actori intr-o singura tranzactie
        // crearea sesion factory
        // crearea tabelelelor
        // inserare date

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.config.xml")
                .addAnnotatedClass(Movie.class)
                .addAnnotatedClass(Actor.class)
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Movie firstMovie = new Movie();
        firstMovie.setId(1);
        firstMovie.setName("Titanic");
        firstMovie.setType(Genre.HORROR);
        firstMovie.setImdbScore(8);
     //   firstMovie.setReleaseDate("1990-10-12");
        session.persist(firstMovie); // un fel de insert
        transaction.commit(); // toate modificarile se duc in baza de date
        session.close();
    }
}
