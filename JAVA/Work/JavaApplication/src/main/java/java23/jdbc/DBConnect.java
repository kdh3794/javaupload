package java23.jdbc;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DBConnect {
    public static java.sql.Connection connectionMySQL(){
    String url = "jdbc:mysql://localhost:3306/book_db";
    String user = "root";
    String password = "1234";
    java.sql.Connection conn = null;
    
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);
    } catch (ClassNotFoundException e){
        e.printStackTrace();
    } catch (java.sql.SQLException e){
        e.printStackTrace();
    }
    return conn;
}

 
public static java.sql.Connection makeConnection(){
    return connectionMySQL();
}

}
