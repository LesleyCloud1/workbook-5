package com.pluralsight;

//Vehicle class inherits from Asset and adds car-specific details
public class Vehicle extends Asset {
    private String makeModel;  //car make and model, like "Toyota Corolla"
    private int year;          //the year the car was made
    private int odometer;      //number of miles the vehicle has been driven

    //Constructor that sets all fields, including those from Asset
    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {
        //Call the constructor of Asset to set shared fields
        super(description, dateAcquired, originalCost);
        //Set vehicle-specific fields
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    //Getter and setter for makeModel
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    //Getter and setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Getter and setter for odometer
    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    //Override getValue to provide special logic for vehicles
    @Override
    public double getValue() {
        int currentYear = 2025;
        int age = currentYear - year;
        double value;

        //Calculate depreciation based on vehicle age
        if (age <= 3) {
            value = getOriginalCost() * Math.pow(0.97, age); //3% drop per year
        } else if (age <= 6) {
            value = getOriginalCost() * Math.pow(0.97, 3) * Math.pow(0.94, age - 3); //next 3 years at 6%
        } else if (age <= 10) {
            value = getOriginalCost() * Math.pow(0.97, 3) * Math.pow(0.94, 3) * Math.pow(0.92, age - 6); //next 4 years at 8%
        } else {
            value = 1000.0; //Vehicles older than 10 years are worth $1000
        }
        //Apply extra depreciation for high mileage unless it’s a Honda or Toyota
        if (odometer > 100000 &&
                !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value *= 0.75; //reduce value by 25%
        }

        return value;
    }
}