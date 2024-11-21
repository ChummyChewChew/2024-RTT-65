package org.leorodriguez;
import java.sql.*;
public class SQStatements extends PrepareSQL {
    public static void main(String[] args) {
        Connection con = null; //Creating a connection from Java to the database
        PreparedStatement prepStmt = null;//The object that allows us to prepare out query and executes
        ResultSet rs = null;
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user= "root";
        String password = "HandofEvil369";


        try{con = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connection established successfully!");
            //String sql = "select * from employees";

            prepStmt = con.prepareStatement (PrepareSQL.officeCode());
            rs = prepStmt.executeQuery ();
            while (rs.next()) {
                int id =rs.getInt ("employeeNumber");
                String name =rs.getString("firstName");
                String lastName =rs.getString("lastName");
                System.out.println(id + " " + name + " " + lastName);
            }
            prepStmt = con.prepareStatement(PrepareSQL.GetEmployeeByOfficeNumber);
            prepStmt.setInt(1, 1);
            prepStmt.setInt(2, 4);
            rs = prepStmt.executeQuery ();
            while (rs.next()) {
                int id =rs.getInt ("employeeNumber");
                String name =rs.getString("firstName");
                String lastName =rs.getString("lastName");
                System.out.println(id + " " + name + " " + lastName);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        try {
            prepStmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

