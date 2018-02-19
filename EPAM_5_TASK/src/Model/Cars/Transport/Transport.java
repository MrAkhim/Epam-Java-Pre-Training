package Model.Cars.Transport;

public abstract class Transport {

    protected String ID;
    protected String model;
    protected double fuelConsumption;
    protected double maxCarryingWeight;
    protected int maxPassengers;
    protected int doors;

    protected Transport() {
    }

    protected Transport(String model, String ID, double fuelConsumption, double maxCarryingWeight, int maxPassengers, int doors) {
        this.model = model;
        this.ID = ID;
        this.fuelConsumption = fuelConsumption;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = maxPassengers;
        this.doors = doors;
    }

    public String getID() {
        return ID;
    }

    protected void setID(String carID) {
        this.ID = carID;
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
        return "model: " + model + "\t ID: " + ID + "\t Max Fuel: " + fuelConsumption + "\t Max Carrying Weight: " + maxCarryingWeight +
                "\t Max Passengers: " + maxPassengers + "\t Doors:" + doors;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null) || getClass() != object.getClass()) {
            return false;
        }
        Transport extra = (Transport) object;
        return !(!extra.model.equals(model) || !extra.ID.equals(ID) || extra.fuelConsumption != fuelConsumption ||
                extra.maxCarryingWeight != maxCarryingWeight || extra.maxPassengers != maxPassengers || extra.doors != doors);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 33 + ID.hashCode();
        return hash;
    }
}
