package org.section25.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestMySQLQuery {

    public static void main(String[] args) {

        // Step 1: Define connection parameters

        String jdbcURL = "jdbc:mysql://localhost:3306/ramya_data_lab";
        String username = "root";
        String password = "Amyra@100598";

        // Step 2: Write the SQL query

        String query = "SELECT * FROM food";

        // Step 3: Use try-with-resources to manage resources automatically

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            System.out.println("Query executed successfully!");
            // Step 4: Print query results

            System.out.println(" Id        name         price");
            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");

                System.out.println(" "+ id +" " +name +"     "+price);

            }
            // Step 5: Handle exceptions
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

