package Factories;

import Model.cars.typesOfCars.CarrierCar;

import java.util.Random;

public class CarrierCarFactory {
    private static final int MIN_FUEL_CONSUMPTION = 1400;
    private static final int MAX_FUEL_CONSUMPTION = 10_000;
    private static final int DOORS = 4;
    private static final int MIN_DRIVER_RATING = 1;
    private static final int MAX_DRIVER_RATING = 10;
    private static final int MAX_AMOUNT_PASSENGERS = 30;
    private static final int MAX_AMOUNT_ID = 1_000_000;
    private static final int MIN_PRICE = 30_000;

    public static CarrierCar createCarrierCar() {
        Random rnd = new Random();
        CarrierCar carrierCar = new CarrierCar(ModelsOfCars.getCarModel(rnd.nextInt(ModelsOfCars.amountModels)),
                rnd.nextInt(MAX_AMOUNT_ID),
                rnd.nextInt(MAX_FUEL_CONSUMPTION - MIN_FUEL_CONSUMPTION) + MIN_FUEL_CONSUMPTION,
                rnd.nextInt(MAX_AMOUNT_PASSENGERS),
                MIN_PRICE,
                rnd.nextInt(MAX_DRIVER_RATING - MIN_DRIVER_RATING) + MIN_DRIVER_RATING);
        carrierCar.setPrice(MIN_PRICE + carrierCar.getFuelConsumption() * 4 + carrierCar.getMaxPassenger() * 0.6);
        return carrierCar;
    }
}







