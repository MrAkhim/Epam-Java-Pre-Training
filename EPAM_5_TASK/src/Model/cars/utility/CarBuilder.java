package Model.cars.utility;

import Factories.CarrierCarFactory;
import Factories.HatchbackCarFactory;
import Factories.SedanCarFactory;
import Factories.TransporterCarFactory;
import Model.cars.automobile.Automobile;

import java.util.Random;

public class CarBuilder {

    public static Automobile createCar() {
        Random rnd = new Random();
        int number=rnd.nextInt(4);
        switch (number){
            case 0: return TransporterCarFactory.createTransporterCar();
            case 1: return CarrierCarFactory.createCarrierCar();
            case 2: return SedanCarFactory.createHatchbackCar();
            case 3: return HatchbackCarFactory.createHatchbackCar();
        }
        return new Automobile();
    }

}