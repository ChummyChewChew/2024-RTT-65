package org.leorodriguez.Controller;
import java.awt.print.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.leorodriguez.daointerface.BookDao;
import org.leorodriguez.daointerface.ConnectionDAO;
import org.leorodriguez.model.Books;

public class BookDAOImpl extends ConnectionDAO implements BookDao {
    public void saveBook(List<Books> BookList){
        try{
            Connection con = ConnectionDAO.getConnection();
            for(Books b: BookList){
                String sqlQuery = "INSERT INTO books (isbn, bookName) VALUES (?,?)";
                PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
                prepStmt.setInt(1, b.getIsbn());
                prepStmt.setString(2, b.getBookName());
                int affectedRows =prepStmt.executeUpdate();
                System.out.println(affectedRows+" rows affected!");
            }
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    public List<Books> getAllBooks(){
        try{
            Connection connection = ConnectionDAO.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");
            List boolist = new ArrayList();
            while(rs.next()){
                Books b = new Books();
                b.setIsbn(rs.getInt("isbn"));
                b.setBookName(rs.getString("bookName") );
                boolist.add(b);
            }
            return boolist;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();{

            }
        } return null;
    }
    public boolean updateBook(Books bookObj, int id){
        try{
            Connection connection = ConnectionDAO.getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE books SET isbn =?, bookName =? WHERE id =?");
            ps.setInt(1, bookObj.getIsbn());
            ps.setString(2, bookObj.getBookName());
            ps.setInt(3, id);
            int i = ps.executeUpdate();
            if(i ==1){
                return true;
            }
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
        return false;
    }
    public boolean deleteBook(int id){
        try{
            Connection connection = ConnectionDAO.getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM books WHERE id=?");
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if(i == 1){
                return true;
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } return false;
    }

}
