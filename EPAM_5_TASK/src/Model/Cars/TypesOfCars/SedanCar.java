package Model.Cars.TypesOfCars;

import Model.Cars.Automobile.Automobile;

public class SedanCar extends Automobile {

    public SedanCar (String model,
                     String carID,

                     double fuelConsumption,
                     double maxCarryingWeight) {
        super(model,carID,  fuelConsumption, maxCarryingWeight);
        this.maxPassengers = 5;
        this.doors = 4;
    }
}