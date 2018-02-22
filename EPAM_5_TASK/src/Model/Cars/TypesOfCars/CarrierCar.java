package Model.cars.typesOfCars;

import Model.cars.automobile.Automobile;

import java.util.Random;

public class CarrierCar extends Automobile {

    private static final int DOORS = 4;
    private int driverRating;
    private int maxPassenger;

    public CarrierCar(String model,
                      String carID,
                      double fuelConsumption,
                      int maxPassengers) {
        super(model, carID, fuelConsumption, DOORS);
        this.setPrice(30000 + fuelConsumption * 4 + maxPassengers * 0.6);
        this.maxPassenger = maxPassengers;
        Random rnd = new Random();
        this.driverRating = rnd.nextInt(11);
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    @Override
    public String toString() {
        return super.toString() + "\t Driver Rating: " + driverRating + "\t Max Passenger: " + maxPassenger;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null) || getClass() != object.getClass()) {
            return false;
        }
        CarrierCar extra = (CarrierCar) object;
        return !(!super.equals(extra) || extra.driverRating != driverRating || extra.maxPassenger != maxPassenger);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + driverRating;

    }
}