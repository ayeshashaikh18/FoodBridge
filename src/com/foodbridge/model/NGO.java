package com.foodbridge.model;

public class NGO {

    private String ngoId;
    private String name;
    private String location;
    private String requiredCategory;
    private double requiredQuantity;
    private String unit;
    private UrgencyLevel urgency;

    public NGO(String ngoId, String name, String location,
           String requiredCategory, double requiredQuantity,
           String unit, UrgencyLevel urgency) {

    this.ngoId = ngoId;
    this.name = name;
    this.location = location;
    this.requiredCategory = requiredCategory;
    setRequiredQuantity(requiredQuantity);
    this.unit = unit;
    this.urgency = urgency;
}

public String getNgoId() {
    return ngoId;
}

public String getName() {
    return name;
}

public String getLocation() {
    return location;
}

public String getRequiredCategory() {
    return requiredCategory;
}

public double getRequiredQuantity() {
    return requiredQuantity;
}

public String getUnit() {
    return unit;
}

public UrgencyLevel getUrgency() {
    return urgency;
}

public void setName(String name) {
    this.name = name;
}

public void setLocation(String location) {
    this.location = location;
}

public void setRequiredCategory(String requiredCategory) {
    this.requiredCategory = requiredCategory;
}

public void setRequiredQuantity(double requiredQuantity) {

    if (requiredQuantity <= 0) {
        throw new IllegalArgumentException(
                "Required quantity must be greater than zero."
        );
    }

    this.requiredQuantity = requiredQuantity;
}

public void setUnit(String unit) {
    this.unit = unit;
}

public void setUrgency(UrgencyLevel urgency) {
    this.urgency = urgency;
}

public void displayNGO() {

    System.out.println("=================================");
    System.out.println("              NGO");
    System.out.println("=================================");
    System.out.println("NGO ID            : " + ngoId);
    System.out.println("Name              : " + name);
    System.out.println("Location          : " + location);
    System.out.println("Required Category : " + requiredCategory);
    System.out.println("Required Quantity : " + requiredQuantity + " " + unit);
    System.out.println("Urgency           : " + urgency);
    System.out.println("=================================");
}

}