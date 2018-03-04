package Model.cars.typesOfCars;

import Model.cars.automobile.Automobile;

import java.util.Objects;
import java.util.Random;

public class HatchbackCar extends Automobile {

    private static final int MAX_PASSENGERS = 5;
    private static final int DOORS = 5;
    private boolean hasBabyCarSeat;
    private String passwordWiFi;

    public HatchbackCar(String model,
                        int carID,
                        double fuelConsumption,
                        int price,
                        String passwordWiFi,
                        boolean hasBabyCarSeat) {
        super(model, carID, fuelConsumption, DOORS);
        this.setPrice(price);
        this.passwordWiFi = this.getID() + "_" + passwordWiFi;
        this.hasBabyCarSeat = hasBabyCarSeat;
    }

    public void setGetHasBabyCarSeat(boolean hasBabyCarSeat) {
        this.hasBabyCarSeat = hasBabyCarSeat;
    }

    public boolean getHasBabyCarSeat() {
        return hasBabyCarSeat;
    }

    public void setGetPasswordWiFi(String passwordWiFi) {
        this.passwordWiFi = passwordWiFi;
    }

    public String getPasswordWiFi() {
        return passwordWiFi;
    }

    @Override
    public String toString() {
        return super.toString() + "\t Password Wi-Fi: " + passwordWiFi + "\t Baby Seat:" + hasBabyCarSeat;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null) || getClass() != object.getClass()) {
            return false;
        }
        HatchbackCar extra = (HatchbackCar) object;
        return !(!super.equals(extra) || !Objects.equals(extra.getPasswordWiFi(), passwordWiFi) || hasBabyCarSeat != extra.hasBabyCarSeat);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + passwordWiFi.hashCode();

    }

}