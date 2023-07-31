package org.example.repository;

import org.example.modle.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class ProductRepository
{
    private static Session session = null;
    public static void add(Product product)
    {
        Session session  = getSession();;
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
    }

    public static Product get(int id)
    {
        Session session = getSession();;
        return session.get(Product.class, id);
    }

    public static List<Product> getAll()
    {
        Session session  = getSession();;
        Query query = session.createQuery("from Product");
        List<Product> productList = query.list();
        return productList;
    }

    public static void update(Product product)
    {
        Session session  = getSession();
        session.beginTransaction();
        session.update(product);
        session.getTransaction().commit();

    }
    public static void delete(Product product)
    {
        Session session = getSession();
        session.beginTransaction();
        session.delete(product);
        session.getTransaction().commit();
    }

    public static Session getSession()
    {
        if(session != null)
        {
            return session;
        }
        else
        {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Product.class);
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            return sessionFactory.openSession();
        }
    }

}
