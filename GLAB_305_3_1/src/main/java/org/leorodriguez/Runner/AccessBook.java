package org.leorodriguez.Runner;
import org.leorodriguez.Controller.BookDAOImpl;
import org.leorodriguez.daointerface.BookDao;
import org.leorodriguez.model.Books;

import java.sql.SQLException;
import java.util.ArrayList;

public class AccessBook {
    public static void main(String[] args) {
        BookDao bookDao = new BookDAOImpl();

        System.out.println("------Inserting book records-------");

        ArrayList<Books> BookList = new ArrayList<>();

        Books b1 = new Books();
        b1.setIsbn(120);
        b1.setBookName("Java Book");
        BookList.add(b1);

        Books b2 = new Books();
        b2.setIsbn(300);
        b2.setBookName("Python Book");
        BookList.add(b2);

        Books b3 = new Books();
        b3.setIsbn(365);
        b3.setBookName("JavaScript Book");
        BookList.add(b3);

        Books b4 = new Books();
        b4.setIsbn(256);
        b4.setBookName("SQL Book");
        BookList.add(b4);

        bookDao.saveBook(BookList);

        System.out.println("------Display list of all books ---------");

        try{
            for(Books cc : bookDao.getAllBooks()){
                int ISBN = cc.getIsbn();
                String bookName = cc.getBookName();
                System.out.println("ISBN number: " + ISBN+ "and book name: " + bookName);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("-------Book information is updating-------");
        Books BookUpdating = new Books();
        BookUpdating.setIsbn(3);
        BookUpdating.setBookName("Algorithms Book");
        boolean result = bookDao.updateBook(BookUpdating, 3);
        System.out.println(result);

        boolean a = bookDao.deleteBook(4);//4 is the id of the  book
        if (a == true) {
            System.out.println("Book deleted successfully");
        } else {
            System.out.println("Book could not be deleted");
        }
    }
}


