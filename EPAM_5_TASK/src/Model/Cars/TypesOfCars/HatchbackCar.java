package Model.Cars.TypesOfCars;

import Model.Cars.Automobile.Automobile;

public class HatchbackCar extends Automobile {

    public HatchbackCar(String model,
                        String carID,
                        double fuelConsumption,
                        double maxCarryingWeight) {
        super(model, carID, fuelConsumption, maxCarryingWeight, 5, 5);
    }
}