import java.util.Scanner;

class Task2_1 {
    private static int age;

    private static int amountOfHeads(int age) {
        if (age < 200) {
            return age * 3 + 3;
        } else if (age < 300) {
            return 199 * 3 + (age - 199) * 2 + 3;
        } else
            return 199 * 3 + 100 * 2 + (age - 299) + 3;
    }

    private static int amountOfEyes(int age) {
        return amountOfHeads(age) * 2;
    }

    static void print() {
        readData();
        System.out.println("\nHow much heads and eyes has a dragon, whose age is " + age + "?");
        System.out.println("The amount of heads of " + age + "-aged dragon is " + amountOfHeads(age));
        System.out.println("The amount of eyes of " + age + "-aged dragon is " + amountOfEyes(age));
    }

    private static void readData() {
        System.out.println("\nEnter the age of your dragon: ");
        Scanner in = new Scanner(System.in);
        age = in.nextInt();
    }
}
