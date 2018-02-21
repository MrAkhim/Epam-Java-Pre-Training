package Model.cars.utility;

import Model.cars.automobile.Automobile;
import Model.cars.typesOfCars.CarrierCar;
import Model.cars.typesOfCars.HatchbackCar;
import Model.cars.typesOfCars.TransporterCar;
import Model.cars.typesOfCars.SedanCar;
public class CarBuilder {

    public static Automobile createCar(String model, String ID, double fuelConsumption, double extraInformation, int doors) {
        Automobile currentCar;
        if (fuelConsumption > 1400) {
            if (doors == 4) {
                currentCar = new TransporterCar(model, ID, fuelConsumption, extraInformation);
            } else {
                currentCar = new CarrierCar(model, ID, fuelConsumption, (int)extraInformation);
            }

        } else {
                if (doors == 4) {
                    currentCar = new SedanCar(model, ID, fuelConsumption, extraInformation);
                } else {
                    currentCar = new HatchbackCar(model, ID, fuelConsumption, extraInformation);
                }

            }
        currentCar.setPrice(Math.round(currentCar.getPrice() * 100) / 100.0);
        return currentCar;
    }

    public static Automobile createCar(Automobile automobile) {
        return CarBuilder.createCar(automobile.getModel(), automobile.getID(), automobile.getFuelConsumption(), automobile.getExtraInformation(), automobile.getDoors());
    }
}