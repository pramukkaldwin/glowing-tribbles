package reminder;

import java.sql.*;

public class ConnectDb {

    public static void main(String[] args) {
        Connection connect = null;
        try {
            String username = "#";
            String password = "#";
            String url = "jdbc:mysql://localhost/dbname";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection(url, url, password);
            System.out.println("Success");
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            System.out.println("failed");
        } finally {
            if (connect != null) {
                try {
                    connect.close();
                    System.out.println("closed");
                } catch (Exception e) {
                    System.out.println("unable to close");
                }
            }
        }
    }
}
