package systemDesign.withStartegyDesignPattern.implementation;

import systemDesign.withStartegyDesignPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
