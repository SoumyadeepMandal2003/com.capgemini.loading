package org.tyss.manytoone;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tyss.util.HibernateUtil;

public class ManyToOneMain {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();


        Department dept = new Department();
        dept.setName("IT");

        session.save(dept);


        Employee e1 = new Employee();
        e1.setName("Rahul");
        e1.setSalary(50000);
        e1.setDepartment(dept);

        Employee e2 = new Employee();
        e2.setName("Amit");
        e2.setSalary(60000);
        e2.setDepartment(dept);

        session.save(e1);
        session.save(e2);

        tx.commit();
        session.close();
    }
}
