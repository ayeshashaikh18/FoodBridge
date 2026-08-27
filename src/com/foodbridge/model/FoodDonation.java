package com.foodbridge.model;

public class FoodDonation {

    private int donationId;
    private String foodName;
    private String category;
    private double quantity;
    private String unit;
    private int expiryHours;
    private String qualityStatus;
    private String donorId;

    public FoodDonation(int donationId, String foodName, String category,
                        double quantity, String unit, int expiryHours,
                        String qualityStatus, String donorId) {

        this.donationId = donationId;
        this.foodName = foodName;
        this.category = category;
        this.quantity = quantity;
        this.unit = unit;
        this.expiryHours = expiryHours;
        this.qualityStatus = qualityStatus;
        this.donorId = donorId;
    }

    public void displayDonation() {
        System.out.println("=================================");
        System.out.println("        FOOD DONATION");
        System.out.println("=================================");
        System.out.println("Donation ID   : " + donationId);
        System.out.println("Food          : " + foodName);
        System.out.println("Category      : " + category);
        System.out.println("Quantity      : " + quantity + " " + unit);
        System.out.println("Expires in    : " + expiryHours + " hours");
        System.out.println("Quality       : " + qualityStatus);
        System.out.println("Donor ID      : " + donorId);
        System.out.println("=================================");
    }
}