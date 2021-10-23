package BDBot;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

public class ManageUsers {
    private static SessionFactory factory;
    Transaction tx = null;
    public void runDB()
    {
        factory = new Configuration().configure().buildSessionFactory();
        ManageUsers ME = new ManageUsers();

    }
    public String addUser(String userID,Integer userIQ)
    {
        Session session = factory.openSession();
        Transaction tx = null;
        String employeeID = null;
        tx = session.beginTransaction();
        Users user = new Users(userID,userIQ);
        employeeID = (String) session.save(user);
        tx.commit();
        session.close();
        return employeeID;
    }
    public void updateUser(String userID,Integer userIQ)
    {
        Session session = factory.openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        Users user = (Users)session.get(Users.class,userID);
        user.setUserIQ(userIQ);
        session.update(user);
        tx.commit();
        session.close();
    }
    public void listUsers()
    {
        Session session = factory.openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        List users = session.createQuery("FROM iqCount ").list();
        for (Iterator iterator = users.iterator(); iterator.hasNext(); )
        {
            Users user = (Users) iterator.next();
        }
        tx.commit();
        session.close();
    }
}