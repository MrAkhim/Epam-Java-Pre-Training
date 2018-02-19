package Model.Cars;

import Controller.Users;
import Model.Cars.Automobile.Automobile;
import Model.Cars.Container.MyArrayList;
import java.io.FileNotFoundException;

import static Model.Cars.Automobile.CarBuilder.createCar;

public class TaxiStation extends MyArrayList {

    private MyArrayList<Automobile> carPool;

    public TaxiStation(String fileName) throws FileNotFoundException {
      carPool = Users.readCars(fileName);
    }

    public double countPriceTaxiPark(){
        double price =0;
        for(int i=0; i< countCarsInTaxiPark();i++){
            price+=carPool.get(i).getPrice();
        }
        return price;
    }

    public double countMaxPriceTaxiPark(){
        double maxPrice = carPool.get(0).getPrice();
        for(int i=1; i< countCarsInTaxiPark();i++){
            if(maxPrice<carPool.get(i).getPrice()){
                maxPrice = carPool.get(i).getPrice();
            }
        }
        return maxPrice;
    }

    public double countMinPriceTaxiPark(){
        double minPrice = carPool.get(0).getPrice();
        for(int i=1; i< countCarsInTaxiPark();i++){
            if(minPrice>carPool.get(i).getPrice()){
                minPrice = carPool.get(i).getPrice();
            }
        }
        return minPrice;
    }

    public MyArrayList<Automobile> getCarPool() {
        return carPool;
    }

    public int countCarsInTaxiPark(){
        return carPool.size();
    }
    public void addCar(Automobile element) {

        carPool.add(createCar(element));
    }
    public void addCars(Automobile... elements) {
        for (Automobile element : elements) {
            carPool.add(createCar(element));
        }
    }
    public void addCarInPosition(int index, Automobile element) {
        carPool.add(index,createCar(element));
    }
    public String deleteAllCars() {
        carPool.clear();
        return "All cars are deleted";
    }
    public Automobile getCarFromPosition(int index) {
       return carPool.get(index);
    }
    public void removeCarFromPosition(int index) {
       carPool.remove(index);
    }
    public boolean checkCarInTaxiPark(Automobile element) {
        return carPool.containsElement(element);
    }
    @Override
    public String toString() {
       return getCarPool().toString();
    }
    @Override
    public boolean equals(Object object) {
       return getCarPool().equals(object);
    }
    @Override
    public int hashCode() {
       return getCarPool().hashCode();
    }
}