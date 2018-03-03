package Model.cars.transport;

public abstract class Transport {

    private int ID;
    private String model;

    protected Transport() {
    }

    protected Transport(String model, int ID) {
        this.model = model;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    protected void setID(int carID) {
        this.ID = carID;
    }

    public String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "model: " + model + "\t ID: " + ID;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null) || getClass() != object.getClass()) {
            return false;
        }
        Transport extra = (Transport) object;
        return !(!extra.model.equals(model) || extra.ID != ID);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 33 + ID + model.hashCode();
        return hash;
    }
}
