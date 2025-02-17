package org.section25.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySQLConnection {

    public static void main(String[] args) {

        System.out.println("Driver → Connection → Query → Execute → Process → Close\n");
        String jdbcURL = "jdbc:mysql://localhost:3306/ramya_data_lab";
        String username = "root";
        String password = "Amyra@100598";


        String query = "SELECT * FROM food";

        try {
            // Explicitly load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
                System.out.println("Connection successful!");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
