package Factories;

import Model.cars.typesOfCars.SedanCar;
import java.util.Random;

public class SedanCarFactory {

    private static final int MIN_FUEL_CONSUMPTION = 300;
    private static final int MAX_FUEL_CONSUMPTION = 1400;
    private static final int MIN_COMFORT_RATING = 1;
    private static final int MAX_COMFORT_RATING = 10;
    private static final int MAX_AMOUNT_PASSENGERS = 5;
    private static final int MAX_AMOUNT_ID = 1_000_000;
    private static final int MIN_PRICE = 10_000;

    public static SedanCar createHatchbackCar() {
        Random rnd = new Random();
        SedanCar sedanCar = new SedanCar(ModelsOfCars.getCarModel(rnd.nextInt(ModelsOfCars.amountModels)),
                                        rnd.nextInt(MAX_AMOUNT_ID),
                                        rnd.nextInt(MAX_FUEL_CONSUMPTION - MIN_FUEL_CONSUMPTION) + MIN_FUEL_CONSUMPTION,
                                        MIN_PRICE,
                                        rnd.nextInt(MAX_COMFORT_RATING - MIN_COMFORT_RATING) +MIN_COMFORT_RATING,
                                        rnd.nextBoolean());
        sedanCar.setPrice((int) (MIN_PRICE + sedanCar.getFuelConsumption() * 4 + MAX_AMOUNT_PASSENGERS * 0.6));
        return sedanCar;
    }
}
