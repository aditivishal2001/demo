package com.gradeltomaven.democoncretepage;
import org.hibernate.Session;

public class SaveOrUpdateMethodDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student s = new Student(1, 25,"Ram");
        session.beginTransaction();
        session.saveOrUpdate(s);
        session.getTransaction().commit();
        session.close();
    }
}