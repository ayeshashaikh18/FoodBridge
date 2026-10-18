
package com.foodbridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/foodbridge_db";

    private static final String USER = "root";

    public static Connection getConnection() throws SQLException {
        String password = System.getenv("FOODBRIDGE_DB_PASSWORD");

        if (password == null || password.isBlank()) {
            throw new SQLException(
                    "FOODBRIDGE_DB_PASSWORD environment variable is not set."
            );
        }

        return DriverManager.getConnection(URL, USER, password);
    }
}
