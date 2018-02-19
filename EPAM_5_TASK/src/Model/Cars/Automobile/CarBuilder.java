package Model.Cars.Automobile;

import Model.Cars.TypesOfCars.HatchbackCar;
import Model.Cars.TypesOfCars.SedanCar;
import Model.Cars.TypesOfCars.UniversalCar;
import Model.Cars.TypesOfCars.CarrierCar;
import Model.Cars.TypesOfCars.TransporterCar;

public class CarBuilder {

    public static Automobile createCar(String model, String carID, double fuelConsumption, double maxCarryingWeight, int maxPassengers, int doors) {
        Automobile currentCar;
        if (maxCarryingWeight > 1400) {
            if (maxPassengers > 20) {
                currentCar = new TransporterCar( model,carID, fuelConsumption, maxCarryingWeight);

            } else {
                currentCar = new CarrierCar( model,carID, fuelConsumption, maxCarryingWeight, maxPassengers);
            }
            currentCar.price = 30000 + maxCarryingWeight * 0.5 +fuelConsumption*4 +maxPassengers*0.6;

        } else {
            if (maxPassengers >= 7) {
                currentCar = new UniversalCar( model,carID, fuelConsumption, maxCarryingWeight, maxPassengers);
                currentCar.price = 12500 + maxCarryingWeight* 0.5 +fuelConsumption*4 +maxPassengers*0.6;

            } else {
                if (doors == 4) {
                    currentCar = new SedanCar(model,carID, fuelConsumption, maxCarryingWeight);
                } else {
                    currentCar = new HatchbackCar( model,carID,fuelConsumption, maxCarryingWeight);
                }
                currentCar.price = 9000 + maxCarryingWeight * 0.5 +fuelConsumption*4 +maxPassengers*0.6;
            }
        }
        currentCar.setPrice(Math.round(currentCar.price * 100) / 100.0);
        return currentCar;
    }

    public static Automobile createCar(Automobile automobile){
        return CarBuilder.createCar(automobile.getModel(), automobile.getCarID(), automobile.getFuelConsumption(),automobile.getMaxCarryingWeight(), automobile.getMaxPassengers(),automobile.getDoors());
    }
}