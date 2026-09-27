package com.foodbridge;

import com.foodbridge.model.FoodDonation;
import com.foodbridge.model.Donor;
import com.foodbridge.model.DonorType;

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

        Donor donor1 = new Donor(
                "D001",
                "Royal Restaurant",
                DonorType.RESTAURANT,
                "9876543210",
                "Aurangabad"
        );

        donation1.setDonor(donor1);

        System.out.println("Donation was made by: "
                + donation1.getDonor().getName());

        donor1.displayDonor();
    }
}