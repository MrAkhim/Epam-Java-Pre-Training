package Controller;

import Model.cars.automobile.Automobile;
import Model.cars.TaxiStation;
import Model.cars.typesOfCars.CarrierCar;
import Model.cars.typesOfCars.HatchbackCar;
import Model.cars.typesOfCars.SedanCar;
import Model.cars.typesOfCars.TransporterCar;
import View.View;

import java.io.FileNotFoundException;

import static Model.cars.utility.CarBuilder.createCar;

public class Controller {
    public static void main(String[] args) throws FileNotFoundException {
        TaxiStation ts = new TaxiStation("C://EPAM_5_TASK//files//CarRange.txt");

        View.print("After Reading file: ");
        View.print(ts.toString() + "\n");

        View.print("After adding new car: ");
        ts.addCar(createCar(new Automobile("BMW", "30489498", 45, 4)));
        View.print(ts.toString() + "\n");

        View.print("After adding 3 cars: ");
        ts.addCars(createCar(new Automobile("BMW", "65478PO", 577, 4)),
                createCar(new Automobile("BMW_Power", "98413", 595, 4)),
                createCar(new Automobile("OPEL_VIVARO", "UGKF45UJ", 45, 4)));
        View.print(ts.toString() + "\n");

        View.print("After adding a car to Position: ");
        ts.addCarInPosition(3, createCar(new Automobile("BMW", "AE3876QA", 12564, 4)));
        View.print(ts.toString() + "\n");

        View.print("After removing car from position: ");
        ts.removeCarFromPosition(3);
        View.print(ts.toString() + "\n");

        View.print("\nCheck TaxiPark contains car: ");
        Automobile automobile = new Automobile("BMW", "AE3876QR", 12564, 4);
        ts.addCarInPosition(4, createCar(automobile));
        View.print(ts.checkCarInTaxiPark(automobile));

        View.print("\nCar in position: ");
        View.print(ts.getCarFromPosition(6).toString());

        View.print("\nAfter deleting all cars: ");
        View.print(ts.deleteAllCars());

        View.print("\nAfter adding 3 cars: ");
        ts.addCars(createCar(new Automobile("BMW_Usual", "II6547PO", 78717, 4, 581)),
                createCar(new Automobile("BMW_Power", "QW9841AS", 1000, 4, 45541)),
                createCar(new Automobile("OPEL_Vivaro", "UQ2222MN", 2545, 4, 545454)));
        View.print(ts.toString() + "\n");

        View.print("After adding 3 cars: ");
        ts.addCars(new SedanCar("Opel_Super", "AS9999QA", 1200, 35421.45, 5, true),
                new HatchbackCar("BMW_Quadro", "SW2546PO", 1000, 15324.48, "Password", false),
                new CarrierCar("Mazda_Alfa", "LK1234WW", 1500, 5, 47205.9, 8),
                new TransporterCar("BMW_Omega", "98413", 1400, 44927,58000.49, 3));
        View.print(ts.toString() + "\n");

        View.print("\nPrice of TaxiPark: ");
        View.print(ts.countPriceTaxiPark());

        View.print("\nMax Price in TaxiPark: ");
        View.print(ts.countMaxPriceTaxiPark());

        View.print("\nMin Price in TaxiPark: ");
        View.print(ts.countMinPriceTaxiPark());

    }
}
