package Factories;

import Model.cars.typesOfCars.HatchbackCar;

import java.util.Random;

public class HatchbackCarFactory {
    private static final int MIN_FUEL_CONSUMPTION = 300;
    private static final int MAX_FUEL_CONSUMPTION = 1400;
    private static final int DOORS = 4;
    private static final int MAX_AMOUNT_PASSENGERS = 5;
    private static final int MAX_AMOUNT_ID = 1_000_000;
    private static final int MIN_PRICE = 9_000;
    private static final String MIN_WIFI = "AUTO";

    public static HatchbackCar createHatchbackCar() {
        Random rnd = new Random();
        HatchbackCar hatchbackCar = new HatchbackCar(ModelsOfCars.getCarModel(rnd.nextInt(ModelsOfCars.amountModels)),
                                                     rnd.nextInt(MAX_AMOUNT_ID),
                                                     rnd.nextInt(MAX_FUEL_CONSUMPTION - MIN_FUEL_CONSUMPTION) + MIN_FUEL_CONSUMPTION,
                                                     MIN_PRICE,
                                                     MIN_WIFI + "_" + rnd.nextInt(1000),
                                                     rnd.nextBoolean());
        hatchbackCar.setPrice(MIN_PRICE + hatchbackCar.getFuelConsumption() * 4 + MAX_AMOUNT_PASSENGERS * 0.6);
        return hatchbackCar;
    }
}



