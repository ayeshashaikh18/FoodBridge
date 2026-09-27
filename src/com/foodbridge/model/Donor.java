package com.foodbridge.model;

public class Donor {

    private String donorId;
    private String name;
    private DonorType donorType;
    private String contactNumber;
    private String location;

    public Donor(String donorId, String name, DonorType donorType,
                 String contactNumber, String location) {

        this.donorId = donorId;
        this.name = name;
        this.donorType = donorType;
        this.contactNumber = contactNumber;
        this.location = location;
    }

    public String getDonorId() {
        return donorId;
    }

    public String getName() {
        return name;
    }

    public DonorType getDonorType() {
        return donorType;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDonorType(DonorType donorType) {
        this.donorType = donorType;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayDonor() {

        System.out.println("=================================");
        System.out.println("             DONOR");
        System.out.println("=================================");
        System.out.println("Donor ID      : " + donorId);
        System.out.println("Name          : " + name);
        System.out.println("Donor Type    : " + donorType);
        System.out.println("Contact       : " + contactNumber);
        System.out.println("Location      : " + location);
        System.out.println("=================================");
    }
}