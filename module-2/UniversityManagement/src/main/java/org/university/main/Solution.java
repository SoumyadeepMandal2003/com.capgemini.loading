package org.university.main;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.university.entity.*;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Department dept = new Department();
        dept.setName("Computer Science");

        Student s1 = new Student();
        s1.setName("Rahul");
        s1.setDepartment(dept);

        Student s2 = new Student();
        s2.setName("Anita");
        s2.setDepartment(dept);

        IDCard c1 = new IDCard();
        c1.setCardNumber("ID101");

        IDCard c2 = new IDCard();
        c2.setCardNumber("ID102");

        s1.setIdCard(c1);
        s2.setIdCard(c2);

        Course java = new Course();
        java.setCourseName("Java");

        Course dbms = new Course();
        dbms.setCourseName("DBMS");

        s1.setCourses(Arrays.asList(java, dbms));
        s2.setCourses(Arrays.asList(java));


        session.persist(dept);
        session.persist(java);
        session.persist(dbms);
        session.persist(c1);
        session.persist(c2);
        session.persist(s1);
        session.persist(s2);

        tx.commit();
        session.close();
        factory.close();

        System.out.println("✅ Build successful, data saved!");
    }
}