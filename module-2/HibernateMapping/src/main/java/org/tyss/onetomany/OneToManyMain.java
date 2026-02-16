package org.tyss.onetomany;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.tyss.util.HibernateUtil;


public class OneToManyMain {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Customer customer = new Customer();
        customer.setName("Rahul");
        customer.setEmail("rahul@gmail.com");

        Order o1 = new Order();
        o1.setOrderDate("2026-02-16");
        o1.setAmount(2500);

        Order o2 = new Order();
        o2.setOrderDate("2026-02-17");
        o2.setAmount(4500);

        // linking
        customer.addOrder(o1);
        customer.addOrder(o2);

        session.save(customer);

        tx.commit();
        session.close();
    }
}
