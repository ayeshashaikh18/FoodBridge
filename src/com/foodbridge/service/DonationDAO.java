
package com.foodbridge.service;

import com.foodbridge.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DonationDAO {

    public void displayAllDonations() {

        String sql = """
                SELECT donation_id, food_name, category,
                       quantity, unit, expiry_hours, quality_status
                FROM food_donations
                ORDER BY expiry_hours ASC
                """;

        try (
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery()
        ) {
            System.out.println("\n--- DONATIONS FROM MYSQL ---");

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("donation_id") + " | "
                        + resultSet.getString("food_name") + " | "
                        + resultSet.getString("category") + " | "
                        + resultSet.getDouble("quantity") + " "
                        + resultSet.getString("unit") + " | Expires in "
                        + resultSet.getInt("expiry_hours") + " hours"
                );
            }

        } catch (SQLException e) {
            System.out.println("Could not retrieve donations: "
                    + e.getMessage());
        }
    }
}
