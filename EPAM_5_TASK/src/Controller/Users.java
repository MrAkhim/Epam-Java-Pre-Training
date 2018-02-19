package Controller;

import Model.Cars.Automobile.Automobile;
import Model.Cars.Automobile.CarBuilder;
import Model.Cars.Container.MyArrayList;

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
            Automobile automobile = new Automobile(scanner.next(), scanner.next(), scanner.nextDouble(),
                    scanner.nextDouble(), scanner.nextInt(), scanner.nextInt());
            al.add(CarBuilder.createCar(new Automobile(scanner.next(), scanner.next(), scanner.nextDouble(),
                    scanner.nextDouble(), scanner.nextInt(), scanner.nextInt())));
        }
        System.out.println(al.size());
        return al;
    }
}
