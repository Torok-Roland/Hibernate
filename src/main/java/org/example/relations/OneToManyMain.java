package org.example.relations;

import org.database.DataBaseConfig;
import org.example.ex1.Genre;
import org.example.relations.entity.Hobby;
import org.example.relations.entity.Job;
import org.example.relations.entity.Mother;
import org.example.relations.entity.TvShows;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OneToManyMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = DataBaseConfig.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Hobby firstHobby = new Hobby(null, "Tennis","beginner");
        Hobby secondHobby = new Hobby(null, "Chess","hard");
        TvShows firstTvShows = new TvShows(null,"Manifest", Genre.ACTION);
        TvShows secondTvShows = new TvShows(null,"MoneyHeist", Genre.DRAMA);
        //nu vrem să le persistăm deoarece operația de persist este cascadată din Mother

        Mother firstMother = new Mother(null, "Ioana", Job.LAWYER, List.of(firstHobby,secondHobby),List.of(firstTvShows,secondTvShows));


        session.persist(firstHobby);
        session.persist(secondHobby);
        session.persist(firstMother);

        transaction.commit();
        session.close();

    }
}
