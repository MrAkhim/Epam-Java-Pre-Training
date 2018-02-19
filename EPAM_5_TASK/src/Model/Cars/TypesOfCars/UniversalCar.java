package Model.Cars.TypesOfCars;

import Model.Cars.Automobile.Automobile;

public class UniversalCar extends Automobile {

    public UniversalCar(String model,
            String carID,

                        double fuelConsumption,
                        double maxCarryingWeight,
                        int maxPassengers) {
        super(model,carID,  fuelConsumption, maxCarryingWeight, maxPassengers, 0);
        this.doors = 5;
    }
}
