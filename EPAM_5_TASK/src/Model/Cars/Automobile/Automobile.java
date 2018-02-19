package Model.Cars.Automobile;

import Model.Cars.Transport.Transport;

public class Automobile extends Transport {
    private double price;

    public Automobile() {
        super();
        price = 0;
    }

    public Automobile(String model, String carID, double fuelConsumption, double maxCarryingWeight, int maxPassengers, int doors) {
        super(model, carID, fuelConsumption, maxCarryingWeight, maxPassengers, doors);
        price = 0;
    }

    public double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + "\t Price: " + price;
    }

    @Override
    public boolean equals(Object object) {
        Automobile extra = (Automobile) object;
        return super.equals(object) && extra.price == price;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
