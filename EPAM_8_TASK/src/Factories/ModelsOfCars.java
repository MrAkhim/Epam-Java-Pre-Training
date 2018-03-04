package Factories;

public class ModelsOfCars {

    enum CarModels {
        OPEL, BMW, CITROEN, FIAT,
        FORD, MAZDA, MITSUBISHI, SKODA,
        RENAULT, PEUGEOT
    }

    public static int amountModels = 10;


    public static String getCarModel(int index) {
        CarModels[] carModels =CarModels.values();
        return carModels[index].toString();
    }
}
