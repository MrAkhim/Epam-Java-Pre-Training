package Controller;

import Model.cars.TaxiStation;

import Model.cars.typesOfCars.CarrierCar;
import Model.cars.typesOfCars.TransporterCar;
import Model.cars.utility.CarBuilder;
import View.View;

import java.io.FileNotFoundException;
import java.util.Random;


public class Controller {
    public static void main(String[] args)  {
        TaxiStation ts = new TaxiStation();
        int number = 10;
        for(int i = 0; i< number; i++){
            ts.addCar(CarBuilder.createCar());
        }

        View.print("After Creation TaxiStation: ");
        View.print(ts.toString() + "\n");

        View.print("After adding new car: ");
        ts.addCar(new CarrierCar("BMW", 30489498, 4500, 4, 25000, 10));
        View.print(ts.toString() + "\n");


        View.print("After adding a car to Position: ");
        ts.addCarInPosition(3, new CarrierCar("SKODA", 11111, 4500, 4, 25400, 7));
        View.print(ts.toString() + "\n");

        View.print("After removing car from position: ");
        ts.removeCarFromPosition(3);
        View.print(ts.toString() + "\n");

        View.print("\nCheck TaxiPark contains car: ");
        TransporterCar automobile = new TransporterCar("BMW", 38767, 12564, 14500,30000,2);
        ts.addCarInPosition(4, automobile);
        View.print(ts.checkCarInTaxiPark(automobile));
        View.print(ts.toString() + "\n");


        View.print("\nCar in position: ");
        View.print(ts.getCarFromPosition(6).toString());


        View.print("\nPrice of TaxiPark: ");
        View.print(ts.countPriceTaxiPark());

        View.print("\nMax Price in TaxiPark: ");
        View.print(ts.countMaxPriceTaxiPark());

        View.print("\nMin Price in TaxiPark: ");
        View.print(ts.countMinPriceTaxiPark());

    }
}
