package com.gradeltomaven.democoncretepage;
import org.hibernate.Session;

public class UpdateMethodDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student s = new Student(1, 22,"Mahesh");
        session.beginTransaction();
        session.update(s);
        session.getTransaction().commit();
        session.close();
    }
}