package Model.cars.typesOfCars;

import Model.cars.automobile.Automobile;

public class CarrierCar extends Automobile {

    private static final int DOORS = 4;
    private int driverRating;
    private int maxPassenger;

    public CarrierCar(String model,
                      int carID,
                      double fuelConsumption,
                      int maxPassengers,
                      int price,
                      int driverRating) {
        super(model, carID, fuelConsumption, DOORS);
        this.setPrice(price);
        this.maxPassenger = maxPassengers;
        this.driverRating = driverRating;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setDriverRating(int driverRating) {
        this.driverRating = driverRating;
    }

    public int getDriverRating() {
        return driverRating;
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