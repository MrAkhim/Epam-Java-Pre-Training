package Model.cars.typesOfCars;

import Model.cars.automobile.Automobile;

import java.util.Objects;
import java.util.Random;

public class SedanCar extends Automobile {

    private static final int DOORS = 4;
    private boolean hasRailings;
    private int comfortRating;

    public SedanCar(String model,
                    int carID,
                    double fuelConsumption,
                    int price,
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