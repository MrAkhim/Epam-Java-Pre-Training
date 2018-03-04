package Model.cars.typesOfCars;

import Model.cars.automobile.Automobile;

public class TransporterCar extends Automobile {
    private double maxCarryingWeight;
    private static final int DOORS = 4;
    private int amountHeavers;


    public TransporterCar(String model,
                          int carID,
                          double fuelConsumption,
                          double maxCarryingWeight,
                          int price,
                          int amountHeavers) {
        super(model, carID, fuelConsumption, DOORS);
        this.setPrice(price);
        this.maxCarryingWeight = maxCarryingWeight;
        this.amountHeavers = amountHeavers;
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