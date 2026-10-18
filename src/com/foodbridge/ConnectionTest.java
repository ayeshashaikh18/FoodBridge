
package com.foodbridge;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {

    public static void main(String[] args) {

        try (Connection connection =
                     DatabaseConnection.getConnection()) {

            System.out.println("Connected to MySQL successfully!");
            System.out.println(
                    "Database: "
                    + connection.getCatalog()
            );

        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}
