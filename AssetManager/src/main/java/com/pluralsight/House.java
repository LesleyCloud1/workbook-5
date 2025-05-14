package com.pluralsight;

public class House extends Asset { //House class inherits from Asset using the "extends" keyword
   //Extra properties that are specific to a House
    private String address;
    private int condition; //1=excellent, 2=good, 3=fair, 4=poor
    private int squareFoot;//how big the house is
    private int lotSize;//size of the land

    //Constructor for House that also calls the Asset constructor using super ()
    public House(String description, String dateAcquired, double originalCost, String address,
                 int condition, int squareFoot, int lotSize) {
        //call constructor of the parent class (Asset)
        super(description, dateAcquired, originalCost);
        //Set the values for House-specific properties
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    //Getter and setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Getter and setter for condition
    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    //Getter and setter for squareFoot
    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    //Getter and setter for lotSize
    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    //Override the getValue() method from Asset to provide custom logic for House
    @Override
    public double getValue() {
        double valuePerSqFt;

        //Determine value per square foot based on condition
        switch (condition) {
            case 1:
                valuePerSqFt = 180.0;
                break;
            case 2:
                valuePerSqFt = 130.0;
                break;
            case 3:
                valuePerSqFt = 90.0;
                break;
            case 4:
                valuePerSqFt = 80.0;
                break;
            default:
                valuePerSqFt = 0; // handle unexpected values
                break;
        }

        //Calculate total value of the house
        //house value = (squareFoot * value per sq ft) + (lotSize * $0.25)
        return (valuePerSqFt * squareFoot) + (0.25 * lotSize);
    }
}