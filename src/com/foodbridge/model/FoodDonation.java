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
    private Donor donor;

    // Constructor
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

    // Getters

    public int getDonationId() {
        return donationId;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getCategory() {
        return category;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public int getExpiryHours() {
        return expiryHours;
    }

    public String getQualityStatus() {
        return qualityStatus;
    }

    public String getDonorId() {
        return donorId;
    }
    public Donor getDonor() {
    return donor;
}

    // Setters

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(double quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be greater than zero."
            );
        }

        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setExpiryHours(int expiryHours) {

        if (expiryHours < 0) {
            throw new IllegalArgumentException(
                    "Expiry time cannot be negative."
            );
        }

        this.expiryHours = expiryHours;
    }

    public void setQualityStatus(String qualityStatus) {
        this.qualityStatus = qualityStatus;
    }



    // Business method

    public boolean isExpiringSoon() {
        return expiryHours <= 3;
    }

    // Display method

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
        System.out.println("Expiring Soon : " +
                (isExpiringSoon() ? "YES" : "NO"));
        System.out.println("=================================");
    }

	public void setDonor(Donor donor) {
    this.donor = donor;
}
}