package com.pluralsight;
/*Base class (Asset) represents any general asset with basic details like description, date
acquiredand cost.*/
public class Asset {
    //Private instance variable properties, only accessed through getter and setter methods.
    private String description;//Short description of the asset
    private String dateAcquired;//when the asset was acquired
    private double originalCost;//how much the asset originally cost
    /*Constructor for Asset, sets values of descriptions, date Acquired and originalCost when
    an Asset object is created.*/
    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }
    //Getter for description
    public String getDescription() {
        return description;
    }
    //Setter for description
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDateAcquired() {
        return dateAcquired;
    }
    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }
    //Method that returns the value of the asset
    //In the base class, we just return the original cost
    //This method will be overridden by subclasses like House and Vehicle
    public double getValue() {
        return originalCost;
    }
}