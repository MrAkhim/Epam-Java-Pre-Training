package Model.cars.automobile;

import Model.cars.transport.Transport;

import java.util.Comparator;

public class Automobile extends Transport implements Comparable<Automobile> {
    private int price;
    private double fuelConsumption;
    private int doors;
    private double extraInformation;


    public Automobile() {
    }

    @Override
    public int compareTo(Automobile element) {
        int res=0;
        if (price < element.price) {res=-1;  }
        if (price > element.price){res=1;}
        return res;
    }


    public Automobile(String model, int carID, double fuelConsumption, int doors) {
        super(model, carID);
        this.fuelConsumption = fuelConsumption;
        this.doors = doors;
        this.extraInformation = 0.0;
        price = 0;
    }

    public Automobile(String model, int carID, double fuelConsumption, int doors, double extraInformation) {
        super(model, carID);
        this.fuelConsumption = fuelConsumption;
        this.doors = doors;
        this.extraInformation = 0.0;
        price = 0;
        this.extraInformation = extraInformation;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getExtraInformation() {
        return extraInformation;
    }

    public void setExtraInformation(double extraInformation) {
        this.extraInformation = extraInformation;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getDoors() {
        return doors;
    }

    protected void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return super.toString() + "\t Price: " + price + "\t Max Fuel: " + fuelConsumption + "\t Doors:" + doors;
    }

    @Override
    public boolean equals(Object object) {
        if ((object == null) || getClass() != object.getClass()) {
            return false;
        }
        Automobile extra = (Automobile) object;
        return !(!super.equals(extra) || extra.getFuelConsumption() != fuelConsumption || extra.getDoors() != doors);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (int) fuelConsumption + doors;

    }
}

