import java.util.Scanner;

class MaxDigit {
    static void print() {
        System.out.println("Enter the number: ");
        int number = readData();
        System.out.println("Max Digit of your number is -----> " + getMaxDigitNumber(number));
    }

    private static int readData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getMaxDigitNumber(int number) {
        int absNumber = Math.abs(number);
        int maxDigit = number % 10;
        absNumber /= 10;
        while (absNumber > 0) {
            if (maxDigit < absNumber % 10) {
                maxDigit = absNumber % 10;
            }
            absNumber /= 10;
        }
        return maxDigit;
    }
}
