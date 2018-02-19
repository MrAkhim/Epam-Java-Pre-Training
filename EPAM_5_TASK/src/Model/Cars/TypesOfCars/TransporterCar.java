package Model.Cars.TypesOfCars;

import Model.Cars.Automobile.Automobile;

public class TransporterCar extends Automobile {

    public TransporterCar(String model,
                          String carID,
                          double fuelConsumption,
                          double maxCarryingWeight) {
        super(model, carID, fuelConsumption, maxCarryingWeight, 25, 4);
    }
}