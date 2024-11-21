package org.leorodriguez.Controller;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.leorodriguez.Model.Department;
import org.leorodriguez.Model.User;
import java.util.List;


public class DepartmentController {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

         //addDepartment(factory,session);

        //findDepartment(factory,session,1);

        //updateDepartment(session,1);

        //deleteDepartment(session,1);
    }

    public static  void deleteDepartment(Session session, int id){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Transaction tx = session.beginTransaction();
        Department dep = new Department();
        dep.setId(id);
        session.remove(dep);
        tx.commit();
        System.out.println("Department with id " + id + " was deleted.");
        session.close();
        factory.close();

    }

    public static void updateDepartment(Session session, int id) {
        Transaction tx = session.beginTransaction();
        Department dep = new Department();
        dep.setId(id);
        dep.setName("Update test");
        dep.setState("Updated");
        session.merge(dep);
        System.out.println("Update at"+ dep.getId()+" is complete");
        session.getTransaction().commit();
        session.close();
    }

    public static void findDepartment(SessionFactory factory, Session session, int id){
       Transaction tx = session.beginTransaction();
       Department dep = session.get(Department.class, id);
        System.out.println("Id: "+dep.getId());
        System.out.println("Name: "+dep.getName());
        System.out.println("State: "+dep.getState());
        tx.commit();
        factory.close();
        session.close();
    }

    public static void addDepartment(SessionFactory factory, Session session){
         Transaction transaction = session.beginTransaction()  ;

        Department depOne = new Department();
        depOne.setName("Test");
        depOne.setState("Test");

        session.persist(depOne);
        transaction.commit();
        System.out.println("Test completed");
        factory.close();
        session.close();

    }
}
