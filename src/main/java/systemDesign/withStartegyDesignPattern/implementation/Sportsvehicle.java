package systemDesign.withStartegyDesignPattern.implementation;

import systemDesign.withStartegyDesignPattern.Strategy.SportsDriveStrategy;

public class Sportsvehicle extends Vehicle{

   public Sportsvehicle(){
        super(new SportsDriveStrategy());
    }
}
