package Model.cars.typesOfCars;

import Model.cars.automobile.Automobile;

import java.util.Objects;
import java.util.Random;

public class SedanCar extends Automobile {

    private static final int MAX_PASSENGERS = 5;
    private static final int DOORS = 4;
    private boolean hasRailings;
    private int comfortRating;

    public SedanCar(String model,
                    String carID,
                    double fuelConsumption) {
        super(model, carID, fuelConsumption, DOORS);
        this.setPrice(10000 + fuelConsumption * 4 + MAX_PASSENGERS * 0.6);
        Random rnd = new Random();
        this.hasRailings = rnd.nextBoolean();
        this.comfortRating = rnd.nextInt(11);
    }

    public SedanCar(String model,
                    String carID,
                    double fuelConsumption,
                    double price,
                    int comfortRating,
                    boolean hasRailings) {
        super(model, carID, fuelConsumption, DOORS);
        this.setPrice(price);
        this.hasRailings = hasRailings;
        this.comfortRating = comfortRating;
    }

    public void setComfortRating(int comfortRating) {
        this.comfortRating = comfortRating;
    }

    public int getComfortRating() {
        return comfortRating;
    }

    public void setHasRailings(boolean hasRailings) {
        this.hasRailings = hasRailings;
    }

    public boolean getHasRailings() {
        return hasRailings;
    }

    @Override
    public String toString() {
        return super.toString() + "\t Railings: " + hasRailings + "\t Comfort Rating: " + comfortRating;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null) || getClass() != object.getClass()) {
            return false;
        }
        SedanCar extra = (SedanCar) object;
        return !(!super.equals(extra) || !Objects.equals(extra.getHasRailings(), hasRailings) || extra.comfortRating != comfortRating);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + comfortRating;

    }

}