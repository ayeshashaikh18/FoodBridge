package com.foodbridge.service;

import com.foodbridge.model.FoodDonation;
import com.foodbridge.model.NGO;
import java.util.List;

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

    
public boolean isEligibleMatch(FoodDonation donation, NGO ngo) {

    boolean categoryMatch = isCategoryMatch(donation, ngo);

    boolean quantityMatch = isQuantitySufficient(donation, ngo);

    boolean notExpired = donation.getExpiryHours() > 0;

    boolean goodQuality = donation.getQualityStatus()
            .equalsIgnoreCase("GOOD");

    boolean sameUnit = donation.getUnit()
            .equalsIgnoreCase(ngo.getUnit());

    return categoryMatch
            && quantityMatch
            && notExpired
            && goodQuality
            && sameUnit;
}


public FoodDonation findBestDonation(
        List<FoodDonation> donations, NGO ngo) {

    FoodDonation bestDonation = null;

    for (FoodDonation donation : donations) {

        if (isEligibleMatch(donation, ngo)) {

            if (bestDonation == null
                    || donation.getExpiryHours()
                    < bestDonation.getExpiryHours()) {

                bestDonation = donation;
            }
        }
    }

    return bestDonation;
}

}