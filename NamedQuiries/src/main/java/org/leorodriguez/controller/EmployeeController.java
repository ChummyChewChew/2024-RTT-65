package org.leorodriguez.controller;

import java.util.List;
import jakarta.persistence.TypedQuery;
import org.leorodriguez.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.leorodriguez.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class EmployeeController {

    public static void main(String[] args) {
          //findEmployeeByName();
        findEmployeeById();
        //showOfficeCodesAsDepartment();

    }

    public static void findEmployeeByName() {//Name must match the name in the employee class
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
            //  Hibernate Named Query

        TypedQuery<Employee>query = session.createNamedQuery("findEmployeeByName", Employee.class);// First the name of the query
        query.setParameter("name","Tom Thele");
        List<Employee> employees=query.getResultList();
        System.out.printf("%-10s%-22s%-14s%-14s%-16s%-10s%-10s%s%n", "ID","Name","Salary", "Job","AddressLine","Zipcode","city","startDate");

        for (Employee e : employees) {//Enhanced for loop to display data
            System.out.printf("%-11d%-22s%-14d%-14s%-16s%-10s%-10s%s%n",e.getId(),e.getName(),e.getSalary(),e.getJob(),e.getAddressLine(),e.getZipcode(),e.getCity(),e.getStartDate());
        }

        factory.close();
        session.close();
    }
    public static void findEmployeeById() {   SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        //Hibernate Named Query
        TypedQuery<Object[]> query = session.createNamedQuery("getEmployeeById", Object[].class);//We use object instead of Employee
        // because we are not using the all of the Employee's data
        query.setParameter("id",3);//telling the query to use the value 3 for the parameter id. id==3
        List<Object[]> employee=  query.getResultList();
        System.out.printf("%-10s%-12s%s%n", "Name","Salary", "Job");

        for (Object[] e : employee) {
            System.out.printf("%-11s%-12s%s%n",e[0],e[1],e[2]);
        }
        factory.close();
        session.close();
    }
    public static void showOfficeCodesAsDepartment() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        //Hibernate Named Query
        TypedQuery<Object[]> query = session.createNamedQuery("employeeDeptAlias", Object[].class);
        List<Object[]> employees  =  query.getResultList();

        System.out.printf("%-15s%-17s%s%n", "OfficeCode","Dep Name","Employee Name");

        for (Object[] e : employees) {
            System.out.printf(" %-15s%-17s%s%n",e[1],e[3],e[2]);
        }

        factory.close();
        session.close();
    }
}



