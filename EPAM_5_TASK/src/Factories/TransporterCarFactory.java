package Factories;

import Model.cars.typesOfCars.TransporterCar;

import java.util.Random;

public class TransporterCarFactory {
    private static final int MIN_FUEL_CONSUMPTION = 1400;
    private static final int MAX_FUEL_CONSUMPTION = 15_000;
    private static final int MIN_CARRYING_WEIGHT = 1;
    private static final int MAX_CARRYING_WEIGHT = 20_000;
    private static final int MAX_AMOUNT_ID = 1_000_000;
    private static final int MIN_PRICE = 40_000;
    private static final int MAX_AMOUNT_HEAVERS = 4;

    public static TransporterCar createTransporterCar() {
        Random rnd = new Random();
        TransporterCar transporterCar = new TransporterCar(ModelsOfCars.getCarModel(rnd.nextInt(ModelsOfCars.amountModels)),
                rnd.nextInt(MAX_AMOUNT_ID),
                rnd.nextInt(MAX_FUEL_CONSUMPTION - MIN_FUEL_CONSUMPTION) + MIN_FUEL_CONSUMPTION,
                rnd.nextInt(MAX_CARRYING_WEIGHT - MIN_CARRYING_WEIGHT) + MIN_CARRYING_WEIGHT,
                MIN_PRICE,
                rnd.nextInt(MAX_AMOUNT_HEAVERS));
        transporterCar.setPrice(MIN_PRICE + transporterCar.getFuelConsumption() * 4 + transporterCar.getMaxCarryingWeight() * 0.6);
        return transporterCar;
    }
}
