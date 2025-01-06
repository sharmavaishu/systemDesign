package systemDesign.withStartegyDesignPattern.implementation;

import systemDesign.withStartegyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    // constructor injection
    Vehicle(DriveStrategy driveobj){
        this.driveStrategy = driveobj;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
