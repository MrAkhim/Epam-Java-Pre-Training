package Model.Cars.TypesOfCars;

import Model.Cars.Automobile.Automobile;

public class CarrierCar extends Automobile {

    public CarrierCar(String model,
                      String carID,
                      double fuelConsumption,
                      double maxCarryingWeight,
                      int maxPassengers) {
        super(model, carID, fuelConsumption, maxCarryingWeight, maxPassengers, 4);
    }
}