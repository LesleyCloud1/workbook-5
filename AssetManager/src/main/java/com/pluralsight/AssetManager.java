package com.pluralsight;
import java.util.ArrayList;
public class AssetManager {
public static void main(String[] args) {
//create list to store all Asset objects(house and vehicle)
ArrayList<Asset> assets = new ArrayList<>();
//Add house objects to the list
assets.add(new House("My house", "2025-05-14", 500000,
"1801 Pearl St", 1, 2000, 8000));
assets.add(new House("Tulum Beach House", "2025-05-14", 500000,
"Carretera Tulum km7.2", 2, 1500, 6000));
//Add Vehicle objects to list
assets.add(new Vehicle("Lesley's Truck", "2024-04-04", 100000,
"GMC Sierra AT4X", 2024, 10000));
assets.add(new Vehicle("Lesley's Tesla", "2024-01-01", 70000,
"Tesla Ymodel", 2024, 30000));
//Loop through assets and display its information
for (Asset asset : assets) {
System.out.println("Description: " + asset.getDescription());
System.out.println("Date Acquired: " + asset.getDateAcquired());
System.out.printf("Original Cost: $%.2f\n", asset.getOriginalCost());
System.out.printf("Current Value: $%.2f\n", asset.getValue());


//Check if the asset is a House
    if (asset instanceof House) {
        House house = (House) asset; // downcast to House
        System.out.println("Address: " + house.getAddress());
    }
//Check if the asset is a Vehicle
    else if (asset instanceof Vehicle) {
        Vehicle vehicle = (Vehicle) asset; // downcast to Vehicle
        System.out.println("Make/Model: " + vehicle.getMakeModel());
        System.out.println("Year: " + vehicle.getYear());
    }

    System.out.println(); // blank line for separation
}
}
}