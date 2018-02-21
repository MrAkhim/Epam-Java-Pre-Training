package Controller;

import Model.cars.automobile.Automobile;
import Model.cars.utility.CarBuilder;
import Model.cars.container.MyArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Users {
    public static MyArrayList<Automobile> readCars(String filePath) throws FileNotFoundException {
        MyArrayList<Automobile> al = new MyArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        Pattern p = Pattern.compile("(;+)|([\r\n]+)");
        scanner.nextLine();
        scanner.useDelimiter(p);
        while (scanner.hasNext()) {
            al.add(CarBuilder.createCar(scanner.next(), scanner.next(), scanner.nextDouble(),
                    scanner.nextDouble(), scanner.nextInt()));
        }
        return al;
    }
}
