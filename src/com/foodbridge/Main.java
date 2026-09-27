package com.foodbridge;

import com.foodbridge.model.FoodDonation;
import com.foodbridge.model.Donor;
import com.foodbridge.model.DonorType;
import com.foodbridge.model.NGO;
import com.foodbridge.model.UrgencyLevel;
import java.util.ArrayList;
import com.foodbridge.service.MatchingEngine;

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

        FoodDonation donation2 = new FoodDonation(
        102,
        "Bread",
        "Bakery",
        20,
        "kg",
        5,
        "GOOD",
        "D001"
);

FoodDonation donation3 = new FoodDonation(
        103,
        "Vegetables",
        "Fresh Produce",
        35,
        "kg",
        24,
        "GOOD",
        "D001"
);

FoodDonation donation4 = new FoodDonation(
        104,
        "Meals",
        "Cooked Food",
        40,
        "kg",
        2,
        "GOOD",
        "D001"
);

        ArrayList<FoodDonation> donations = new ArrayList<>();

donations.add(donation1);
donations.add(donation2);
donations.add(donation3);
donations.add(donation4);

System.out.println("Total donations: " + donations.size());

for (FoodDonation donation : donations) {

    System.out.println("Food: " + donation.getFoodName());
    System.out.println("Quantity: "
            + donation.getQuantity() + " " + donation.getUnit());
}

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

        NGO ngo1 = new NGO(
        "N001",
        "Helping Hands",
        "Aurangabad",
        "Cooked Food",
        30,
        "kg",
        UrgencyLevel.HIGH
);
ngo1.displayNGO();

NGO ngo2 = new NGO(
        "N002",
        "Hope Foundation",
        "Aurangabad",
        "Fresh Produce",
        25,
        "kg",
        UrgencyLevel.MEDIUM
);


ArrayList<NGO> ngos = new ArrayList<>();
ngos.add(ngo1);
ngos.add(ngo2);

System.out.println("Total NGOs: " + ngos.size());

for (NGO ngo : ngos) {

    System.out.println("NGO: " + ngo.getName());
    System.out.println("Needs: "
            + ngo.getRequiredQuantity() + " "
            + ngo.getUnit());
    System.out.println("Urgency: " + ngo.getUrgency());
}


// MATCHING ENGINE TEST

MatchingEngine matchingEngine = new MatchingEngine();

boolean match = matchingEngine.isCategoryMatch(donation1, ngo1);
boolean quantityMatch =
        matchingEngine.isQuantitySufficient(donation1, ngo1);
boolean expiryPriority =
        matchingEngine.isMoreUrgent(donation4, donation1);

System.out.println("Donation #104 more urgent than Donation #101: "
        + expiryPriority);
System.out.println("Quantity Sufficient: " + quantityMatch);
System.out.println("Category Match: " + match);

    }
}