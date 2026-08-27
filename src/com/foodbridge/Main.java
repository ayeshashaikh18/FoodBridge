package com.foodbridge;

import com.foodbridge.model.FoodDonation;

public class Main {

    public static void main(String[] args) {

        FoodDonation donation1 = new FoodDonation(
                101,
                "Rice",
                "Cooked Food",
                50,
                "kg",
                8,
                "GOOD",
                "D001"
        );

        donation1.displayDonation();
    }
}
