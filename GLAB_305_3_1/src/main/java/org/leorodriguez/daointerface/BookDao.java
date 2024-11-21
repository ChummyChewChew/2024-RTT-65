package org.leorodriguez.daointerface;
import  java.sql.SQLException;
import java.util.List;
import org.leorodriguez.model.Books;

public interface BookDao {
    //This is used to list all records from the book table.
    List<Books> getAllBooks() throws ClassNotFoundException, SQLException;
    //This method to be used to create a record in the book table
    void saveBook(List<Books> BookList);

    //Delete a book given a id
    boolean deleteBook(int id);

    //Update a book records in the table
    boolean updateBook(Books book, int id);


}
