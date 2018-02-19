package Controller;

import Model.Cars.Automobile.Automobile;
import Model.Cars.TaxiStation;
import View.View;

import java.io.FileNotFoundException;

public class Controller {
    public static void main(String[] args) throws FileNotFoundException {
        TaxiStation ts = new TaxiStation("C://EPAM_5_TASK//files//CarRange.txt");
        View.print("After Reading file: ");
        View.print(ts.toString() + "\n");
        ts.addCar(new Automobile("BMW", "30489498", 45, 5, 4, 4));
        View.print("After adding new car: ");
        View.print(ts.toString() + "\n");
        ts.addCars(new Automobile("BMW", "65478PO", 75, 577, 25, 4),
                new Automobile("BMW_Power", "98413", 43, 595, 4, 4),
                new Automobile("OPEL_VIVARO", "UGKF45UJ", 45, 5, 4, 4));
        View.print("After adding 3 cars: ");
        View.print(ts.toString() + "\n");
        ts.addCarInPosition(3, new Automobile("BMW", "AE3876QA", 123, 12564, 4, 4));
        View.print("After adding a car to Position: ");
        View.print(ts.toString() + "\n");
        ts.removeCarFromPosition(3);
        View.print("After removing car from position: ");
        View.print(ts.toString() + "\n");
        Automobile automobile = new Automobile("BMW", "AE3876QR", 12358, 12564, 4, 4);
        ts.addCarInPosition(4, automobile);
        View.print("\nCheck TaxiPark contains car: ");
        View.print(ts.checkCarInTaxiPark(automobile));
        View.print("\nCar in position: ");
        View.print(ts.getCarFromPosition(6).toString());
        View.print("\nAfter deleting all cars: ");
        View.print(ts.deleteAllCars());
        ts.addCars(new Automobile("BMW_Usual", "II6547PO", 787, 54, 25, 4),
                new Automobile("BMW_Power", "QW9841AS", 410, 595, 4, 4),
                new Automobile("OPEL_Vivaro", "UQ2222MN", 45, 5, 4, 4));
        View.print("\nAfter adding 3 cars: ");
        View.print(ts.toString() + "\n");
        View.print("\nPrice of TaxiPark: ");
        View.print(ts.countPriceTaxiPark());
        View.print("\nMax Price in TaxiPark: ");
        View.print(ts.countMaxPriceTaxiPark());
        View.print("\nMin Price in TaxiPark: ");
        View.print(ts.countMinPriceTaxiPark());
    }
}
