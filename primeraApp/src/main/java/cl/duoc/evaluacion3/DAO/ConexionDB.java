
package cl.duoc.evaluacion3.DAO;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConexionDB {
    Connection connection;
    
    
    public ConexionDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/moviesdb",
                "root",
                "");
        } catch (Exception ex) {
            System.out.println("Error en BD");
        }
    }    
    public int InsertarQuery(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeUpdate(sql);
    }           
    public ResultSet ConsultarQuery(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    } 
    
  
}
