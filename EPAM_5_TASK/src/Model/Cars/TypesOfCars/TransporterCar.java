package Model.cars.typesOfCars;

import Model.cars.automobile.Automobile;

import java.util.Random;

public class TransporterCar extends Automobile {

    private double maxCarryingWeight;
    private static final int DOORS = 4;
    private int amountHeavers;

    public TransporterCar(String model,
                          String carID,
                          double fuelConsumption,
                          double maxCarryingWeight) {
        super(model, carID, fuelConsumption, DOORS);
        this.setPrice(35000 + maxCarryingWeight * 0.5 + fuelConsumption * 4);
        this.maxCarryingWeight = maxCarryingWeight;
        Random rnd = new Random();
        this.amountHeavers = rnd.nextInt(4);
    }

    public double getMaxCarryingWeight() {
        return maxCarryingWeight;
    }

    protected void setMaxCarryingWeight(double maxCarryingWeight) {
        this.maxCarryingWeight = maxCarryingWeight;
    }

    public int getAmountHeavers() {
        return amountHeavers;
    }

    protected void setAmountHeavers(int amountHeavers) {
        this.amountHeavers = amountHeavers;
    }

    @Override
    public String toString() {
        return super.toString() + "\t maxCarryingWeight: " + maxCarryingWeight + "\t Heavers: " + amountHeavers;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null) || getClass() != object.getClass()) {
            return false;
        }
        TransporterCar extra = (TransporterCar) object;
        return !(!super.equals(extra) || extra.getMaxCarryingWeight() != maxCarryingWeight || amountHeavers != extra.amountHeavers);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (int) maxCarryingWeight + amountHeavers;

    }


}