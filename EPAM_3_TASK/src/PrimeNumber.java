import java.util.Scanner;

class PrimeNumber {

    static void print() {
        System.out.println("Enter the number: ");
        int number = readData();
        System.out.println("Is your number is prime? -----> " + isPrimeNumber(number));
    }

    private static int readData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
