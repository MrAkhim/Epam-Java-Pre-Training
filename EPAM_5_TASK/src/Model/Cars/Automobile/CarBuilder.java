package Model.Cars.Automobile;

import Model.Cars.TypesOfCars.HatchbackCar;
import Model.Cars.TypesOfCars.SedanCar;
import Model.Cars.TypesOfCars.UniversalCar;
import Model.Cars.TypesOfCars.CarrierCar;
import Model.Cars.TypesOfCars.TransporterCar;

public class CarBuilder {

    public static Automobile createCar(Automobile automobile) {
        Automobile currentCar;
        if (automobile.getMaxCarryingWeight() > 1400) {
            if (automobile.getMaxPassengers() > 20) {
                currentCar = new TransporterCar( automobile.getModel(),automobile.getCarID(), automobile.getFuelConsumption(), automobile.getMaxCarryingWeight());

            } else {
                currentCar = new CarrierCar( automobile.getModel(),automobile.getCarID(), automobile.getFuelConsumption(),
                        automobile.getMaxCarryingWeight(), automobile.getMaxPassengers());
            }
            currentCar.price = 30000 + automobile.getMaxCarryingWeight() * 0.5 +automobile.getFuelConsumption()*4 +automobile.getMaxPassengers()*0.6;

        } else {
            if (automobile.getMaxPassengers() >= 7) {
                currentCar = new UniversalCar( automobile.getModel(),automobile.getCarID(), automobile.getFuelConsumption(),
                        automobile.getMaxCarryingWeight(), automobile.getMaxPassengers());
                currentCar.price = 12500 + automobile.getMaxCarryingWeight() * 0.5 +automobile.getFuelConsumption()*4 +automobile.getMaxPassengers()*0.6;

            } else {
                if (automobile.getDoors() == 4) {
                    currentCar = new SedanCar( automobile.getModel(),automobile.getCarID(), automobile.getFuelConsumption(), automobile.getMaxCarryingWeight());
                } else {
                    currentCar = new HatchbackCar( automobile.getModel(),automobile.getCarID(), automobile.getFuelConsumption(), automobile.getMaxCarryingWeight());
                }
                currentCar.price = 9000 + automobile.getMaxCarryingWeight() * 0.5 +automobile.getFuelConsumption()*4 +automobile.getMaxPassengers()*0.6;
            }
        }
        currentCar.setPrice(Math.round(currentCar.price * 100) / 100.0);
        return currentCar;
    }
}