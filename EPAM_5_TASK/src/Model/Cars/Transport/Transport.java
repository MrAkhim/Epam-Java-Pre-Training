package Model.Cars.Transport;

public abstract class Transport {

    protected String carID;
    protected String model;
    protected double fuelConsumption;
    protected double maxCarryingWeight;
    protected int maxPassengers;
    protected int doors;

    protected Transport() {
    }

    protected Transport(String model, String carID, double fuelConsumption, double maxCarryingWeight, int maxPassengers, int doors) {
        this.model = model;
        this.carID = carID;
        this.fuelConsumption = fuelConsumption;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = maxPassengers;
        this.doors = doors;
    }

    public String getCarID() {
        return carID;
    }

    protected void setCarID(String carID) {
        this.carID = carID;
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getMaxCarryingWeight() {
        return maxCarryingWeight;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "model: " + model + "\t ID: " + carID + "\t Max Fuel: " + fuelConsumption + "\t Max Carrying Weight: " + maxCarryingWeight +
                "\t Max Passengers: " + maxPassengers + "\t Doors:" + doors;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null) || getClass() != object.getClass()) {
            return false;
        }
        Transport extra = (Transport) object;
        return !(!extra.model.equals(model) || !extra.carID.equals(carID) || extra.fuelConsumption != fuelConsumption ||
                extra.maxCarryingWeight != maxCarryingWeight || extra.maxPassengers != maxPassengers || extra.doors != doors);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 33 + carID.hashCode();
        return hash;
    }
}
