import java.util.Scanner;

class GCDNumberLCM {
    static void print() {
        System.out.println("Enter the first number: ");
        int number1 = readData();
        System.out.println("Enter the second number: ");
        int number2 = readData();
        System.out.println("GreatestCommonDivisor of your numbers -----> " + GreatestCommonDivisor(number1, number2));
        System.out.println("LeastCommonMultiple of your numbers -----> " + LeastCommonMultiple(number1, number2));
    }

    private static int readData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int GreatestCommonDivisor(int number1, int number2) {
        if (number1 != 0) {
            return GreatestCommonDivisor(number2 % number1, number1);
        } else {
            return number2;
        }
    }


    private static int LeastCommonMultiple(int number1, int number2) {
        return ((number1 / GreatestCommonDivisor(number1, number2)) * number2);
    }
}
