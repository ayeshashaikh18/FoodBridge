
package com.foodbridge;

import com.foodbridge.service.DonationDAO;

public class DonationTest {

    public static void main(String[] args) {
        DonationDAO donationDAO = new DonationDAO();
        donationDAO.displayAllDonations();
    }
}
