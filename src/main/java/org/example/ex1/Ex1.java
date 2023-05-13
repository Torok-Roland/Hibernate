package org.example.ex1;

import org.example.ex2.Student;
import org.example.ex2.Teacher;
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
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Teacher.class)
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


        Student firstStudent = new Student();
        firstStudent.setId(1);
        firstStudent.setFullName("Ilie Moromete");


        transaction.commit(); // toate modificarile se duc in baza de date
        session.close();
    }
}
