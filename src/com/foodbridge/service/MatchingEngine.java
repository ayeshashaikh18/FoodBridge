package com.foodbridge.service;

import com.foodbridge.model.FoodDonation;
import com.foodbridge.model.NGO;

public class MatchingEngine {

    public boolean isCategoryMatch(FoodDonation donation, NGO ngo) {

        return donation.getCategory()
                .equalsIgnoreCase(ngo.getRequiredCategory());
    }

    public boolean isQuantitySufficient(FoodDonation donation, NGO ngo) {

        return donation.getQuantity() >= ngo.getRequiredQuantity();
    }

    public boolean isMoreUrgent(FoodDonation donation1,
                                 FoodDonation donation2) {

        return donation1.getExpiryHours()
                < donation2.getExpiryHours();
    }
}