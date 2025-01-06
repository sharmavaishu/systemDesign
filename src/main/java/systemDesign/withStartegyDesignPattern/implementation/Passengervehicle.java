package systemDesign.withStartegyDesignPattern.implementation;

import systemDesign.withStartegyDesignPattern.Strategy.NormalDriveStrategy;

public class Passengervehicle extends Vehicle{

     Passengervehicle(){
         super(new NormalDriveStrategy());
     }
}
