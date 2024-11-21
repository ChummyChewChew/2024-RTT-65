package org.leorodriguez.model;

import org.hibernate.cfg.Configuration;
import java.util.List;
import jakarta.persistence.*;
import org.hibernate.*;
import org.hibernate.query.Query;

public class UserDao {
    final SessionFactory sessionFactory = new Configuration()
            .configure().buildSessionFactory();

    final Session session = sessionFactory.openSession();

    public User saveUser(User user) throws PersistenceException {
        Transaction transaction = session.beginTransaction();
        session.persist(user);
        transaction.commit();
        return user;
    }

    //Check user login info
    public boolean login(String email, String password) {
        boolean login = false;
        Query<User> q = session.createQuery("from User u where u.email = :email and u.password=:password",
                User.class);
        q.setParameter("email", email);
        q.setParameter("password", password);
        if (q.getSingleResult() != null) {
            login = true;
        }
        return login;
    }

    //find user by email:
    public User findByEmail(String email) {
        Query<User> query = session.createQuery("from User u where u.email = :email",
                User.class);
        query.setParameter("email", email);
        return (User) query.getSingleResult();
    }

    //find users by zipcode:
    public List<User> findUsersByZipcode(String zipcode) {
        Query<User> query = session.createQuery("from User u where u.zipcode = :zipcode",
                User.class);
        query.setParameter("zipcode", zipcode);
        List<User> list = query.list();
        return list;
    }

    //In the following code, the query.setParameter("empId", id) statement substitutes the "id" argument into the query (HQL).  (True / False)

    public User findByUserId(Integer id) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        String hql = "FROM User u where u.id= :id";

        TypedQuery<User> query = (TypedQuery<User>) session.createQuery(hql, User.class);
        query.setParameter("id", id);

        User result = query.getSingleResult();

        t.commit();
        factory.close();
        session.close();

        return result;
    }
}