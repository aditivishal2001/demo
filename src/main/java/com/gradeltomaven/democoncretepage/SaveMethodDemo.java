package com.gradeltomaven.democoncretepage;
import org.hibernate.Session;

public class SaveMethodDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student s = new Student(1, 22,"Ram");
        session.beginTransaction();
        Integer i = (Integer)session.save(s);
        System.out.println("Generated Identifier:"+ i);
        session.getTransaction().commit();
        session.close();
    }
}