package Model.cars.transport;

public abstract class Transport {

    private String ID;
    private String model;

    protected Transport() {
    }

    protected Transport(String model, String ID) {
        this.model = model;
        this.ID = ID;
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
        return !(!extra.model.equals(model) || !extra.ID.equals(ID));
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 33 + ID.hashCode() + model.hashCode();
        return hash;
    }
}
