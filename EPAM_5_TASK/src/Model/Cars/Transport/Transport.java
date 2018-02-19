package Model.Cars.Transport;

public abstract class Transport {

    private String ID;
    private String model;
    private double fuelConsumption;
    private double maxCarryingWeight;
    private int maxPassengers;
    private int doors;

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
    protected void setModel(String model) {
        this.model = model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getMaxCarryingWeight() {
        return maxCarryingWeight;
    }
    protected void setMaxCarryingWeight(double maxCarryingWeight) {
        this.maxCarryingWeight = maxCarryingWeight;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
    protected void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getDoors() {
        return doors;
    }
    protected void setDoors(int doors) {
        this.doors = doors;
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
