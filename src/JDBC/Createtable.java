package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Createtable {

    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/codebegun_test";
        String userName = "root";
        String password = "Root";

        Connection connection = null;
        Statement statement = null;

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to the database successfully!");

            // Create the statement
            statement = connection.createStatement();

            // SQL query to create table
            String sql = "CREATE TABLE userregistration(" +
                         "id INT NOT NULL, " +
                         "firstname VARCHAR(200), " +
                         "lastname VARCHAR(100), " +
                         "age INT, " +
                         "mobile BIGINT NOT NULL, " +
                         "PRIMARY KEY (id))";

            // Execute the update
            statement.executeUpdate(sql);
            System.out.println("Created table in the given database");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}