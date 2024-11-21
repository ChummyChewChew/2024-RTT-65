package org.leorodriguez.daointerface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionDAO {
    static Connection con = null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;
    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        final String DBURL = "jdbc:mysql://localhost:3306/library";
        final String DBUSERNAME = "root";
        final String DBPASSWORD = "HandofEvil369";
        try {
            con = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
            System.out.println("Connected to database");
        }catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return con;
    }
    public void disconnect(){
        try{
            if (rs != null){
                rs.close();
            }
            if (ps != null){
                ps.close();
            }
            if (con != null){
                con.close();
            }
        }catch (SQLException e){

        }
    }
}
