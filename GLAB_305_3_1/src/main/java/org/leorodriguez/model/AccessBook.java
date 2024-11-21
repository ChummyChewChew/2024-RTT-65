package org.leorodriguez.model;

import org.leorodriguez.Controller.BookDAOImpl;
import org.leorodriguez.daointerface.BookDao;

public class AccessBook extends BookDAOImpl {
    static BookDao bookDao = new BookDAOImpl();
    public static void main(String[] args) {

    }
}
